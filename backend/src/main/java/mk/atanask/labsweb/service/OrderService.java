package mk.atanask.labsweb.service;

import mk.atanask.labsweb.model.Order;

public interface OrderService {
    public Order placeOrder(String pizzaType, String clientName, String address);
}
