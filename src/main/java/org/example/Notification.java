package org.example;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * @author ICDM_王顺
 * @Classname Notification
 * @Description TODO
 * @Date 2022/3/29 13:16
 * @Created by TheKing_Shun
 */

public class Notification {

    private SystemTray tray = null;
    private TrayIcon trayIcon = null;
    private final String urlStr = "https://gitee.com/ICDM_ws/pic-bed/raw/master/all/202201031010964.jpg";
    private URL url = null;

    public Notification() {
        tray = SystemTray.getSystemTray();
        try {
            url = new URL(this.urlStr);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        Image image = Toolkit.getDefaultToolkit().getImage(url);
        trayIcon = new TrayIcon(image, "这是什么?");
        trayIcon.setImageAutoSize(true);
        //Set tooltip text for the tray icon
        trayIcon.setToolTip("System tray icon demo");
        try {
            tray.add(trayIcon);
        } catch (AWTException e) {
            e.printStackTrace();
        }

    }

    public void display(String data) throws AWTException, InterruptedException, IOException {
        trayIcon.displayMessage("休息一下,2s后息屏", data, TrayIcon.MessageType.INFO);
        Thread.sleep(2000);
        Runtime.getRuntime().exec("RunDll32.exe user32.dll,LockWorkStation");
    }

}
