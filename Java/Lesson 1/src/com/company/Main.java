package com.company;

import java.io.IOException;

public class Main extends AnswerAdapter{

    public static void main(String[] args) {
	// write your code here
        ConsoleReader reader = new ConsoleReader();
        ConsoleWriter writer = new ConsoleWriter();
        AnswerAdapter adapter = new AnswerAdapter();

        // ask questionss
        String q1 = "Do you like vegetables?";

        String good = "You are a healthy person!";
        String bad = "Maybe you should try to eat some carrots.";

        //ask question to user
        writer.write(q1);

        //read response
        Boolean ans1 = adapter.contains(reader.readLine());

        //TODO
        // the reader should accept the following values as true:
        // "true", "yes", "oh yeah", "great", "sure", "love to", "of course", "always", "never done otherwise"

        if (ans1) {
            writer.write(good);
        } else {
            writer.write(bad);
        }

        // allow user to read our response
        reader.readLine();
    }
}
