import java.io.FileWriter;
import java.util.Random;
import java.util.Scanner;
import java.io.IOException;
public class task{
    public void create(){
        //This is User Defined
        System.out.println("Hello1");
        System.out.println("Enter the Task Name");
        
        Scanner input = new Scanner(System.in);
        String a = input.nextLine();
        
        //This is user defined
        System.out.println("Enter the Task Priority");
        String b = input.nextLine();
        
        //This gives the id A random no....
        Random jam = new Random();
        int id = jam.nextInt(20);
        try{
        FileWriter bam = new FileWriter("db1.txt",true);
        bam.append("\n");
        bam.append("\t\t"+id);
        bam.append("\t\t"+b);
        bam.append("\t\t"+a);
        bam.close();
        }
        catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
          }

    }
}