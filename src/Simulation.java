import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import java.util.InputMismatchException;



public class Simulation {
    public static ArrayList loadItems() throws FileNotFoundException {
File f = new File("phase-2.txt");
        ArrayList<Item> items = new ArrayList<Item>();
        int i = 0;
        Scanner s = new Scanner(f);
        while (s.hasNextLine()) {
            String line = s.nextLine();
            String[] itemsS = line.split("=");

            //String[] item = line.split("=");

            String name = itemsS[0];
            int weight = Integer.valueOf(itemsS[1]);
            Item item = new Item(name, weight);
            items.add(item);

            i++;
        }
        System.out.println("The item " + 1 + " is '" + items.get(1) + ": weights " + items.get(1) + " kg");

        return items;
    }





    public ArrayList<U1> loadU1(ArrayList <Item> itemsS) throws Exception {


        U1 u1 = new U1();
            int size = itemsS.size();
            System.out.println(itemsS);
            //System.out.println(size);
       // System.out.println(u1.cargoWeight);
            while (u1.cargoWeight < u1.maxCargo) {
            for (int w = 0; w < size; w++) {


                //// to co ponizej nie działa
                if (u1.canCarry(itemsS.get(w))); {
                  //  System.out.println("canCaryr");
                    u1.carry(itemsS.get(w));
                  //  System.out.println("carry");
                  //  System.out.println("weightofcarg");
                  //  System.out.println(w);
                  //  System.out.println(u1.cargoWeight);
                  //  System.out.println();
                }


            }
                    /*if (){
                     loadU1().add(u1);
                    System.out.println("newrocket");}

                    if (size == w) {
                        needNextU1 = false;}
                    break; */}

                return loadU1(itemsS);
}
/*

    public ArrayList<U2> loadU2() throws Exception {
        boolean needNextU2 = true;
        while(needNextU2) {
            U2 u2 = new U2();
            int size = loadItems().size();
            for (int w = 0; w < size;) {
                if(u2.canCarry((Item) loadItems().get(w))) {
                    u2.carry((Item) loadItems().get(w));
                    loadItems().remove(w);}
                else {
                    loadU2().add(u2);}

                if (size == 0) {
                    needNextU2 = false;}
            }

        }
        return loadU2();
    }
    int runSimulationU1() throws Exception{
        int totalBudgetU1 = 0;

        for (U1 u1 : loadU1()) {
            if (u1.launch()) {
                totalBudgetU1 = totalBudgetU1 + u1.cost;
            }
        }
        for (U1 u1 : loadU1()) {
            if (!(u1.land())) {
                loadU1().add(u1);
            }
        }


        return totalBudgetU1;
    }

    int runSimulationU2() throws Exception{
        int totalBudgetU2 = 0;

        for (U2 u2 : loadU2()) {
           if (u2.launch()) {
               totalBudgetU2 = totalBudgetU2 + u2.cost;
           }
        }

        for (U2 u2 : loadU2()) {
           if (!(u2.land())) {
               loadU2().add(u2);
           }
        }
       return totalBudgetU2;
    }
*/

           }






