package Question_4_5_6;

import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class Services  {

    Integer integer;

    void start(){
        System.out.println("Start Method of services");

    }


    Integer getInteger()
    {
        return integer;
    }


    public void setInteger(Integer integer) {
        this.integer = integer;
        System.out.println("Setter Method");
    }


    Exception throwing() throws IOException{
        throw new IOException(" Ooooops");
    }

    void stop(){
        System.out.println("Stop Method of services");
    }
}
