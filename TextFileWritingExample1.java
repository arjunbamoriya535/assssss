import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TextFileWritingExample1  {
	final static Charset ENCODING=StandardCharsets.UTF_8;
   public static void main(String... args) throws IOException {
	
	//File obj=new File("D:/file.txt");
	/*Scanner sc=new Scanner(System.in);
	
	
	System.out.println("Enter the goodie name");
	String name=sc.next();
	
	System.out.println("Enter the goodi price");
	int price=sc.nextInt();
	
	try {
		'
		  FileWriter writer = new FileWriter("MyFile.txt", true);
          writer.write(name+":"+price);
          writer.write("\n");
         
          writer.close();
	
		
	} catch (Exception e) {
		// TODO: handle exception
	}*/
	
	
	List<String> inlines=Files.readAllLines(Paths.get("sample_input.txt"),ENCODING);
    List<String> outline=new  ArrayList<String>();
  
   for(String line :inlines) {
	   String[] result=line.split("");
	   outline.add(result[1]+""+result[0]);
	   
   }
   
   Files.write(Paths.get("sample_output.txt"), outline,ENCODING);
   }

	
	}
	
 
   
   
   
   
	 
	