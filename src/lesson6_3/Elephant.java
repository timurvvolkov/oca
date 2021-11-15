package lesson6_3;

public class Elephant implements WalksOnFourLegs, HasTrunk, Herbivore {

    @Override
    public void doSmth() {

    }
}

interface WalksOnFourLegs {

    public void doSmth();
}

interface HasTrunk {

}

interface Herbivore {

}
