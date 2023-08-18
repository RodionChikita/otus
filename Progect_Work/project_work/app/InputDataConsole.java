package project_work.app;

import java.util.Scanner;

public class InputDataConsole implements InputData {

    public int inputData() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}
