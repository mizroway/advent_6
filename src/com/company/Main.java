package com.company;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.regex.Matcher;

public class Main {

    public static void main(String[] args) throws IOException {
        ArrayList<String> input = new ArrayList<>(Files.readAllLines(Paths.get("input_6.txt")));
        Set<Character> answers = new HashSet<>();
//        Map<Integer, Set<Character>> mapa = new HashMap<>();

        int counter = 0;

        for (int i = 0; i < input.size(); i++) {

            char[] tab = input.get(i).toCharArray();
            for (char c : tab) {
                answers.add(c);

            }

            if (input.get(i).isEmpty() || i == input.size() - 1) {
//                mapa.put(counter, interMapa);
                System.out.println("answers = " + answers);
                counter += answers.size();
                System.out.println("counter = " + counter);
                answers = new HashSet<>();
            }
        }
    }
}
