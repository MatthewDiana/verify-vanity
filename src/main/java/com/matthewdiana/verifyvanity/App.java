package com.matthewdiana.verifyvanity;


import com.matthewdiana.verifyvanity.checkers.StateChecker;
import com.matthewdiana.verifyvanity.checkers.states.NewYorkChecker;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

/**
 * Hello world!
 *
 */

@SpringBootApplication
public class App {

    public static void main(String[] args) {

        SpringApplication.run(App.class, args);

    }

}