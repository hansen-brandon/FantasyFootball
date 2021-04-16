package com.company;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Random;


class GenerateTeam {
    ArrayList<String> randomQB = new ArrayList<>();
    ArrayList<String> randomRB = new ArrayList<>();
    ArrayList<String> randomWR = new ArrayList<>();
    ArrayList<String> randomTE = new ArrayList<>();
    ArrayList<String> randomK = new ArrayList<>();
    ArrayList<String> randomDEF = new ArrayList<>();
    ArrayList<String> randomFlex = new ArrayList<>();


    public GenerateTeam() {

    }


    public String randomQB() {
        try {
            ArrayList<String> lines = new ArrayList<>(Files.readAllLines(Paths.get("C:\\Users\\brans\\Documents\\Programming\\IntelliJ\\FantasyFootball\\QB Data.csv")));
            randomQB = new ArrayList<>();
            for (String line : lines) {
                if (line.contains(",")) {
                    randomQB.add(line.replace(",", " - "));
                } else {
                    randomQB.add(line);
                }
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        Random rand = new Random();
        return (randomQB.get(rand.nextInt(randomQB.size())));
    }

    public String randomRB() {
        try {
            ArrayList<String> lines = new ArrayList<>(Files.readAllLines(Paths.get("C:\\Users\\brans\\Documents\\Programming\\IntelliJ\\FantasyFootball\\RB Data.csv")));
            randomRB = new ArrayList<>();
            for (String line : lines) {
                if (line.contains(",")) {
                    randomRB.add(line.replace(",", " - "));
                } else {
                    randomRB.add(line);
                }
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        Random rand = new Random();
        return (randomRB.get(rand.nextInt(randomRB.size())));

    }

    public String randomWR() {
        try {
            ArrayList<String> lines = new ArrayList<>(Files.readAllLines(Paths.get("C:\\Users\\brans\\Documents\\Programming\\IntelliJ\\FantasyFootball\\WR Data.csv")));
            randomWR = new ArrayList<>();
            for (String line : lines) {
                if (line.contains(",")) {
                    randomWR.add(line.replace(",", " - "));
                } else {
                    randomWR.add(line);
                }
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        Random rand = new Random();
        return (randomWR.get(rand.nextInt(randomWR.size())));

    }

    public String randomTE() {
        try {
            ArrayList<String> lines = new ArrayList<>(Files.readAllLines(Paths.get("C:\\Users\\brans\\Documents\\Programming\\IntelliJ\\FantasyFootball\\TE Data.csv")));
            randomTE = new ArrayList<>();
            for (String line : lines) {
                if (line.contains(",")) {
                    randomTE.add(line.replace(",", " - "));
                } else {
                    randomTE.add(line);
                }
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        Random rand = new Random();
        return (randomTE.get(rand.nextInt(randomTE.size())));

    }

    public String randomK() {
        try {
            ArrayList<String> lines = new ArrayList<>(Files.readAllLines(Paths.get("C:\\Users\\brans\\Documents\\Programming\\IntelliJ\\FantasyFootball\\K Data.csv")));
            randomK = new ArrayList<>();
            for (String line : lines) {
                if (line.contains(",")) {
                    randomK.add(line.replace(",", " - "));
                } else {
                    randomK.add(line);
                }
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        Random rand = new Random();
        return (randomK.get(rand.nextInt(randomK.size())));

    }

    public String randomDEF() {
        try {
            ArrayList<String> lines = new ArrayList<>(Files.readAllLines(Paths.get("C:\\Users\\brans\\Documents\\Programming\\IntelliJ\\FantasyFootball\\DEF Data.csv")));
            randomDEF = new ArrayList<>();
            for (String line : lines) {
                if (line.contains(",")) {
                    randomDEF.add(line.replace(",", " - "));
                } else {
                    randomDEF.add(line);
                }
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        Random rand = new Random();
        return (randomDEF.get(rand.nextInt(randomDEF.size())));

    }

    public String randomFlex() {


        randomFlex.addAll(randomWR);
        randomFlex.addAll(randomRB);
        Random rand = new Random();
        return (randomFlex.get(rand.nextInt(randomFlex.size())));


    }


    public String toString() {
        return "QB: " + randomQB() + "\nRB1: " + randomRB() + "\nRB2: " + randomRB() + "\nWR1: " + randomWR() + "\nWR2: " +
                randomWR() + "\nTE: " + randomTE() + "\nFLEX: " + randomFlex() + "\nK: " + randomK() + "\nDEF: " + randomDEF();
    }


}
