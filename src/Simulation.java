import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Simulation {

    public ArrayList loadItems() throws Exception {

        Scanner s = new Scanner((new File("filepath")));
        s.useDelimiter("=");
        ArrayList<Item> itemsArray = new ArrayList();
        while (s.hasNext()) {
            String name = s.next();
            int weight = s.nextInt();

            Item newItem = new Item(name, weight);
            itemsArray.add(newItem);
            s.close();

        }
        return itemsArray;

    }



    public ArrayList<U1> loadU1() throws Exception {
            boolean needNextU1 = true;
            while(needNextU1) {
        U1 u1 = new U1();
            int size = loadItems().size();
            for (int w = 0; w < size;) {
                if(u1.canCarry((Item) loadItems().get(w))) {
                    u1.carry((Item) loadItems().get(w));
                    u1.weightOfCargo((Item) loadItems().get(w));
                    loadItems().remove(w);}
                    else {
                     loadU1().add(u1);}

                    if (size == 0) {
                        needNextU1 = false;}
                    }

            }
                return loadU1();
            }

    public ArrayList<U2> loadU2() throws Exception {
        boolean needNextU2 = true;
        while(needNextU2) {
            U2 u2 = new U2();
            int size = loadItems().size();
            for (int w = 0; w < size;) {
                if(u2.canCarry((Item) loadItems().get(w))) {
                    u2.carry((Item) loadItems().get(w));
                    u2.weightOfCargo((Item) loadItems().get(w));
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


           }






