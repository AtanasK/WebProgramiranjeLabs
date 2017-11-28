package mk.atanask.labsweb.impl;

import mk.atanask.labsweb.model.Order;
import mk.atanask.labsweb.service.OrderService;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class OrderServiceImpl implements OrderService {
    @Override
    public Order placeOrder(String pizzaType, String clientName, String address) {
        Random r = new Random();
        Long newId = r.nextLong();

        return new Order(pizzaType, clientName, address, newId);
    }
}
