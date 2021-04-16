package com.company;

//  4/15/2021 - Have to fix randomTE method and Flex method. All that's left is toString format and simple GUI.

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Random;


class ReadingTeamData {
    ArrayList<String> randomQB = new ArrayList<>();
    ArrayList<String> randomRB = new ArrayList<>();
    ArrayList<String> randomWR = new ArrayList<>();
    ArrayList<String> randomTE = new ArrayList<>();
    ArrayList<String> randomK = new ArrayList<>();
    ArrayList<String> randomDEF = new ArrayList<>();
    ArrayList<String> flex = new ArrayList<>();



    public ReadingTeamData() {
//        randomQB();
//        randomRB();
//        randomRB();
//        randomWR();
//        randomWR();
        randomFlex();
        //randomTE();
//        randomK();
//        randomDEF();

    }

//    public void readQBData(){
//        try(BufferedReader in = new BufferedReader(new FileReader("C:\\Users\\brans\\Desktop\\QB Data.csv"))){
//            String line;
//            String pair = "";
//            while((line = in.readLine())!=null){
//                pair = line.replace(",", " - ");
//
//
//
//                System.out.println(pair);
//
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
////        Random random = new Random();
////        int randomInt = random.nextInt(totalLines);
////        int count=0;
//
//    }

//    public void readQBData() {
//        try {
//            File myObj = new File("C:\\Users\\brans\\Desktop\\QB Data.csv");
//            Scanner input = new Scanner(myObj);
//            while (input.hasNext()) {
//                String[] data = input.delimiter().split(" ");
//
//                System.out.println(data);
//            }
//            input.close();
//        } catch (FileNotFoundException e) {
//            System.out.println("An error occurred.");
//            e.printStackTrace();
//        }
//
//    }

    public void randomQB() {
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
        System.out.println(randomQB.get(rand.nextInt(randomQB.size())));
    }

    public void randomRB() {
        try {
            ArrayList<String> lines = new ArrayList<>(Files.readAllLines(Paths.get("C:\\Users\\brans\\Desktop\\RB Data.csv")));
            randomRB = new ArrayList<>();
            for (String line : lines) {
                if (line.contains(",")) {
                    randomRB.add(line.replace(",", " - "));
                } else {
                    randomRB.add(line);
                }
                flex.addAll(randomRB);
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        Random rand = new Random();
        System.out.println(randomRB.get(rand.nextInt(randomRB.size())));

    }

    public void randomWR() {
        try {
            ArrayList<String> lines = new ArrayList<>(Files.readAllLines(Paths.get("C:\\Users\\brans\\Desktop\\WR Data.csv")));
            randomWR = new ArrayList<>();
            for (String line : lines) {
                if (line.contains(",")) {
                    randomWR.add(line.replace(",", " - "));
                } else {
                    randomWR.add(line);
                }
                flex.addAll(randomWR);
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        Random rand = new Random();
        System.out.println(randomWR.get(rand.nextInt(randomWR.size())));

    }

//    public void randomTE() { //Not Working
//        try {
//            ArrayList<String> lines = new ArrayList<>(Files.readAllLines(Paths.get("C:\\Users\\brans\\Desktop\\TE Data.csv")));
//            randomTE = new ArrayList<>();
//            for (String line : lines) {
//                if (line.contains(",")) {
//                    randomTE.add(line.replace(",", " - "));
//                } else {
//                    randomTE.add(line);
//                }
//            }
//        } catch (IOException e) {
//            System.out.println("An error occurred.");
//            e.printStackTrace();
//        }
//
//        Random rand = new Random();
//        System.out.println(randomTE.get(rand.nextInt(randomTE.size())));
//
//    }

    public void randomK() {
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
        System.out.println(randomK.get(rand.nextInt(randomK.size())));

    }

    public void randomDEF() {
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
        System.out.println(randomDEF.get(rand.nextInt(randomDEF.size())));

    }

    public void randomFlex() {

//        flex.addAll(randomRB);
//        flex.addAll(randomWR);
        System.out.println(flex);


//        try {
//            ArrayList<String> lines1 = new ArrayList<>(Files.readAllLines(Paths.get("C:\\Users\\brans\\Desktop\\RB Data.csv")));
//            randomRB = new ArrayList<>();
//            for (String line : lines1) {
//                if (line.contains(",")) {
//                    randomRB.add(line.replace(",", " - "));
//                } else {
//                    randomRB.add(line);
//                }
//            }
//            ArrayList<String> lines2 = new ArrayList<>(Files.readAllLines(Paths.get("C:\\Users\\brans\\Desktop\\WR Data.csv")));
//            randomWR = new ArrayList<>();
//            for (String line : lines2) {
//                if (line.contains(",")) {
//                    randomWR.add(line.replace(",", " - "));
//                } else {
//                    randomWR.add(line);
//                }
//            }
//
//            lines1.addAll(lines2);
//        } catch (IOException e) {
//            System.out.println("An error occurred.");
//            e.printStackTrace();
//        }
//
//
//        Random rand = new Random();
//        System.out.println(randomRB.get(rand.nextInt(randomRB.size())));

    }


}
