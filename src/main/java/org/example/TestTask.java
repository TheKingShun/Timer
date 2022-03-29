package org.example;

import java.awt.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author ICDM_王顺
 * @Classname TestTask
 * @Description TODO
 * @Date 2022/3/29 13:01
 * @Created by TheKing_Shun
 */

public class TestTask implements Runnable {
    Notification notification = null;

    public TestTask() {
        this.notification = new Notification();
    }

    @Override
    public void run() {
        DateFormat sdf = new SimpleDateFormat("yy-MM-dd:HH:mm:ss");
        Date date = new Date();
        String dateStr = sdf.format(date);
        System.out.println("定时任务执行,当前时间为: " + dateStr);
        try {
            notification.display(dateStr);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
