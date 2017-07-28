package fr.demandeatonton;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AppEncoreMieux {
    private static final String THE_URL = "http://google.com";
    private static final String OPENING_TAG = "<title>";
    private static final String CLOSING_TAG = "</title>";

    public static void main(String[] args) throws IOException {
        String htmlCode = retrieveHtmlCodeFrom(THE_URL);
        String theTitle = extractTitleFromHtml(htmlCode);
        showMe(theTitle);
    }

    // J'ai besoin du code HTML de la page pour pouvoir en extraire le titre
    private static String retrieveHtmlCodeFrom(String theUrl) throws IOException {
        URL url = new URL(THE_URL);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(url.openStream()));
        String line = null;
        StringBuilder rawHtml = new StringBuilder();

        while ((line = bufferedReader.readLine()) != null) {
            rawHtml.append(line);
        }

        return rawHtml.toString();
    }

    private static String extractTitleFromHtml(String rawHtml) {
        String title = "";
        Pattern pattern = Pattern.compile(OPENING_TAG + "(.*)" + CLOSING_TAG);
        Matcher matcher = pattern.matcher(rawHtml);
        if (matcher.find()) {
            title = matcher.group(1);
        }
        return title;
    }

    private static void showMe(String that) {
        System.out.println(that);
    }
}
