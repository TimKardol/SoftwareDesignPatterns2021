package com.company;

import java.util.Arrays;
import java.util.List;

public class AnswerAdapter {

    public boolean contains (String answer) {
        // List of all possible true answers
        String[] trueWords = new String[] {"true", "yes", "oh yeah", "great", "sure", "love to", "of course", "always", "never done otherwise"};
        List<String> trueList = Arrays.asList(trueWords);

        // See if the given answer is in the list
        if (trueList.contains(answer)) {
            return true;
        }
        return false;
    }
}
