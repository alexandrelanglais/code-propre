package fr.demandeatonton;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CommentaireVersusNomDeFonction {
    static class Employee {
        static final float MIN_PRODUCTIVITY_FOR_BONUS = .8f;
        String name;
        int yearsWorked;
        float productivity;

        boolean isEligibleForBonus() {
            return productivity > Employee.MIN_PRODUCTIVITY_FOR_BONUS &&
                    yearsWorked > 10;
        }
    }

    public static void main(String[] args) throws IOException {
        Employee employee = new Employee();

        // On vérifie si l'employé peut toucher sa prime
        if (employee.productivity > Employee.MIN_PRODUCTIVITY_FOR_BONUS &&
                employee.yearsWorked > 10) {

        }

        if (employee.isEligibleForBonus()) {

        }
    }
}
