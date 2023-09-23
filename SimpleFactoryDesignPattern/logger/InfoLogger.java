package SimpleFactoryDesignPattern.logger;

public class InfoLogger implements Logger {

    @Override
    public void displayLog(String msg) {
        System.out.println("INFO : " + msg);
    }

}
