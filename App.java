import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class App {
    public static void main(String[] args){
    File inputfile = new File("practice.txt");//the name of the file goes into the new file you are creating
    List<String> listy = new ArrayList<String>(); 
    try {
    Scanner input = new Scanner(inputfile);
    while(input.hasNext()){
        listy.add(input.nextLine());
    }
    } catch (FileNotFoundException e) {
    throw new RuntimeException(e);
    }
    //optional if you want to keep this, just to show what the indices are of the list you created
    System.out.println(listy);
    int counter = 0; //the counter is counting how many names are in the list
    for(int i=0;i<listy.size();i++){ //the for loop goes through each entry in the list
        try{ //the try function is set up so it goes through each item in the list
            Double gpa = Double.parseDouble(listy.get(i)); //this narrows it down to only doubles
            if (gpa >3.5) 
            { System.out.println(listy.get(i-1)); //the i-1 gets the name that corresponds to the gpa below it
            } 
        }
        catch(NumberFormatException e){ counter++; } //the counter is counting how many names are in the list by counting how many times the catch function is used
    }
    System.out.println("the list contains "+counter+ "Names"); //shows final number of names in the list
    }
}

    