package com.example.admin.interfaceabstract;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.admin.interfaceabstract.function.FunctionManager;
import com.example.admin.interfaceabstract.function.FunctionNP;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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





    }
}
