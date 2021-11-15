package lesson6_3;

public class Keywords {
}

interface CanRun {}

class Cheetah extends Keywords implements CanRun, HasFur {}

class Hyena {}

interface HasFur extends CanRun {}

class Cheetah1 extends Hyena {}