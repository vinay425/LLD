package SimpleFactoryDesignPattern.logger;

public class DebugLogger implements Logger {

    @Override
    public void displayLog(String msg) {
        System.out.println("DEBUG : " + msg);
    }

}
