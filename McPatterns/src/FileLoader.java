import java.io.*;
import java.util.*;

class FileLoader {
    static void  loadMenuItems(){
            //read text file & create an arraylist of menu items
            File inputFile = new File("menu.txt");
            //System.out.println(inputFile.exists());
            //Scanner in = null;
            
            try{
                Scanner in = new Scanner(inputFile);
                while(in.hasNextLine()){
                    String line = in.nextLine();
                    System.out.println(line);
                    
                    // Replace with your actual code.
                    /*
                    String[] products = line.split("\\|"); //Item|Cost
                    String name = products[0];
                    double cost = Double.parseDouble(products[1]);
                    MenuModel theItem = new MenuModel(name, cost);
                    productList.add(theItem);
                    */
            } 
        } catch (Exception ex) {
                ex.printStackTrace();
                System.out.println("Unable to load order from " + inputFile + ".");
        }
    }
}