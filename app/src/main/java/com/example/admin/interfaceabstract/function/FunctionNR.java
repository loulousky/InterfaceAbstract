package com.example.admin.interfaceabstract.function;

/**
 * 封装的有参数没有返回值的接口
 */
public abstract class FunctionNR<T> extends Function {
    public FunctionNR(String methodName) {
        super(methodName);
    }

    /**
     * 具体实现
     */
    public abstract void dothings(T t);

}
