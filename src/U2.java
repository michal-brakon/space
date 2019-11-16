public class U2 extends Rocket {
    int cost = 120; // in milions
    int rocketWeight = 18000;
    int maxWeight = 29000; //maxmalna waga statku z
    int maxCargo = 11000;
    int acctualCargo = 0;
    double launchExplosion = 0.04 * (weightOfCargo() / maxCargo);
    double landCrash = 0.08 * (weightOfCargo() / maxCargo);


    private double weightOfCargo() {
        int sumCargo = acctualCargo + Item.weight;
        sumCargo = acctualCargo;
        return sumCargo;
    }

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

