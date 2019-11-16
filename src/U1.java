public class U1 extends Rocket {
    int cost = 100;
    int rocketWeight = 10000;
    int maxWeight = 18000; //maxmalna waga statku z
    int maxCargo = 8000;
    int acctualCargo = 0;
    double launchExplosion = 0.05 * (weightOfCargo() / maxCargo);
    double landCrash = 0.01 * (weightOfCargo() / maxCargo);

    private double weightOfCargo() {
        int sumCargo = acctualCargo + Item.weight;
        sumCargo = acctualCargo;
        return sumCargo;
    }

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


