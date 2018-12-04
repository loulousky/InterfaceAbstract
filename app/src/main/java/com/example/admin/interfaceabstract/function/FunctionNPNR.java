package com.example.admin.interfaceabstract.function;

/**
 * 封装无返回无参数的接口实现
 */
public abstract class FunctionNPNR extends Function {


    public FunctionNPNR(String methodName) {
        super(methodName);
    }

    /**
     * 实现具体的做某事的方法
     */
    public abstract void dothings();


}
