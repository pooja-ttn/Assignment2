package Question2;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStartedEvent;
import org.springframework.context.event.ContextStoppedEvent;

public class MyEventListener implements ApplicationListener<ContextStartedEvent>{
    @Override
    public void onApplicationEvent(ContextStartedEvent event) {
        System.out.println(event);
        System.out.println("Start Event  Listener..........................");

    }
}



 class MyEventListener1 implements ApplicationListener<ContextStoppedEvent>{
    @Override
    public void onApplicationEvent(ContextStoppedEvent event) {
        System.out.println(event);
        System.out.println("Stop Event Listener..........................");

    }
}
