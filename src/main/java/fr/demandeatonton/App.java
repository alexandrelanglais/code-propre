package fr.demandeatonton;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App {
    private static final String THE_URL = "http://google.com";
    private static final String OPENING_TAG = "<title>";
    private static final String CLOSING_TAG = "</title>";

    public static void main(String[] args) throws IOException {
        URL url = new URL(THE_URL);
        BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
        String line = null;
        StringBuilder sb = new StringBuilder();

        while( (line = br.readLine()) != null) {
            sb.append(line);
        }

        String head = getTitle(sb.toString());
        System.out.println(head);
    }

    private static String getTitle(String s) {
        String head = "";
        System.out.println(s);
        Pattern pattern = Pattern.compile(OPENING_TAG + "(.*)" + CLOSING_TAG);
        Matcher matcher = pattern.matcher(s);
        if(matcher.find()) {
            head = matcher.group(1);
        }
        return head;
    }
}
