/**
 * Template
 * COMP 1020
 * Lab 5 Bronze Exercise
 */
import java.io.*;
import java.util.Scanner;
public class TemplateLab5Bronze {
  
  static final String INPUT_FILE = "testLab5Bronze.txt";
  static final String OUTPUT_FILE = "outputLab5Bronze.txt";
  
  public static void main(String[] args) {
     BufferedReader fileIn;
     String lineIn;
     Scanner lineScanner;
     PrintWriter outFile;
     try {
       outFile = new PrintWriter(new FileWriter("outputLab5Bronze.txt"));
       fileIn = new BufferedReader(new FileReader("testLab5Bronze.txt"));
       lineIn = fileIn.readLine();
          int i=1;
       while(lineIn != null) {
       
            
            System.out.println(i+ ": "+lineIn);
            outFile.println(i+": "+lineIn);
            i++;
            lineIn=fileIn.readLine(); 
           
   
       }
       fileIn.close();
       outFile.close();
       
     
     }
     catch(IOException ioe) {
     
        System.out.println(ioe.getMessage());
     }
     //catch(IOException e){
       //  System.out.println(e.getMessage());
       // }


  }//main
  
}//TemplateLab5Bronze
