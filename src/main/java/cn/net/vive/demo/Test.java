package cn.net.vive.demo;

import org.aspectj.runtime.internal.cflowstack.ThreadStackImpl11;

/**
 * Created by robin on 2015/8/10.
 */
public class Test {
    public  String getMsg(String msg){
        String className = this.getClass().toString();
        return className + "-hello world:" + msg;
    }
}
