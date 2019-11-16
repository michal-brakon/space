public class Rocket implements SpaceShip {

    int cost;
    int rocketWeight;
   public int maxWeight; //maxmalna waga statku z łądunkiem
    int maxCargo;
    int acctualCargo; //
    double launchExplosion;
    double landCrash;


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

    public int weightOfCargo() {
        int sumCargo = acctualCargo + Item.weight;
        sumCargo = acctualCargo;
        return sumCargo;
    }

    public boolean isMaxWeight () {
        if (acctualCargo + rocketWeight <= maxWeight) {return true; }
        else {return false;}
    }

}
