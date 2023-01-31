package behavioral.observer;

public class HexaConverter extends Observer{

    public HexaConverter(Subject subject){
        this.subject = subject;
        this.subject.subscribe(this);
    }

    @Override
    public void update() {
        int number = this.subject.getNumber();
        System.out.println("De�i�en yeni de�erin Hex de�eri: " + Integer.toHexString(number));
    }
}