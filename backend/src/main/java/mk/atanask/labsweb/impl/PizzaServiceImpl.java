package mk.atanask.labsweb.impl;

import mk.atanask.labsweb.service.PizzaService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PizzaServiceImpl implements PizzaService {
    @Override
    public List<String> getPizzaTypes() {
        ArrayList<String> pizzaTypes = new ArrayList<>();
        pizzaTypes.add("Small");
        pizzaTypes.add("Medium");
        pizzaTypes.add("Large");
        return pizzaTypes;
    }
}
