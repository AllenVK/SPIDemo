package com.fyj.company;

import com.fyj.spi.InternetService;

import java.util.ServiceLoader;

/**
 * Date: 2023-06-22 10:15
 * Author: Paul
 */
public class Application {

    public static void main(String[] args) {
        ServiceLoader<InternetService> load = ServiceLoader.load(InternetService.class);
        for (InternetService provider : load) {
            provider.connectInternet();
        }
    }

}
