package com.company.Games.Hangman;

import java.io.FileWriter;
import java.io.IOException;

public class CreationOfGameProfile {
    public static void createProfile (String username) {
        try {
            if (!username.equals("Anonymous")) {
                FileWriter myWriter = new FileWriter("Root/" + username.toUpperCase() + "_filename.txt");
                myWriter.write(username + "thanks for playing");
                myWriter.close();
                System.out.println("Successfully wrote to the file");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}