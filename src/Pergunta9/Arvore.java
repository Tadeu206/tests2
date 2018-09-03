package Pergunta9;

import java.util.Objects;

public class Arvore {

    private BinaryTree binaryTree;


    public int sum() {
        return sum(binaryTree);
    }

    private int sum(BinaryTree binaryTree) {

        if (binaryTree == null) {
            return 0;
        }
    }

}