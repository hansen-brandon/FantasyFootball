package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

class ReadingTeamData {

    public ReadingTeamData() {
        readQBData();

    }

    public void readQBData() { //Figure out the logic of obtaining necessary data. "Clean" data.
        ArrayList<String> qbData = new ArrayList<>();
        //Have to find a way to get the data inside of the ArrayList.
        try {
            File myObj = new File("C:\\Users\\brans\\Desktop\\QB Data.csv");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNext()) {
                String data = myReader.nextLine();
                String testing = ""; //testing is the variable thats holding all of the data.
                testing += data;

                if (testing.contains(",")) { //trying to clean the data here.

                }

                System.out.println(testing);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

    }

    public void readRBData() {

    }

    public void readWRData() {

    }

    public void readTEData() {

    }

    public void readKData() {

    }

    public void readDEFData() {

    }


}
