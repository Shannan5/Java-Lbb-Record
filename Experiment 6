interface RemoteControl {
    void turnOn();
    void turnOff();
}

abstract class Appliance {
    abstract void displayAppliance();
}

class SmartTV extends Appliance implements RemoteControl {
    void displayAppliance() {
        System.out.println("Smart TV");
    }

    public void turnOn() {
        System.out.println("TV ON");
    }

    public void turnOff() {
        System.out.println("TV OFF");
    }

    public static void main(String[] args) {
        Appliance a = new SmartTV();
        a.displayAppliance();

        SmartTV t = new SmartTV();
        t.turnOn();
        t.turnOff();
    }
}
