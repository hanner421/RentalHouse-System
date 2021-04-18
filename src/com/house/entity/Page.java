package com.house.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author chriy
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Page {

    private int page;

    private int limit;

    private int userId;

    private String publisher;

    public int getPage() {
        return page;
    }

    public int getLimit() {
        return limit;
    }

    public int getUserId() {
        return userId;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public Page(int page, int limit, int userId, String publisher) {
        this.page = page;
        this.limit = limit;
        this.userId = userId;
        this.publisher = publisher;
    }

    public Page() {
    }
}
