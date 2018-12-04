package com.example.admin.interfaceabstract.function;

public abstract class FunctionPR<Params,Result>extends Function {
    public FunctionPR(String methodName) {
        super(methodName);
    }

    /**
     *
     * @param resultClass 返回的参数类型
     * @param p 传入的参数类型
     * @return 返回方法执行的结果
     */
    public abstract Result dothings(Class<Result> resultClass,Params p);

}
