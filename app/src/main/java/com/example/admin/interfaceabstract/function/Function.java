package com.example.admin.interfaceabstract.function;

/**
 * 回调接口的抽象
 */
public class Function {

    private String methodName;

    /**
     * 用函数名来锁定没一个函数，所以这个函数别名应该是唯一的
     * @param methodName
     */
    public Function(String methodName) {
        this.methodName = methodName;
    }

}
