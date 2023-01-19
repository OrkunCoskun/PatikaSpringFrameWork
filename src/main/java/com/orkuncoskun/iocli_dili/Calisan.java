package com.orkuncoskun.iocli_dili;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named(value = "ioclicdliCalisan")
@ApplicationScoped
public class Calisan {


    @Inject
    private PatronInterface patronInterface;

    //Parametresiz constructor
    public Calisan() {
        //patronInterface = new Patron();
    }

    public String getData(String data) {
        return patronInterface.surum(data);
    }
}
