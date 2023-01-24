package com.orkuncoskun.aop.interceptor;

@InterceptorBreaker
public class Login {
    public String isLoginMethod(String data) {

        return "isLogin" + data;
    }
}
