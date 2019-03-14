package Question3;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

public class MyApplicationPublisher implements ApplicationEventPublisherAware {
    ApplicationEventPublisher applicationEventPublisher;
    void display(){
        CustomEvent event=new CustomEvent(this);
        applicationEventPublisher.publishEvent(event);
        System.out.println("Published...........");
    }


    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
this.applicationEventPublisher=applicationEventPublisher;
    }
}
