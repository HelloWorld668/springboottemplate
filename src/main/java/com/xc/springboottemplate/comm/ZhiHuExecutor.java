package com.xc.springboottemplate.comm;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ZhiHuExecutor {
    public static ExecutorService collectionParserThreadPool = Executors.newFixedThreadPool(1);
    public static ExecutorService answerParserThreadPool = Executors.newFixedThreadPool(1);
    public static ExecutorService imageDownloadThreadPool = Executors.newFixedThreadPool(1);
}
