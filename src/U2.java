public class U2 extends Rocket {
    int cost = 120; // in milions
    int rocketWeight = 18000;
    int maxWeight = 29000; //maxmalna waga statku z
    int maxCargo = 11000;
    int acctualCargo = 0;
    double launchExplosion = 0.04 * (weightOfCargo() / maxCargo);
    double landCrash = 0.08 * (weightOfCargo() / maxCargo);

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

