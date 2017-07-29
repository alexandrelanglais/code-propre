package fr.demandeatonton;

import java.io.IOException;

public class CommentaireTodoFixme {

    // TODO corriger cette fonction
    static void jeMarchePasBien() {
        throw new RuntimeException();
    }

    // FIXME virer cette merde
    static void jeFaisPlanterLappli() {
        System.exit(-1);
    }

    public static void main(String[] args) throws IOException {
        jeMarchePasBien();
        jeFaisPlanterLappli();
    }
}
