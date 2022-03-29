# Java定时锁屏,给自己一点自由的空间,拒绝久坐

`使用到的API及相关技术`

:zap:ScheduledExecutorService:创建定时器

:zap:Runnable:创建人物

:zap:DateFormat:用于格式化当前时间

:zap:SystemTray:用于创建系统托盘

:zap:Runtime:用于执行锁屏脚本

![image-20220329145903097](https://gitee.com/ICDM_ws/pic-bed/raw/master/all/202203291459175.png)

![image-20220329150003906](https://gitee.com/ICDM_ws/pic-bed/raw/master/all/202203291500946.png)

```java
// 默认为50分钟执行一次!
service.scheduleAtFixedRate(task, 0, 50, TimeUnit.MINUTES);
```

