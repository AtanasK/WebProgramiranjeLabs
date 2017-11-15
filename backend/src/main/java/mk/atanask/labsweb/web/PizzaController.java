package mk.atanask.labsweb.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.View;

@Controller
public class PizzaController {
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index() {
        return "/OrderForm.html";
    }

    @RequestMapping(value = "/delivery", method = RequestMethod.GET)
    public String delivery() {
        return "/DeliveryForm.html";
    }
}
