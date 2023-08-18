package project_work.app;

import java.util.List;

public interface ConnectorNumberAndWordWithEnding {
    String numberAndWorldWithEnding(List<Integer> threeDigitNumbers,
                                    int numberPosition,
                                    String word,
                                    String ending1,
                                    String ending2_4,
                                    String ending5_19,
                                    WordGender wordGender);
}
