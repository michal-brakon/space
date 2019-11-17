public class U1 extends Rocket {
    int cost = 100;
    int rocketWeight = 10000;
    int maxWeight = 18000; //maxmalna waga statku z
    int maxCargo = 8000;
    int cargoWeight = 0;
    int cargoAndRocket = 0;
    double launchExplosion = 0.05 * (cargoWeight/ maxCargo);
    double landCrash = 0.01 * (cargoWeight / maxCargo);

        public boolean launch() {
        if (launchExplosion > 0.05) {
            return false;
        }
        else {
            return true;
        }
    }

    public boolean land() {
        if(landCrash > 0.01) {
            return false;
        }
        else {
            return true;}

    }
    }


