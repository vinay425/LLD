package SimpleFactoryDesignPattern.logger;

public class ErrorLogger implements Logger {

    @Override
    public void displayLog(String msg) {
        System.out.println("ERROR : " + msg);
    }

}
