package com.orkuncoskun.iocli_dili;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named(value = "ioclicdliCalisan")
@ApplicationScoped
public class Calisan {

    //@Inject olması gerek ama hata veriyor
    //@Inject
    private PatronInterface patronInterface;

    //Parametresiz constructor
    public Calisan() {
        //@Inject ekleyince burayı yoruma alabilirsin
        patronInterface = new Patron();
    }

    public String getData(String data) {
        return patronInterface.surum(data);
    }
}
