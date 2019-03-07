package demo.service
import demo.domain.Order
import spock.lang.Specification

class EmailServiceSpec extends Specification{

    def "Testing EmailService"() {

        given: "Create order instance"
        EmailService emailService= new EmailService();
        Order order = new Order()
        and: "Initializing order"
        order.setItemName("Product Name")
                .setQuantity(2)
                .setPrice(2400)

        when:

        emailService.sendEmail(order);

        then:

        thrown(RuntimeException)


    }

    def "Testing EmailService Return Type"() {

        given: "Create order instance"
        EmailService emailService= new EmailService();
        Order order = new Order()
        and: "Initializing order"
        order.setItemName("Product Name")
                .setQuantity(2)
                .setPrice(2400)

        and:

        boolean resp

        when:

        resp=emailService.sendEmail(order,"pkj")
        then:

        resp == true


    }


}




