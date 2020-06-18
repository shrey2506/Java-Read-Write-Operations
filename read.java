import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner; // Import the Scanner class to read text files

public class read {
  public static void main(String[] args) throws IOException {
	 
    try {
//     
      File myObj = new File("/home/shrey/java/filename.txt");
      Scanner myReader = new Scanner(myObj);
      while (myReader.hasNextLine()) {
        String data = myReader.nextLine();
        System.out.println(data);
        if(data.isEmpty()!=true) {
        	 FileWriter myWriter = new FileWriter("/home/shrey/java/filename.txt");
        	 myWriter.write("");
             myWriter.close();
      }
        else if(data.isEmpty()) {
        	System.out.println("File is empty ");
        }
        
      }
      
      myReader.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }
}