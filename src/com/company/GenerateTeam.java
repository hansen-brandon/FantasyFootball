package com.company;
/*
The way that I am generating teams within this program is I created a method for each position that reads in each position data and stores the data in ArrayLists.
After reading in each position data into ArrayList's I created a new Random object in each method that selects a random player from the specific position ArrayList.
each method returns a random player from that given position.
 */

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


    /*
    Random Flex is a method that combines all of the elements in randomWR and RondomRB and stores all of those elements in a new ArrayList.
    A flex position in fantasy football can either be a wide receiver or a running back, which is why this method was necessary when
    generating a team.
     */
    public String randomFlex() {


        randomFlex.addAll(randomWR);
        randomFlex.addAll(randomRB);
        Random rand = new Random();
        return (randomFlex.get(rand.nextInt(randomFlex.size())));


    }

    //toString Method.
    public String toString() {
        return "QB: " + randomQB() + "\nRB1: " + randomRB() + "\nRB2: " + randomRB() + "\nWR1: " + randomWR() + "\nWR2: " +
                randomWR() + "\nTE: " + randomTE() + "\nFLEX: " + randomFlex() + "\nK: " + randomK() + "\nDEF: " + randomDEF();
    }


}
