package creational.singleton.logging;

public class DBLogger implements ILogging{
	private static volatile DBLogger instance;
    private String message;
    
    public static DBLogger getInstance(String message){
    	DBLogger logger = instance;
        if(logger!=null) return logger;
        synchronized (DBLogger.class){
            if(instance==null)
                instance = new DBLogger(message);
            return instance;
        }
    }

    public DBLogger(String _message) {
        message = _message;
    }

    @Override
    public void log() {
        System.out.println("Database'e loglandı: " + message);
    }
}
