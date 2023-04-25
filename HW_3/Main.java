import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int rightAnswer = 0;
        int falseAnswer = 0;

            String[][] arr = {
                    {"Quetion 1?", "A1", "B1", "C1", "D1"},
                    {"Quetion 2?", "A2", "B2", "C2"},
                    {"Quetion 3?", "A3", "B3", "C3"},
                    {"Quetion 4?", "A4", "B4", "C4"},
                    {"Quetion 5?", "A5"}
                    // arr[1][i] -- all right answers
            };
              for (int i = 0; i < arr.length; i++) {
                ArrayList<Integer> numbers = new ArrayList<>();
                numbers.add(0);
                Random r = new Random();
                while (numbers.size() < arr[i].length) {
                    int random = r.nextInt(arr[i].length);
                    if (!numbers.contains(random)) {
                        numbers.add(random);
                    }
                }
                ArrayList<Integer> rightOption = new ArrayList<>();
                for (int a = 0; a < numbers.size(); a++) {
                    if (numbers.get(a) == 1) {
                        rightOption.add(a);
                    }
                }

                System.out.println(arr[i][0]);
                for (int j = 1; j < arr[i].length; j++) {
                    System.out.println(j + ". " + arr[i][numbers.get(j)]);
                }
                System.out.println("Введите ответ в виде чисел:");
                if ((rightOption.get(0)) == (Integer.parseInt(in.nextLine()))) {
                    rightAnswer++;
                } else {
                    falseAnswer++;
                }
                numbers.clear();
                rightOption.clear();
                System.out.println("=".repeat(100));
            }



            System.out.println("Количество верных ответов: "+rightAnswer);
            System.out.println("Количество  не верных ответов: "+falseAnswer);
}
    }
