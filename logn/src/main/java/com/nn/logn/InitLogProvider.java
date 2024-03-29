package com.nn.logn;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;

/**
 * @author apple
 */
public class InitLogProvider extends ContentProvider {
    @Override
    public boolean onCreate() {
        LogUtils.getConfig(getContext())
                .setLogSwitch(true)// 设置 log 总开关，包括输出到控制台和文件，默认开
                .setConsoleSwitch(true)// 设置是否输出到控制台开关，默认开
                // 当全局标签不为空时，我们输出的 log 全部为该 tag，
                // 为空时，如果传入的 tag 为空那就显示类名，否则显示 tag
                // 通过vTag等现场设置的Tag优先级最高
//                .setGlobalTag("AAAA")
                .setTagPrefix("NN_")
                .setLogHeadSwitch(true)// 设置 log 头信息开关，默认为开
                .setLog2FileSwitch(false)// 打印 log 时是否存到文件的开关，默认关
                .setDir("")// 当自定义路径为空时，写入应用的 android/包名/cache/log/ 目录中（不是私有目录）
                .setFilePrefix("")// 当文件前缀为空时，默认为 "alog"，即写入文件为 "alog-MM-dd.txt"
                .setBorderSwitch(true)// 输出日志是否带边框开关，默认开
                .setSingleTagSwitch(true)// 一条日志仅输出一条，默认开，为美化 AS 3.1 的 Logcat
                .setConsoleFilter(LogUtils.V)// log 的控制台过滤器，和 logcat 过滤器同理，默认 Verbose
                .setFileFilter(LogUtils.V)// log 文件过滤器，和 logcat 过滤器同理，默认 Verbose
                .setStackDeep(1)// log 栈深度，默认为 1
                .setStackOffset(0)// 设置栈偏移，比如二次封装的话就需要设置，默认为 0
                .setSaveDays(3);// 设置日志可保留天数，默认为 -1 表示无限时长

        String msg = "<<<<<<<<<<<<<<<<<<<<<<<<<<🚀LogUtils初始化成功🚀>>>>>>>>>>>>>>>>>>>>>>>>>>\n" +
                " _        _______  _______          _______  _                _ \n" +
                "( \\      (  ___  )(  ____ \\        (  ___  )| \\    /\\        ( )\n" +
                "| (      | (   ) || (    \\/        | (   ) ||  \\  / /        | |\n" +
                "| |      | |   | || |              | |   | ||  (_/ /         | |\n" +
                "| |      | |   | || | ____         | |   | ||   _ (          | |\n" +
                "| |      | |   | || | \\_  )        | |   | ||  ( \\ \\         (_)\n" +
                "| (____/\\| (___) || (___) |        | (___) ||  /  \\ \\         _ \n" +
                "(_______/(_______)(_______)        (_______)|_/    \\/        (_)\n" +
                "                                                                ";
        LogUtils.d(msg);
        return true;
    }

    @Override
    public Cursor query(Uri uri, String[] strings, String s, String[] strings1, String s1) {
        return null;
    }

    @Override
    public String getType(Uri uri) {
        return null;
    }

    @Override
    public Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }
    @Override
    public int delete(Uri uri, String s, String[] strings) {
        return 0;
    }
    @Override
    public int update(Uri uri, ContentValues contentValues, String s, String[] strings) {
        return 0;
    }
}
