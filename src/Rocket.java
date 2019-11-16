public class Rocket implements SpaceShip {

    String name;
    int cost;
    int rocketWeight;
    int maxWeight; //maxmalna waga statku z łądunkiem
    int launchExplosion;
    int landCrash;


    public boolean launch() {
        return true;
    }

    public boolean land() {
        return true;
    }

    public boolean canCarry(Item item) {
        if (rocketWeight + Item.weight <= maxWeight){
        return true;
    }
        else {
            return false;}
        }

    public double carry(Item item) {
       double sum = Item.weight + rocketWeight;
    return sum;
    }
}
