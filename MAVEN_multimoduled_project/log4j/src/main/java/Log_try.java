import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log_try {
    private static Logger logger = LogManager.getLogger(Log_try.class);

    public static void main(String[] args) {
        System.out.println("Hello...............");

        logger.info("THis is infoooooooo");
        logger.error("kkkkkkkkkkkkkkk");
        logger.warn("Ddddddddddddddd");

        System.out.println("Completed");


    }
}
