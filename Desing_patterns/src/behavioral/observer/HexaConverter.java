package behavioral.observer;

public class HexaConverter extends Observer{

    public HexaConverter(Subject subject){
        this.subject = subject;
        this.subject.subscribe(this);
    }

    @Override
    public void update() {
        int number = this.subject.getNumber();
        System.out.println("Deðiþen yeni deðerin Hex deðeri: " + Integer.toHexString(number));
    }
}