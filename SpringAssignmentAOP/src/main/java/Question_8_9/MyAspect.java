package Question_8_9;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
@Aspect
public class MyAspect {
/*--------------------------Question 8--------------------*/

    @Before("voidStartPointCut()||voidStopPointCut()")
    void beforeAdvice(){
        System.out.println("Before Advice");
    }


    @After("voidSetStringPointCut()")
    void afterAdvice(){
        System.out.println("Setter For String");
    }


    @Pointcut("execution(void Question_8_9.Services.start())")
    void voidStartPointCut(){
    }


    @Pointcut("execution(void Question_8_9.Services.stop())")
    void voidStopPointCut(){
    }


    @Pointcut("execution(void Question_8_9.Services.setString(String))")
    void voidSetStringPointCut(){
    }




    /* ------------------Question 9----------------------------*/

    @Before("execution(void accessing(String))")
    void accessJointPoint(JoinPoint joinPoint){
        System.out.println("Accessing JoinPoint in advice");
        System.out.println("Join Point - "+joinPoint);
        System.out.println(joinPoint.getThis());
        System.out.println(joinPoint.getSignature());
Object[] objects=joinPoint.getArgs();
        for (Object object:objects){
            System.out.println(object);
        }
    }

}
