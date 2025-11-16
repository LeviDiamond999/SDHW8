import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class App {
    public static void main(String[] args){
    //do you need something to start?
    List<String> listy = new ArrayList<String>();
    File inputfile = new File("file.txt"); //the name of the file goes into the new file you are creating
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
    }
    }