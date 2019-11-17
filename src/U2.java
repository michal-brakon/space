public class U2 extends Rocket {
    int cost = 120;
    int rocketWeight = 18000;
    int maxWeight = 29000; //maxmalna waga statku z
    int maxCargo = 11000;
    int cargoWeight = 0;
    int cargoAndRocket = 0;
    double launchExplosion = 0.04 * (cargoWeight/ maxCargo);
    double landCrash = 0.08 * (cargoWeight / maxCargo);

    public boolean launch() {
        if (launchExplosion > 0.04) {
            return false;
        }
        else {
            return true;
        }
    }

    public boolean land() {
        if(landCrash > 0.08) {
            return false;
        }
        else {
            return true;}

    }
}


