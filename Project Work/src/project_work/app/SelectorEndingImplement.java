package project_work.app;

import java.util.List;

public class SelectorEndingImplement implements SelectorEnding {
    @Override
    public String worldWithEnding(List<Integer> digits,
                                  String word,
                                  String ending1,
                                  String ending2_4,
                                  String ending5_19) {

        int ones = digits.get(digits.size() - 1);
        int tens = digits.get(digits.size() - 2);
        int hundreds = digits.get(digits.size() - 3);


        String wordWithEnding = "";
        if (ones + tens + hundreds == 0){
            wordWithEnding = "";
        }else if ((ones == 0) || (ones >= 5 &&  ones < 10) || (ones + tens * 10 > 10 && ones + tens * 10 < 20)) {
            wordWithEnding = word + ending5_19 + "\s";
        }
        else if (ones == 1) {
            wordWithEnding = word + ending1 + "\s";
        } else if (ones < 5) {
            wordWithEnding = word + ending2_4 + "\s";
        }
        return wordWithEnding;
    }
}
