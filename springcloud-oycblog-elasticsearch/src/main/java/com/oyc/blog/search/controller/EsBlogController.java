package com.oyc.blog.search.controller;

import com.baomidou.mybatisplus.extension.api.R;
import com.oyc.blog.api.feign.ArticleClient;
import com.oyc.blog.search.document.EsBlog;
import com.oyc.blog.search.repository.EsBlogRepository;
import com.oyc.blog.search.service.EsBlogService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * @Description:
 * @Author oyc
 * @Date 2021/1/3 9:52 上午
 */
@RestController
@RequestMapping("blog")
public class EsBlogController {

    @GetMapping("init")
    public R init() {
        return R.ok(true);
    }

    @Autowired
    private ArticleClient articleClient;

    @Resource
    private EsBlogRepository esBlogRepository;

    @Resource
    private EsBlogService searchService;

    @GetMapping("init")
    private String initBlog() {
        R r = articleClient.selectAll();
        Object data = r.getData();

        Iterable<EsBlog> blogs = esBlogRepository.findAll();
        /*List<EsBlog> esBlogs = new ArrayList<>();
        blogs.forEach(blog -> {
                    esBlogs.add(new EsBlog(blog.getId(), blog.getTitle(), blog.getContent()));
                }
        );
        searchService.save(esBlogs);*/
        return "init Success";
    }

    /**
     * @param blog 博客文档
     * @return
     */
    @PostMapping("save")
    public void save(EsBlog blog) {
        searchService.save(blog);
    }

    /**
     * @param id 文档id
     * @return
     */
    @GetMapping("getById")
    public Object getById(int id) {
        return searchService.getById(id);
    }

    /**
     * @param key 关键字
     * @return
     */
    @GetMapping("search")
    public Page<EsBlog> getByKey(HttpServletRequest request, String key) {
        Pageable pageable = getPageByRequest(request);
        return searchService.getByKey(key, pageable);
    }

    /**
     * @param key 关键字
     * @return
     */
    @GetMapping("keyWord")
    public Page<EsBlog> getByKeyWord(HttpServletRequest request, String key) {
        Pageable pageable = getPageByRequest(request);
        return searchService.getByKeyWord(key, pageable);
    }

    private Pageable getPageByRequest(HttpServletRequest request) {
        int page = StringUtils.isEmpty(request.getParameter("page")) ? 1 : Integer.parseInt(request.getParameter("page"));
        int size = StringUtils.isEmpty(request.getParameter("size")) ? 10 : Integer.parseInt(request.getParameter("size"));
        Pageable pageable = PageRequest.of(page - 1, size);
        return pageable;
    }

}
