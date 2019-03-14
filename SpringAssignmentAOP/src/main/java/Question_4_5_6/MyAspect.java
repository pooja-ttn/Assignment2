package Question_4_5_6;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

@Aspect
public class MyAspect {
    /* ----------------Question 5-----Logger to all the methods */
    @Before("execution(* Question_4_5_6.Services.*(..))")
    void startAdvice(){
        System.out.println("Common to all the methods in Service Class");
    }


    @Before("execution(* Question_4_5_6.Services.start())")
    void beforeAdvice(){
        System.out.println("Before Advice");
    }

    @AfterReturning(pointcut=("execution(* Question_4_5_6.Services.getInteger())"),returning="returnValue")
            void afterReturningAdvice(Integer returnValue){
        System.out.println("Returned value "+returnValue);
}

@Around("execution(* Question_4_5_6.Services.setInteger(Integer))")
    void aroundAdvice(ProceedingJoinPoint proceedingJoinPoint)throws Throwable{
        System.out.println("Before Joint Point");
        proceedingJoinPoint.proceed();
        System.out.println("After Joint Point");

}
    @AfterThrowing(pointcut=("execution(* Question_4_5_6.Services.throwing())"),throwing="exception")
    void afterThrowingAdvice(Exception exception){
        System.out.println("Thrown IOException");
    }

}
