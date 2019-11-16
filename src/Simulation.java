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



    public ArrayList loadU1() throws Exception {

            // kreowanie U1
        U1 firstRocket = new U1();

            int size = loadItems().size();
            for (int w = 0; w > size; w++) {
                firstRocket.canCarry((Item) loadItems().get(w));
                    firstRocket.carry((Item) loadItems().get(w));
                    firstRocket.isMaxWeight();
                }
            }



           }




    }

}