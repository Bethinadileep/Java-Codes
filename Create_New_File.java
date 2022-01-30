//codeby : Dileep
import java.util.*;

import java.io.File;
import java.io.IOException;
import java.io.FileNotFoundException;

public class File_Handling {

	public static void main(String[] args) {
		//Creating an Object of a File
		File obj = new File("E:\\backup\\Learning_Java\\File_Handling\\javafile.txt");
		try {
			if(obj.createNewFile()) {
				System.out.println("The "+obj.getName()+" is Created a New File Successfully");
			}
			else {
				System.out.println("File is Already is Exist in the directory..");
			}
		}
		catch(IOException exception) {
			System.out.println("An Unexpected Error is Occurred");
			
			exception.printStackTrace();
		}
	}

}
