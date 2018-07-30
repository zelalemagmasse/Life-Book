package com.lifebook.Model.News;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.lifebook.Model.News.Article;

import java.util.ArrayList;
import java.util.List;

    @JsonIgnoreProperties(ignoreUnknown = true)
    public class Articles {

        List<Article> articles;

        public Articles() {
            articles = new ArrayList<>();
        }

        public List<Article> getArticles() {
            return articles;
        }

        public void setArticles(List<Article> articles) {
            this.articles = articles;
        }
    }

