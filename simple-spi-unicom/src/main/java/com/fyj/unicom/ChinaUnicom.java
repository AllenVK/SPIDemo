package com.fyj.unicom;

import com.fyj.spi.InternetService;

/**
 * Date: 2023-06-22 10:08
 * Author: Paul
 */
public class ChinaUnicom implements InternetService {
    @Override
    public void connectInternet() {
        System.out.println("Success connect internet by [China Unicom]");
    }
}
