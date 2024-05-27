package com.santhosh.patterns.builder;


public class Test {
    public static void main(String[] args) {

        HttpClient httpClient = new HttpClient.HttpClientBuidler().body("{}").secure("sa", "pass").method("GET").build();
        System.out.println(httpClient);

    }
}
