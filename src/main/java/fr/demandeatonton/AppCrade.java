package fr.demandeatonton;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AppCrade {
    private static final String A = "http://google.com";
    private static final String A2 = "<title>";
    private static final String A3 = "</title>";

    public static void main(String[] args) throws IOException {
        URL a = new URL(A);
        BufferedReader b = new BufferedReader(new InputStreamReader(a.openStream()));
        String c = null;
        StringBuilder d = new StringBuilder();

        while ((c = b.readLine()) != null) {
            d.append(c);
        }

        String e = doSomeShit(d.toString());
        System.out.println(e);
    }

    private static String doSomeShit(String a) {
        String b = null;
        Pattern c = Pattern.compile(A2 + "(.*)" + A3);
        Matcher d = c.matcher(a);
        if (d.find()) {
            b = d.group(1);
        }
        return b;
    }
}
