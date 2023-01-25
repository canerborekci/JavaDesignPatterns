package creational.abstract_factory.logging;

public class MySqlLogging extends Logging{
    @Override
    public void log() {
        System.out.println("MySql DB loglandý");
    }
}
