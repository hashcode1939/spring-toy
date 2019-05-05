package spring.toy2.springAOP;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class PerfAspect {

//    @Around("execution(* spring.toy2.aop.proxy.*.*(..))")
    //@Around("@annotation(PerfLogging)")
    @Around("bean(simpleEventService)")
    public Object logPerf(ProceedingJoinPoint pjp) throws Throwable {
        long begin = System.currentTimeMillis();
        Object retVal = pjp.proceed();
        System.out.println(pjp.getSignature() +" / "+(System.currentTimeMillis() - begin));
        return retVal;
    }

    @Before("method(simpleEventService.deleteEvent)")
    public void hello(){
        System.out.println("hello method");
    }
}
