package com.fyj.mobile;

import com.fyj.spi.InternetService;

/**
 * Date: 2023-06-22 9:54
 * Author: Paul
 */
public class BeijingChinaMobile implements InternetService {
    @Override
    public void connectInternet() {
        System.out.println("中国联通连接成功！");
    }
}
