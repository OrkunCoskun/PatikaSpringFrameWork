package com.orkuncoskun.cdi;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;
import javax.inject.Named;
import java.util.ArrayList;
import java.util.List;

@Named(value = "producetuto")
@ApplicationScoped
public class _02_Produces {

    @Produces //üretiyor
    public List<String> getList() {
        List<String> list = new ArrayList<>();
        list.add("Html5");
        list.add("css3");
        list.add("js");
        list.add("react");
        list.add("angular");
        return list;
    }
}
