public class U1 extends Rocket {
    int cost = 100;
    int rocketWeight = 10000;
    int maxWeight = 18000; //maxmalna waga statku z
    int maxCargo = 8000;
    int acctualCargo = 0;
    double launchExplosion = 0.05 * (weightOfCargo() / maxCargo);
    double landCrash = 0.01 * (weightOfCargo() / maxCargo);

    //override launch



    public boolean launch() {
        if (launchExplosion >= 1) {
            return false;
        }
        else {
            return true;
        }
    }

    public boolean land() {
        if(landCrash >= 1) {
            return false;
        }
        else {
            return true;}

    }

    @Override
    public boolean canCarry(Item item) {
        return super.canCarry(item);
    }

    @Override
    public double carry(Item item) {
        return super.carry(item);
    }

    @Override
    public int weightOfCargo() {
        return super.weightOfCargo();

    }


}


