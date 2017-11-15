package mk.atanask.labsweb.web;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;

@WebListener
public class PizzaListener implements ServletRequestListener, HttpSessionBindingListener {
    @Override
    public void requestDestroyed(ServletRequestEvent sre) {
        System.out.println("Request destroyed" + sre.getServletRequest());
    }

    @Override
    public void requestInitialized(ServletRequestEvent sre) {
        System.out.println("Request initialized" + sre.getServletRequest());
    }

    @Override
    public void valueBound(HttpSessionBindingEvent httpSessionBindingEvent) {
        System.out.println("Session bound: " + httpSessionBindingEvent.getSession().toString());
    }

    @Override
    public void valueUnbound(HttpSessionBindingEvent httpSessionBindingEvent) {
        System.out.println("Session unbound: " + httpSessionBindingEvent.getSession().toString());
    }
}
