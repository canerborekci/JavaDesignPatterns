package creational.singleton.logging;

public class Main {

	public static void main(String[] args) {
        Thread thread1 = new Thread(new LoggerThread1());
        Thread thread2 = new Thread(new LoggerThread2());
        thread1.start();
        thread2.start();
	}
	
    static class LoggerThread1 implements Runnable{

        @Override
        public void run() {
            ILogging logging = DBLogger.getInstance("Logger 1");
            logging.log();
        }
    }
    static class LoggerThread2 implements Runnable {

        @Override
        public void run() {
            ILogging logging = DBLogger.getInstance("Logger 2");
            logging.log();
        }
    }

}
