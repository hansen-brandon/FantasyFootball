package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class ReadingTeamData {

    public ReadingTeamData() {

    }

    public void readQBData(){
        try {
            File myObj = new File("C:\\Users\\brans\\Desktop\\QB Data.csv");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

    }

    public void readRBData(){

    }

    public void readWRData(){

    }

    public void readTEData(){

    }

    public void readKData(){

    }

    public void readDEFData(){

    }


}
