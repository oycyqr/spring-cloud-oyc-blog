package com.oyc.blog.search.service.impl;

import com.oyc.blog.search.document.EsBlog;
import com.oyc.blog.search.repository.EsBlogRepository;
import com.oyc.blog.search.service.EsBlogService;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.search.fetch.subphase.highlight.HighlightBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.data.elasticsearch.core.aggregation.AggregatedPage;
import org.springframework.data.elasticsearch.core.query.NativeSearchQueryBuilder;
import org.springframework.data.elasticsearch.core.query.SearchQuery;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;

/**
 * @Author: oyc
 * @Date: 2020-04-30 9:39
 * @Description: Blog服务实现类
 */
@Service
public class EsBlogServiceImpl implements EsBlogService {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private EsBlogRepository blogSearchRepository;

    @Autowired
    private ElasticsearchTemplate elasticsearchTemplate;

    @Override
    public void save(EsBlog blog) {
        blogSearchRepository.save(blog);
        logger.debug("saved");
    }

    @Override
    public void save(List<EsBlog> blogs) {
        blogSearchRepository.saveAll(blogs);
        logger.debug("saved");
    }

    @Override
    public void delete(int id) {
        blogSearchRepository.deleteById(id);
    }

    @Override
    public EsBlog getById(int id) {
        EsBlog esBlog = blogSearchRepository.findById(id).orElse(new EsBlog());
        logger.debug(esBlog.toString());
        return esBlog;

    }

    @Override
    public Iterable<EsBlog> findAll() {
        Iterable<EsBlog> all = blogSearchRepository.findAll();
        return all;
    }

    @Override
    public Page<EsBlog> getByKey(String key, Pageable pageable) {
        if (StringUtils.isEmpty(key)) {
            return blogSearchRepository.findAll(pageable);
        }
        return blogSearchRepository.findByTitleOrContentLike(key, key, pageable);
    }

    @Override
    public Page<EsBlog> getByKeyWord(String key, Pageable pageable) {
        if (StringUtils.isEmpty(key)) {
            return blogSearchRepository.findAll(pageable);
        }
        //自定义查询
        SearchQuery searchQuery = new NativeSearchQueryBuilder()
                .withQuery(QueryBuilders.matchQuery("title", key))
                .withQuery(QueryBuilders.matchQuery("content", key))
                .withPageable(pageable)
//                .withSort(SortBuilders.fieldSort("id").order(SortOrder.ASC))
                .build();
        Page<EsBlog> esBlogs = elasticsearchTemplate.queryForPage(searchQuery, EsBlog.class);
        return esBlogs;
    }


    @Override
    public Page<EsBlog> queryForPage(String key, Pageable pageable) {
        // 如果输入的查询条件为空，则查询所有数据
        if (StringUtils.isEmpty(key)) {
            return blogSearchRepository.findAll(pageable);
        }
        String preTag = "<font color='#dd4b39'>";
        String postTag = "</font>";
        SearchQuery searchQuery = new NativeSearchQueryBuilder().withQuery(
                QueryBuilders.boolQuery()
                        .should(QueryBuilders.matchQuery("title", key))
                        .should(QueryBuilders.matchQuery("content", key))
        )
                .withPageable(pageable)
                //多字段高亮
                .withHighlightFields(
                        new HighlightBuilder.Field("title").preTags(preTag).postTags(postTag),
                        new HighlightBuilder.Field("content").preTags(preTag).postTags(postTag)
                )
                .build();

        AggregatedPage<EsBlog> esBlogs = elasticsearchTemplate.queryForPage(searchQuery, EsBlog.class);

        return esBlogs;
    }
}
