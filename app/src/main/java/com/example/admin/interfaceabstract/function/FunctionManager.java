package com.example.admin.interfaceabstract.function;

import java.util.HashMap;

/**
 * 全局管理抽象接口的实现
 * 此工具用来在android中 Activity 与多个fragment通信，替换每个fragment的接口
 * @author liuhai
 */
public class FunctionManager {
    private static FunctionManager functionManager;
    private final HashMap<String, FunctionNP> hashMapNP = new HashMap<>();
    private final HashMap<String, FunctionNPNR> hashMapNPNR = new HashMap<>();
    private final HashMap<String, FunctionNR> hashMapNR = new HashMap<>();
    private final HashMap<String, FunctionPR> hashMapPR = new HashMap<>();

    private FunctionManager() {


    }


    /**
     * 单例实现
     *
     * @return
     */
    public static FunctionManager getInstance() {
        if (functionManager == null) {
            synchronized (Function.class) {
                if (functionManager == null) {
                    functionManager = new FunctionManager();
                    return functionManager;
                }
            }
        }
        return functionManager;
    }


    /**
     * 添加没有参数没有返回值的接口
     *
     * @param name         函数名
     * @param functionNPNR 函数的具体实现
     */
    public void addMethod(String name, FunctionNPNR functionNPNR) {
        hashMapNPNR.put(name, functionNPNR);
    }

    /**
     * 添加没有参数有返回值的函数接口
     * @param name 函数名字
     * @param functionNP 函数的具体实现
     */
    public void addMethod(String name, FunctionNP functionNP) {
        hashMapNP.put(name, functionNP);
    }

    /**
     * 添加没有返回值有参数的函数接口
     * @param name 函数名字
     * @param functionNR 函数的具体实现
     */
    public void addMethod(String name, FunctionNR functionNR) {
        hashMapNR.put(name, functionNR);
    }

    /**
     * 添加有返回值有参数的函数接口
     * @param name 函数的名字
     * @param functionPR 函数的具体实现
     */
    public void addMethod(String name, FunctionPR functionPR) {
        hashMapPR.put(name, functionPR);
    }


    public  FunctionNPNR getMethodNPNR(String name){
        if(name!=null){
            return hashMapNPNR.get(name);
        }
        return null;
    }

    public  FunctionNP getMethodNP(String name){
        if(name!=null){
            return hashMapNP.get(name);
        }
        return null;
    }

    public  FunctionNR getMethodNR(String name){
        if(name!=null){
            return hashMapNR.get(name);
        }
        return null;
    }

    public  FunctionPR getMethodPR(String name){
        if(name!=null){
            return hashMapPR.get(name);
        }
        return null;
    }


}
