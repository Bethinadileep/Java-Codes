import java.util.*;
public class MyClass {
    public static void main(String args[]) {
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(1,10);
        map.put(2,20);
        map.put(3,30);
        map.put(4,40);
        map.put(5,50);
        for(Map.Entry m: map.entrySet()){
            System.out.println(m.getKey()+"  "+m.getValue());
        }
        if(map.containsKey(98)){
            System.out.println("Working..");
        }
        else{
            System.out.println("Not working..");
        }
        
        
       
      
    }
}
