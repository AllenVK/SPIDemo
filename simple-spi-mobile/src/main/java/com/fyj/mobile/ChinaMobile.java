package com.fyj.mobile;

import com.fyj.spi.InternetService;

/**
 * Date: 2023-06-22 9:53
 * Author: Paul
 */
public class ChinaMobile implements InternetService {
    @Override
    public void connectInternet() {
        System.out.println("中国移动连接成功！");
    }
}
