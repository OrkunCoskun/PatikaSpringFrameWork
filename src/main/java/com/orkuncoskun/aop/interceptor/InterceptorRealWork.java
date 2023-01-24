package com.orkuncoskun.aop.interceptor;

import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;

@Interceptor
@InterceptorBreaker
public class InterceptorRealWork {

    @AroundInvoke public Object loglama(InvocationContext context) {
        System.out.println("İlk Hali: " + context.getMethod().getName());

        //kullanıcı giriş yapmış mı?
        boolean isLogin = true; //true: önce login olmalı. Yol kesici olacak değişkenimiz
        //jdbc: session ?
        Object isContinue = null; //Eğer yol kesilmezse devam edecek

        if(isLogin) {
            //Önce sisteme giriş yapsın
            System.out.println("!!! Önce sisteme giriş yapsın");
            return null;
        } else {
            try {
                isContinue = context.proceed(); //devam etmesini sağlar
                System.out.println("Sonraki hali " + isContinue);
            } catch (Exception e) {
                e.printStackTrace();
            }
            return isContinue;
        }
    }
}
