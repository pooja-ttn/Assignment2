package Question_7;

import java.io.IOException;

public class Services {

    Integer integer;


    void start(){
        System.out.println("Start Method of services");

    }

    public void setInteger(Integer integer) {
        this.integer = integer;
        System.out.println("Setter Method");
    }


    void stop(){
        System.out.println("Stop Method of services");
    }

}
