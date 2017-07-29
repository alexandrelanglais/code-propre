package fr.demandeatonton;

import java.io.File;
import java.io.IOException;

public class CommentaireIncomprehensible {

    static void readConfigurationFile() {
        File f = new File("config.properties");
        if (!f.exists()) {
            // le fichier n'a pas été trouvé
            // mais il le sera plus tard...
        }
    }

    public static void main(String[] args) throws IOException {
        readConfigurationFile();
    }
}
