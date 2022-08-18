package aop;

import model.Comment;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

import java.util.Arrays;
import java.util.logging.Logger;

@Aspect
public class LoggingAspect {
    private Logger logger = Logger.getLogger(LoggingAspect.class.getName());

    @Around("execution(* services.*.*(..))")
    public Object log(ProceedingJoinPoint joinPoint) throws Throwable {
        String methodName = joinPoint.getSignature().getName();
        Object[] args = joinPoint.getArgs();
        logger.info("Method " + methodName + " with parameters " + Arrays.asList(args) + " will execute.");
        Comment comment = new Comment();
        comment.setText("Altered Comment");
        comment.setAuthor("Dennis Ritchie");
        Object[] newArgs = { comment };
        Object returnedValue = joinPoint.proceed(newArgs);

        logger.info("Method executed and returned " + returnedValue);
        return "FAILED";
    }


}
