package Question3;

import org.springframework.context.ApplicationEvent;

public class CustomEvent extends ApplicationEvent {
    public CustomEvent(Object source) {
        super(source);
        System.out.println("Custom Event after connect");
    }
}

