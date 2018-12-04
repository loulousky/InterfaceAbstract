package com.example.admin.interfaceabstract.function;

/**
 * 封装有返回值没有参数的方法
 */
public abstract  class FunctionNP<T> extends Function{
    public FunctionNP(String methodName) {
        super(methodName);
    }

    /**
     * 抽象方法用来实现逻辑
     * @param tClass 返回值的类型
     * @return
     */
    public abstract T dothings(Class<T> tClass);

}
