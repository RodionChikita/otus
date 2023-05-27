import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HomeWork4 {
    public static void main(String[] args) {
        int correctCount = 0;
        int wrongCount = 0;

        Question question1 = new Question(1, "Question1?");
        Question question1 = new Question(1, "Question1?");
        Test.addQuestion(question1);
        question1.addAnswer(new AnswerOptions(1, "A1", false));
        question1.addAnswer(new AnswerOptions(2, "B1", true));
        question1.addAnswer(new AnswerOptions(3, "C1", false));
        question1.addAnswer(new AnswerOptions(4, "D1", false));
        Question question2 = new Question(2, "Question2?");
        Test.addQuestion(question2);
        question2.addAnswer(new AnswerOptions(1, "A2", false));
        question2.addAnswer(new AnswerOptions(2, "B2", false));
        question2.addAnswer(new AnswerOptions(3, "C2", true));
        question2.addAnswer(new AnswerOptions(4, "D2", false));
        Question question3 = new Question(3, "Question3?");
        Test.addQuestion(question3);
        question3.addAnswer(new AnswerOptions(1, "A3", true));
        question3.addAnswer(new AnswerOptions(2, "B3", false));
        question3.addAnswer(new AnswerOptions(3, "C3", false));
        question3.addAnswer(new AnswerOptions(4, "D3", false));

        Question[] questions = {question1, question2, question3};

        for (int i = 0; i < questions.length; i++) {
            questions[i].questionPrint();
            Scanner scanner = new Scanner(System.in);
            if (questions[i].correct(scanner.nextInt())) {
                Test.passTest();
            }
        }

        class Test {
            private static List<Question> questions = new ArrayList<>();
            private static int correctCount;
            private static int wrongCount;

            public static void passTest() {
                for (int i = 0; i < questions.size(); i++) {
                    questions.get(i).questionPrint();
                    Scanner scanner = new Scanner(System.in);
                    if (questions.get(i).correct(scanner.nextInt())) {
                        correctCount++;
                    } else {
                        wrongCount++;
                    }

                }
                System.out.println("Результат: правильно " + correctCount + ", неправильно " + wrongCount);
            }

            public static void addQuestion(Question question) {

                questions.add(question);
            }
        }

        class Question {
            private int questionNumber;
            private String questionText;
            private ArrayList<AnswerOptions> answerOptions = new ArrayList<>();


            public Question(int questionNumber, String questionText) {
                this.questionNumber = questionNumber;
                this.questionText = questionText;
            }

            public void addAnswer(AnswerOptions answerOptions) {

                this.answerOptions.add(answerOptions);
            }

            public void questionPrint() {
                System.out.println(questionNumber + ") " + questionText);
                for (int i = 0; i < answerOptions.size(); i++) {
                    answerOptions.get(i).answerPrint();
                }
            }

            public boolean correct(int answerEntered) {
                return answerOptions.get(answerEntered - 1).isCorrect();
            }


        }

        class AnswerOptions {
            private int answerNumber;
            private String answerText;

            private boolean correct;
            private Question question;


            public AnswerOptions(int answerNumber, String answer, boolean correct) {
                this.answerNumber = answerNumber;
                this.answerText = answer;
                this.correct = correct;
            }

            public void answerPrint() {

                System.out.println(" " + answerNumber + ". " + answerText);
            }

            public boolean isCorrect() {
                return correct;
            }
        }