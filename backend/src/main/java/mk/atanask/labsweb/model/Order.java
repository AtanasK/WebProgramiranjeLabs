package mk.atanask.labsweb.model;

public class Order {
    private String pizzaType;
    private String clientName;
    private String clientAddress;
    private Long orderId;

    public Order() {
    }

    public Order(String pizzaType, String clientName, String clientAddress, Long orderId) {
        this.pizzaType = pizzaType;
        this.clientName = clientName;
        this.clientAddress = clientAddress;
        this.orderId = orderId;
    }
}
