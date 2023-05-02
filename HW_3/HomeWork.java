import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) {
        int correctCount = 0, wrongCount = 0;
        String[] questions = {"Question1?","Question2?", "Question3?"};
        String[][] answerOptions ={
                {"1. A1", "2. B1", "3. C1"},
                {"1. A2", "2. B2", "3. C2"},
                {"1. A3", "2. B3", "3. C3"},
                {"1. A4", "2. B4", "3. C4"},
        };
        int[] correctAnswers = {3, 1, 2};
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            for (int j = 0; j < answerOptions[i].length; j++){
                System.out.println(answerOptions[i][j]);
            }
            System.out.print("Ваш ответ: ");
            if (correctAnswers[i] == scanner.nextInt()) {
                correctCount++;
            } else
            {
                wrongCount++;
            }
            System.out.println("=".repeat(100));
        }
        System.out.println("Результат: правильно " + correctCount + ", неправильно " + wrongCount);
    }
}