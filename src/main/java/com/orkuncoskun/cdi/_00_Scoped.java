package com.orkuncoskun.cdi;

import javax.enterprise.context.*;
import javax.inject.Named;
import java.io.Serializable;

//Kapsam
//Projedeki yaşam süresini belirler
//Performansımızı + - yönde etkiler
@Named
//@ApplicationScoped //bütün uygulama boyunca çalışıyor. Bütün kullanıcılar için.
//@RequestScoped //1 istek boyunca yaşar.
//@SessionScoped //1 kullanıcı için yaşar. Ancak logout olduğu zaman çıkışı sağlanır.
//@Dependent //bukalemun gibi
//@ConversationScoped //belli istek boyunca yaşar.
//@SessionScoped // 1 tane Bean'in 1 instance olmasını sağlamak için.
public class _00_Scoped {
}
