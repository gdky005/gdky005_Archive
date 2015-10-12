package gdky005.archive.pro.utils;


import com.orhanobut.logger.Logger;

import gdky005.archive.pro.BuildConfig;

/**
 * Log日志输出
 * 1.多彩格式的日志，提供关键信息；
 * 2.抽离简化日志功能。
 *
 * Created by WangQing on 15/9/20.
 */
public class L {

    /**
     * @param messageForI 统一使用  {} 占位符
     * @param args
     */
    public static void i( String messageForI, Object... args) {
        if (BuildConfig.DEBUG)
            Logger.i(handleDebugLogFormat(messageForI), args);

//        Logger.i(messageForI, args);
    }

    /**
     * @param messageForD 统一使用  {} 占位符
     * @param args
     */
    public static void d(String messageForD, Object... args) {
        if (BuildConfig.DEBUG)
            Logger.d(handleDebugLogFormat(messageForD), args);
    }

    /**
     *
     * @param messageForW 统一使用  {} 占位符
     * @param args
     */
    public static void w(String messageForW, Object... args) {
        if (BuildConfig.DEBUG)
            Logger.w(handleDebugLogFormat(messageForW), args);
    }

    /**
     *
     * @param messageForE 统一使用  {} 占位符
     * @param args
     */
    public static void e(String messageForE, Object... args) {
        if (BuildConfig.DEBUG)
            Logger.e(handleDebugLogFormat(messageForE), args);
    }

    /**
     * 处理Debug模式下的打印log格式
     *
     * @param message
     * @return
     */
    public static String handleDebugLogFormat(String message) {
        return message.replace("{}", "%s");
    }

    /**
     * debug 模式下，会打印json 数据
     *
     * @param messageForE
     */
    public static void json(String messageForE) {

        if (BuildConfig.DEBUG)
            Logger.json(messageForE);
    }

}
