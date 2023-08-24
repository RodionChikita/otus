package project_work.app;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        InputData inputData = new InputDataConsole();
        Printer printer = new PrinterConsole();
        printer.print(inputData.inputData());
    }
}
