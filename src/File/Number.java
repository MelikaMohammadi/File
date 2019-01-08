package File;

import java.io.*;
import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;


public class Number {
    public  void  writeNumber() throws IOException {
        Random random = new Random();

        java.io.File file = new java.io.File("Rand.TXT");
        FileWriter fileWriter = new FileWriter(file);

        for (int i = 1; i <= 100000; i++) {

            fileWriter.write( random.nextInt(500000)+"\r\n");
        }

        fileWriter.close();
    }


    public void readNumber(int  adad) throws IOException {
        File file = new File("Rand.TXT");
        Scanner scanner = new Scanner(file);
          int lineN=0;
          boolean f=false;
String num = Integer.toString(adad);
          Mapsearch mapsearch =new Mapsearch();
        while (scanner.hasNext()) {
            final String lineFromFile = scanner.nextLine();
            lineN++;
                if (lineFromFile.equals(num)) {
                    mapsearch.foundMap(adad, lineN);
                    System.out.println("cash Miss");
                    System.out.println("but I found " + adad + "its in line" + lineN + "in file");
                    f = true;
                    break;
                }
            }


        if (f ==false) {
                mapsearch.notFoundMap(adad);
                System.out.println("Not Found-Cash miss");

            }
        }

    }


