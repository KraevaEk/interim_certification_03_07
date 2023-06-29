package task1;

import java.util.Scanner;

public class MyProgram {

    public static void main(String[] args) {

        int letterCount = 15;
        int whitespaceCount = 3;
        int lengthThreeLetter = 62;
        int lengthWhitespace = 12;
        int lengthFence = letterCount/3 * lengthThreeLetter + whitespaceCount * lengthWhitespace;
        System.out.print("Введите длину забора в см: ");
        Scanner console = new Scanner(System.in);
        int lengthUser = console.nextInt();
        if (lengthUser >= lengthFence) {
            System.out.println("Надпись поместится на забор");
        } else {
            System.err.println("Надпись не поместится на забор");
        }
    }
}
