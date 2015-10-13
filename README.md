# gdky005_Archive
gdky005常用的一些工具类，对应分享文章的网站是：http://www.gdky005.com

# AndroidBucket
Android开发常用整理（不断扩充中）
包含各种工具类、线程池、日志、自定义的控件、程序崩溃捕捉处理、默认的Application配置、常用的Adapter等
https://github.com/wangjiegulu/AndroidBucket

这个里面有一个检测当前gradle 版本方法 Gradle(Check newest version)，这个很不错，可以多多使用

# systembartint   Android 4.4 上实现透明导航栏和状态栏 Translucent system bar，侵入式
不管你用什么方式，你必须首先让你的Activity变成translucen模式。
第一种方式：设置android:windowTranslucentNavigation和android:windowTranslucentStatus 为true。
第二种方式：继承*.TranslucentDecor 主题中的一种。
第三种在activity中设置FLAG_TRANSLUCENT_NAVIGATION 和 FLAG_TRANSLUCENT_STATUS。
如果你没有设置activity为translucen模式或者你的api版本低于19，那么系统状态栏和导航栏将不会有变化，但也不会报错。该library可以在api10 之上安全使用。
