package File;

import java.io.IOException;
import java.util.Scanner;

public class File {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int  adad;
        Mapsearch mapsearch = new Mapsearch();
        Number number = new Number();
        number.writeNumber();
        while (true){
            System.out.println("عدد مورد نظر کوچک تر از500000 را وارد کنید ");
            adad = scanner.nextInt();
            mapsearch.readMap(adad);


        }

    }

    }

