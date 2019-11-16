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
        U1 u1Rocket = new U1();
            int size = loadItems().size();
            for (int w = 0; w < size;) {
                if(u1Rocket.canCarry((Item) loadItems().get(w))) {
                    u1Rocket.carry((Item) loadItems().get(w));
                    u1Rocket.weightOfCargo((Item) loadItems().get(w));
                    loadItems().remove(w);}
                    else {
                     loadU1().add(u1Rocket);}

                    if (size == 0) {
                        needNextU1 = false;}
                    }

            }
                return loadU1();
            }



           }






