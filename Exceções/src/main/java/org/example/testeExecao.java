package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class testeExecao {
    public static void main(String[] args) {

        try {
            for (int i = 0; i < 4; i++) {
                System.out.println("args[" + i + "] = " + args[i]);
            }
        } catch (ArrayIndexOutOfBoundsException a) {
            System.out.println("Deu problema amigo, nao eh assim que se lê um array. Abraço");
        }
    }
}
