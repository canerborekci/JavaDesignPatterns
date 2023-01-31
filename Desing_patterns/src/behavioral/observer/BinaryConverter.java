package behavioral.observer;

public class BinaryConverter extends Observer{

    public BinaryConverter(Subject subject){
        this.subject = subject;
        this.subject.subscribe(this);
    }

    @Override
    public void update() {
        int number = this.subject.getNumber();
        System.out.println("De�i�en yeni de�erin Binary de�eri: " + Integer.toBinaryString(number));
    }
}