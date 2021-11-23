package lesson7_1;

public class CatchingTypes {

    void seeAnimal() {}

    public void visitPorcupine() {
        try {
            seeAnimal();
        } catch (AnimalsOutForAWalk e) {
            System.out.println("try back later");
        } catch (ExhibitClosed e) {
            System.out.println("not today");
        }
    }
}

class AnimalsOutForAWalk extends RuntimeException {}
class ExhibitClosed extends RuntimeException {}
class ExhibitClosedForLunch extends ExhibitClosed {}

class VisitAnimals {

    void seeAnimal() {}

    public void visitMonkeys() {
        try {
            seeAnimal();
        } catch (ExhibitClosedForLunch e) {
            System.out.println("try back later");
        } catch (ExhibitClosed e) {
            System.out.println("not today");
        }
    }

    public void visitSnakes() {
        try {
            seeAnimal();
        } catch (ExhibitClosed e) {
            System.out.println("not today");
        } catch (RuntimeException e) {
            System.out.println("runtime exception");
        } catch (Exception e) {
            System.out.println("exception");
        }
    }
}