# InterfaceAbstract 是一个接口的封装库
实现的目地是为了解决android中单activity 和多fragment通信的问题，要实现每个fragment的接口很多的话很复杂
通过这个框架，使用唯一的函数名即可简单的实现接口回调。也可以用于别的多接口场景
基本用法如下

 findViewById(R.id.add).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FunctionManager.getInstance().addMethod("test", new FunctionNP<String>("test") {
                    @Override
                    public String dothings(Class aClass) {
                    //    Toast.makeText(getApplicationContext(),"这是我的测试的接口执行的方法",1).show();

                        return "这是我的测试的接口执行的方法返回的数据";
                    }
                });
            }
        });
        
        
 findViewById(R.id.get).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String test= (String) FunctionManager.getInstance().getMethodNP("test").dothings(String.class);
                Toast.makeText(getApplicationContext(),test,1).show();
            }
        });
