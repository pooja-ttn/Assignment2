package Question_7;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class MyAspect {
    @Before("execution(* Question_7.Services.*(..))")
    void beforeAdvice(){
        System.out.println("Before advice for every method");
    }

    @After("execution(* Question_7.Services.*(..))")
    void afterAdvice(){
        System.out.println("After advice for every method");
    }


    @Before("args(Integer)")
    void beforeAdvice1(){
        System.out.println("Before advice for method with arguments Integer");
    }

    @After("args(Integer)")
    void afterAdvice1(){
        System.out.println("After advice for method with arguments Integer");
    }


    @Before("this(Question_7.Services)")
    void beforeAdvice2(){
        System.out.println("Before advice for every Services type");
    }

    @After("this(Question_7.Services)")
    void afterAdvice2() {
        System.out.println("After advice for Services type");
    }


        @Before("within(Question_7.Services)")
        void beforeAdvice3(){
            System.out.println("Before advice for within Services ");
        }

        @After("within(Question_7.Services)")
        void afterAdvice3(){
            System.out.println("After advice within Services");

        }

    @Before("bean(services)")
    void beforeAdvice4(){
        System.out.println("Before advice for services bean");
    }

    @After("bean(services)")
    void afterAdvice4(){
        System.out.println("After advice for services bean");

    }

}
