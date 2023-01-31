package behavioral.observer;

public class OctalConverter extends Observer{
    public OctalConverter(Subject subject){
        this.subject = subject;
        this.subject.subscribe(this);
    }

    @Override
    public void update() {
        int number = this.subject.getNumber();
        System.out.println("De�i�en yeni de�erin Octal de�eri: " + Integer.toOctalString(number));
    }
}