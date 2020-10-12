package com.wbl.crawl;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.Base64;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SpiderLeg {
    // We'll use a fake USER_AGENT so the web server thinks the robot is a normal web browser.
    private static final String USER_AGENT =
            "Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/535.1 (KHTML, " +
                    "like Gecko) Chrome/13.0.782.112 Safari/535.1";
    private final List<String> links = new LinkedList<>();
    private Document htmlDocument;

    /**
     * This performs all the work. It makes an HTTP request, checks the response, and then gathers
     * up all the links on the page. Perform a searchForWord after the successful crawl
     *
     * @param url - The URL to visit
     * @return whether or not the crawl was successful
     */
    public boolean crawl(String url) {
        String strUserId = "";
        String strPasword = "";
        /*
         * User id, password string needs to be in
         * userid:password format with no space
         * in between them
         */
        String authString = strUserId + ":" + strPasword;

        //encode the authString using base64
        String encodedString =
                new String(Base64.getEncoder().encode(authString.getBytes()));

        try {
            Connection connection = Jsoup.connect(url).userAgent(USER_AGENT);
            //.header("Authorization", "Basic " + encodedString);
            //.header("Authorization","Basic "+"cmFtYW5hZ2FuZ2FyYW8xMUBnbWFpbC5jb206R0FOR0FyYW9ANg==");
            htmlDocument = connection.get();
            if (connection.response().statusCode() == 200) // 200 is the HTTP OK status code
            {
                System.out.println("\n**Visiting** Received web page at " + url);
            }
            if (!connection.response().contentType().contains("text/html")) {
                System.out.println("**Failure** Retrieved something other than HTML");
                return false;
            }
            Elements linksOnPage = htmlDocument.select("a[href]");
            //System.out.println("Found (" + linksOnPage.size() + ") links");
            for (Element link : linksOnPage) {
                this.links.add(link.absUrl("href"));
            }
            return true;
        } catch (IOException | IllegalArgumentException ioe) {
            // We were not successful in our HTTP request
            return false;
        }
    }

    public void searchForEmail(String searchWord, LinkedList<String> emails) {

        if (htmlDocument == null) {
            System.out.println("ERROR! Call crawl() before performing analysis on the document");
        } else {
            String input = htmlDocument.toString();

            Pattern pattern =
                    Pattern.compile("[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}", Pattern.CASE_INSENSITIVE);

            Matcher matches = pattern.matcher(input);

            while (matches.find()) {
                emails.push(matches.group());
            }
            System.out.println(emails);
        }
    }

    public List<String> getLinks() {
        return this.links;
    }
}
