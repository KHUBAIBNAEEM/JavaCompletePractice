package List;

import java.util.ArrayList;
import java.util.List;

public class ListOccurenceRemove {
    public static void main(String... args) {
        List<String> Cars =  new ArrayList<String>();
        Cars.add("Honda");
        Cars.add("BMW");
        Cars.add("Ferrari");
        Cars.add("Mustang");
        Cars.add("Toyota");
        Cars.add("Honda");
        System.out.println(Cars.indexOf("Honda"));
        System.out.println("_________________________________________");
        Cars.remove("Honda");
        Cars.remove(4);
        System.out.println("_________________________________________");
        System.out.println("LIST: ");
        for (String c : Cars){
            System.out.println(c);
        }

        
    }

}
