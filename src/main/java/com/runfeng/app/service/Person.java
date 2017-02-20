package com.runfeng.app.service;

/**
 * Created by lenovo on 2017/2/20.
 */
public class Person {
    private Axe axe;

    public Axe getAxe() {
        return axe;
    }

    public void setAxe(Axe axe) {
        this.axe = axe;
    }

    public void useAxe(){
        System.out.println("Person plans to chop");
        System.out.println(axe.chop());
    }
}
