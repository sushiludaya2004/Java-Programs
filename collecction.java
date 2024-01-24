Main.java

import java.util.*;
import java.util.Collections;

public class Main{


    public static void main(String[] args){
        List newList = new ArrayList<>();
        newList.add(1);
        newList.add(4);
        newList.add(2);
        newList.add(6);
        newList.add(9);
        newList.add(8);
        newList.add(2);
        newList.add(5);
        //Collections.sort(newList,Collections.reverseOrder());
        int search = Collections.binarySearch(newList, 6);
        System.out.println(search);


       // Iterator IT = newList.listIterator();
       // while(IT.hasNext()){
       //     System.out.println(IT.next());
       // }      
    }
}
