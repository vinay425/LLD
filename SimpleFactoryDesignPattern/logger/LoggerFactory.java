package SimpleFactoryDesignPattern.logger;

public class LoggerFactory {
    public static Logger createLogger(LogLevel level) {

        switch (level) {
            case INFO:
                return new InfoLogger();
            case ERROR:
                return new ErrorLogger();
            case DEBUG:
                return new DebugLogger();
            default:
                return null;
        }

    }

}
