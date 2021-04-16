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
        generateTeam();

    }


    public String randomQB() {
        try {
            ArrayList<String> lines = new ArrayList<>(Files.readAllLines(Paths.get("C:\\Users\\brans\\Desktop\\QB Data.csv")));
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
            ArrayList<String> lines = new ArrayList<>(Files.readAllLines(Paths.get("C:\\Users\\brans\\Desktop\\RB Data.csv")));
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
            ArrayList<String> lines = new ArrayList<>(Files.readAllLines(Paths.get("C:\\Users\\brans\\Desktop\\WR Data.csv")));
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
            ArrayList<String> lines = new ArrayList<>(Files.readAllLines(Paths.get("C:\\Users\\brans\\Desktop\\TE Data.csv")));
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
            ArrayList<String> lines = new ArrayList<>(Files.readAllLines(Paths.get("C:\\Users\\brans\\Desktop\\K Data.csv")));
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
            ArrayList<String> lines = new ArrayList<>(Files.readAllLines(Paths.get("C:\\Users\\brans\\Desktop\\DEF Data.csv")));
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

    public void generateTeam() {
        System.out.println("Your randomly generated team is: ");
        System.out.println("-------------------------------");
        System.out.println("QB: " + randomQB());
        System.out.println("RB1: " + randomRB());
        System.out.println("RB2: " + randomRB());
        System.out.println("WR1: " + randomWR());
        System.out.println("TE: " + randomTE());
        System.out.println("FLEX: " + randomFlex());
        System.out.println("K: " + randomK());
        System.out.println("DEF: " + randomDEF());

    }


}
