package aspect;

import org.apache.log4j.Logger;
import org.aspectj.lang.ProceedingJoinPoint;

import java.util.Objects;

/**
 * Created by ZHANGJA4 on 8/20/2015.
 */
public class LogAspect {
    Logger logger = Logger.getLogger(LogAspect.class.getName());

    public void LogBefore() {
        logger.info("LogBefore...");
    }

    public void LogAfter() {
        logger.info("LogAfter...");
    }

    public Objects LogArround(ProceedingJoinPoint point) {
        Objects o = null;
        logger.info("arround before...");

        try {
            String value = (String) point.getArgs()[0];
            System.out.println(value);
            value = value.toUpperCase();
            point.getArgs()[0] = value;
            System.out.println(point.getArgs().length);
           point.proceed(new Object[]{value});

        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }

        logger.info("arround after...");
        return o;
    }
}
