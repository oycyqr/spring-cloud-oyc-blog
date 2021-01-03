package com.oyc.blog.search.document;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;

/**
 * @Author oyc
 * @Date 2021/1/3 9:59 上午
 * @Description: Blog 文档实体类
 */
@Data
//@Document(indexName = "blog_index", type = "blog")
@Document(indexName = "blog", type = "docs", shards = 1, replicas = 0)
public class EsBlog {

    @Id
    private int id;
    /**
     * 是否索引: 看该域是否能被搜索, index = true（默认为true）
     * 是否分词: 表示搜索的时候是整体匹配还是单词匹配
     * 是否存储: 是否在页面上显示
     */
    @Field(index = true, analyzer = "ik_smart", searchAnalyzer = "ik_smart")
    private String title;

    @Field(analyzer = "ik_smart", searchAnalyzer = "ik_smart")
    private String content;

    public EsBlog() {
    }

    public EsBlog(int id, String title, String content) {
        this.id = id;
        this.title = title;
        this.content = content;
    }
}
