package fr.m2i.jsfwebapp;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;

@ManagedBean(name = "navigationController", eager = true)
public class NavigationController {

    public String moveToHello() {
        return "hello";
    }

}
