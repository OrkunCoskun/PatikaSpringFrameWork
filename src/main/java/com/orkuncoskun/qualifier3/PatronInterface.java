package com.orkuncoskun.qualifier3;

public interface PatronInterface {

    //@Alternative: aynı anda sadece 1 tane proje çalışıyor diğerleri kapalı
    //@Qualifier: aynı anda birden fazla proje aktif ancak default olarak çalışacak projeyi seçebiliyoruz
    public String surum(String data);
}
