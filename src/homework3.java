import java.util.Random;
import java.util.Scanner;

public class homework3 {
//    1. Написать программу, которая загадывает случайное число от 0 до 9, и пользователю дается
//    3 попытки угадать это число. При каждой попытке компьютер должен сообщить больше ли указанное
//    пользователем число чем загаданное, или меньше.
//    После победы или проигрыша выводится
//    запрос – «Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет).


    static Scanner sc = new Scanner(System.in);
    static Random random = new Random();

    public static void main(String[] args) {
        superGame();
//        predictWord();
    }

    public static void superGame() {
        int max = 10;
        int question;
        do {
            int mystery = random.nextInt(max);
            boolean prove = false;
            for (int i = 0; i < 3; i++) {
                System.out.println("Необходимо загадать число в интервале от 0 до " + max);
                int gamerNumber = sc.nextInt();
                if (gamerNumber > mystery) {
                    System.out.println("gamerNumber > mystery");
                }
                if (gamerNumber < mystery) {
                    System.out.println("gamerNumber < mystery");
                }
                if (gamerNumber == mystery) {
                    prove = true;
                    break;
                }
            }
            if (prove) {
                System.out.println("Victory");
            } else {
                System.out.println("Game over");
            }
            System.out.println("Repeat? 1 - Yes");
            question = sc.nextInt();
        }
        while (question == 1);
        System.out.println("Thank You!");
    }


//2.Задание

    public static void predictWord() {
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot",
                "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango",
                "mushroom", "nut", "olive", "pea", "peanut", "pear",
                "pepper", "pineapple", "pumpkin", "potato" };
        int mystery = random.nextInt(words.length);
        System.out.println(words[mystery]);
        System.out.println("Guess Word!");
        String question = sc.nextLine();
        if (question.equals(words[mystery])) {
            System.out.println("Yes");
        } else
            for (int i = 0; i < 15; i++) {
                if (i < words[mystery].length() && i < question.length()) {
                    if (words[mystery].charAt(i) == question.charAt(i)) {

                    } else {
                        System.out.print("#");

                    }

                } else {
                    System.out.print("#");
                }

            }

    }
}
