package fr.demandeatonton;

import java.io.IOException;

public class CommentaireTodoFixme {

    // TODO Faire fonctionner cette fonction
    static void jeMarchePasBien() {
        throw new RuntimeException();
    }

    // FIXME Virer cette merde
    static void jeFaisPlanterLappli() {
        System.exit(-1);
    }
    public static void main(String[] args) throws IOException {
        jeMarchePasBien();
        jeFaisPlanterLappli();
    }
}
