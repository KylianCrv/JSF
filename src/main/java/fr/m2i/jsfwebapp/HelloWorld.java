package fr.m2i.jsfwebapp;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;

@ManagedBean(name = "helloWorld", eager = true)
public class HelloWorld {

    @ManagedProperty(value = "#{message}")
    private Message messageBean;

    private String message;

    public HelloWorld() {

    }

    public String getMessage() {

        if (messageBean != null) {
            message = messageBean.getMessage();
        }

        return message;
    }

    public void setMessageBean(Message messageBean) {
        this.messageBean = messageBean;
    }
}
