import java.util.HashMap;

public class Main
{
    
	public static void main(String[] args) {
	    //creating hashmap
	    HashMap<Integer, String> countries = new HashMap<>();
	    
	    //populate the HashMap
	    countries.put(1,"russia");
	    countries.put(2,"canada");
	    countries.put(3,"china");
	    countries.put(4,"USA");
	    
	    //printing hashmaps
	    System.out.println(countries);
	    
	    //Apply defaultorget functions
	    String a = countries.getOrDefault(3,"No Entry Found");
	    String b = countries.getOrDefault(5,"No Entry Found");
	    
	    System.out.println("The Values Returned for the Key = 3: "+ a);
	    System.out.println("The Values Returned for the Key = 5: "+ b);
	}
}
