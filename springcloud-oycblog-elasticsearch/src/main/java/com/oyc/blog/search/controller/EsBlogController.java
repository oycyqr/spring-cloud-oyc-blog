package com.oyc.blog.search.controller;

import com.alibaba.fastjson.JSON;
import com.baomidou.mybatisplus.extension.api.R;
import com.oyc.blog.api.feign.ArticleClient;
import com.oyc.blog.search.document.EsBlog;
import com.oyc.blog.search.service.EsBlogService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;


/**
 * @Description:
 * @Author oyc
 * @Date 2021/1/3 9:52 上午
 */
@RestController
@RequestMapping("blog")
public class EsBlogController {

    @Autowired
    private EsBlogService esBlogService;

    @Autowired
    private ArticleClient articleClient;

    @GetMapping
    public Object list() {
        try {
            R r = articleClient.list();
            ArrayList data = (ArrayList) r.getData();
            List<EsBlog> esBlogList = new ArrayList<>();
            data.forEach(map -> {
                // 将 Map 转换为 实体类
                EsBlog esBlog = JSON.parseObject(JSON.toJSONString(map), EsBlog.class);
                if (esBlog != null) {
                    esBlogList.add(esBlog);
                }
            });

            System.out.println(esBlogList);
            esBlogService.save(esBlogList);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return esBlogService.findAll();
    }

    @GetMapping("page")
    public R blog(HttpServletRequest request, Model model) {
        Pageable pageable = getPageByRequest(request);
        Page<EsBlog> esBlogPage = esBlogService.getByKeyWord(null, pageable);
        return R.ok(esBlogPage);
    }

    /**
     * @param key 关键字
     * @return
     */
    @RequestMapping("search")
    public R getByKey(HttpServletRequest request, String key, Model model) {
        Pageable pageable = getPageByRequest(request);
        Page<EsBlog> esBlogPage = esBlogService.queryForPage(key, pageable);
        return R.ok(esBlogPage);
    }


    /**
     * @param blog 博客文档
     * @return
     */
    @PostMapping("save")
    @ResponseBody
    public R save(EsBlog blog) {
        esBlogService.save(blog);
        return R.ok(true);
    }

    /**
     * @param id 文档id
     * @return
     */
    @GetMapping("getById")
    @ResponseBody
    public R getById(int id) {
        return R.ok(esBlogService.getById(id));
    }

    /**
     * @param key 关键字
     * @return
     */
    @GetMapping("keyWord")
    @ResponseBody
    public R getByKeyWord(HttpServletRequest request, String key) {
        Pageable pageable = getPageByRequest(request);
        return R.ok(esBlogService.getByKeyWord(key, pageable));
    }

    private Pageable getPageByRequest(HttpServletRequest request) {
        int page = StringUtils.isEmpty(request.getParameter("page")) ? 1 : Integer.parseInt(request.getParameter("page"));
        int size = StringUtils.isEmpty(request.getParameter("size")) ? 10 : Integer.parseInt(request.getParameter("size"));
        Pageable pageable = PageRequest.of(page - 1, size);
        return pageable;
    }
}
