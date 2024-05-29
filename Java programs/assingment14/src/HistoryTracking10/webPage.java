package HistoryTracking10;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;

class WebPage {
    private int pageId;
    private String url;
    private String title;
    private Date visitDate;

    public WebPage(int pageId, String url, String title, Date visitDate) {
        this.pageId = pageId;
        this.url = url;
        this.title = title;
        this.visitDate = visitDate;
    }

    public int getPageId() {
        return pageId;
    }

    public String getUrl() {
        return url;
    }

    public String getTitle() {
        return title;
    }

    public Date getVisitDate() {
        return visitDate;
    }

    @Override
    public String toString() {
        return "Page ID: " + pageId + ", URL: " + url + ", Title: " + title + ", Visit Date: " + new SimpleDateFormat("yyyy-MM-dd").format(visitDate);
    }
}