public class Rocket implements SpaceShip {

    int cost; //koszt
    int rocketWeight; // waga rakiety
   public int maxWeight; //maxmalna waga statku z łądunkiem
    int maxCargo; //maksymalna waga cargo
    int cargoWeight; //waga cargo
    int cargoAndRocket; //waga załadowanego cargo
    double launchExplosion;
    double landCrash;


    public boolean launch() {

        return true;
    }

    public boolean land() {
        return true;
    }

    public boolean canCarry(Item item) {
        return (this.cargoAndRocket + item.weight) <= maxWeight;
    }

    public void carry(Item item) {
       this.cargoAndRocket = this.rocketWeight + item.weight;
       this.cargoWeight = this.cargoAndRocket - this.rocketWeight;
           }


    }





