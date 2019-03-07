package demo.domain
import demo.domain.Order

import spock.lang.Specification;

class OrderSpec extends  Specification {
    def "Test getItemName"() {
        given: "Create order instance"
        Order order = new Order()
        and:
        String ProductName = "Product Name"
        order.setItemName(ProductName)
        when:
        String ItemName
        ItemName = order.getItemName()

        then:
        ItemName == "Product Name"
    }

    def "Test setItemName"() {
        given: "Create order instance"
        Order order = new Order()
        and:
        String ProductName = "100D";

        when:
        order=order.setItemName(ProductName)


        then:
        order.getItemName() == ProductName;
    }

    def "Test getQuantity"() {
        given: "Create order instance"
        Order order = new Order()
        and:
        int Quantity = 10;

        when:
        int Quant
        order.setQuantity(Quantity)
        Quant = order.getQuantity()

        then:
        Quant == Quantity;

    }

    def "Test setQuantity"() {
        given: "Create order instance"
        Order order = new Order()
        and:
        int Quantity = 10;

        when:
        order=order.setQuantity(Quantity)

        then:

        order.getQuantity() == Quantity

    }

    def "Test getPrice"() {   //correct
        given: "Create order instance"
        Order order = new Order()
        and:
        double Price = 100.0

        when:
        order.setPrice(Price)

        int ItemPrice
        ItemPrice = order.getPrice()

        then:
        ItemPrice == Price
    }

    def "Test setPrice"() {
        given: "Create order instance"
        Order order = new Order()
        and:
        double Price = 100.1D;

        when:
        order=order.setPrice(Price)


        then:
        order.getPrice() == Price;
    }

    def "Testing Order getPriceWithTex() example"() {

        given: "Creating Order instance"

        Order order = new Order()

        and:
        order.setPriceWithTex(2005.50)

        and: "Price with Tax Response"

        double response;

        when:

        response =order.getPriceWithTex()

        then:

        response == 2005.50D
    }
    def "Testing Order setPriceWithTex() example"() {

        given: "Creating Order instance"

        Order order = new Order()

        and:

        double TaxPrice=2500.50;

        when:
        order=order.setPriceWithTex(TaxPrice);

        then:
        order.getPriceWithTex()==TaxPrice;

    }
}