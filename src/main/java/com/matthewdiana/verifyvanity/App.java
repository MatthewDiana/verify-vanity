package com.matthewdiana.verifyvanity;


import com.matthewdiana.verifyvanity.checkers.StateChecker;
import com.matthewdiana.verifyvanity.checkers.states.NewYorkChecker;

import java.io.IOException;

/**
 * Hello world!
 *
 */
public class App {

    public static void main(String[] args) {

        StateChecker myChecker = new NewYorkChecker("HELLO");

        try {
            System.out.println(myChecker.isAvailable());
        } catch(IOException e) {
            e.printStackTrace();
        }

    }

}