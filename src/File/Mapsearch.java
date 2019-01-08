package File;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Mapsearch {
    static Map<Integer, Integer> map = new HashMap();
    public void foundMap(int number,int line){
       map.put(number,line);

    }
    public void notFoundMap(int number){
        map.put(number,-1);
    }
    public void readMap(int number) throws IOException {
        if (map.containsKey(number)){
            System.out.println( map.get(number));
            System.out.println("cash Hit");
        }
        else{
            Number number1 = new Number();
            number1.readNumber(number);
        }
            }


      }


