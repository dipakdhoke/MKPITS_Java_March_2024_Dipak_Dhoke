package HistoryTracking10;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.Scanner;

public class HistoryTrackingSystem {
    private LinkedList<WebPage> history;
    private Scanner scanner;

    public HistoryTrackingSystem() {
        history = new LinkedList<>();
        scanner = new Scanner(System.in);
    }

    public void addWebPage(int pageId, String url, String title, Date visitDate) {
        WebPage newPage = new WebPage(pageId, url, title, visitDate);
        history.add(newPage);
        System.out.println("Web page '" + title + "' added to the history.");
    }

    public void removeWebPage(int pageId) {
        for (WebPage page : history) {
            if (page.getPageId() == pageId) {
                history.remove(page);
                System.out.println("Web page with ID " + pageId + " removed from the history.");
                return;
            }
        }
        System.out.println("No web page found with ID " + pageId + ".");
    }

    public void searchWebPageByUrl(String url) {
        for (WebPage page : history) {
            if (page.getUrl().equalsIgnoreCase(url)) {
                System.out.println("Web page found:");
                System.out.println(page);
                return;
            }
        }
        System.out.println("No web page found with URL '" + url + "'.");
    }

    public void displayWebPagesByDate(Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        boolean found = false;
        for (WebPage page : history) {
            if (sdf.format(page.getVisitDate()).equals(sdf.format(date))) {
                if (!found) {
                    System.out.println("Web pages visited on " + sdf.format(date) + ":");
                    found = true;
                }
                System.out.println(page);
            }
        }
        if (!found) {
            System.out.println("No web pages visited on " + sdf.format(date) + ".");
        }
    }

    public static void main(String[] args) throws Exception {
        HistoryTrackingSystem system = new HistoryTrackingSystem();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        system.addWebPage(1, "https://example.com", "Example Page", sdf.parse("2024-05-01"));
        system.addWebPage(2, "https://google.com", "Google", sdf.parse("2024-05-02"));
        system.addWebPage(3, "https://openai.com", "OpenAI", sdf.parse("2024-05-01"));

        System.out.println();
        system.searchWebPageByUrl("https://google.com");

        System.out.println();
        system.displayWebPagesByDate(sdf.parse("2024-05-01"));

        System.out.println();
        system.removeWebPage(2);

        System.out.println();
        system.displayWebPagesByDate(sdf.parse("2024-05-02"));
    }
}