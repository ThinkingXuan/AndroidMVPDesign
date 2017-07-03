package com.you.mvptext;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.you.mvptext.model.TestModel;
import com.you.mvptext.presenter.TestPresenter;

/**
 * 再次学习Android 的MVP模式，各种MVP对比。
 * MVP顾名思义就是Model View 和Presenter
 * Model处理数据，View控制视图。Presenter作为中间件,连接两者。数据和视图分离。
 *
 * 我们要把M层的接口方法抽象出来,P层的接口方法抽象出来,V层的接口方法抽象出来
 * ,同时分别写3个接口的实现类，(V层一般是Activity或者Fragment继承View层
 * 的接口),v层持有p的接口对象，p层持有V层和M层的接口对象,M层为P层的提供数据
 * ，这是也就形成了mvp架构，三者之间通过p层相互连接
 *
 */
public class MainActivity extends AppCompatActivity implements TestContract.View,View.OnClickListener {

    private Button bt1;
    private TestContract.Presenter mPresenter;
    
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        bt1 = (Button) findViewById(R.id.bt_1);
        bt1.setOnClickListener(this);

        mPresenter = new TestPresenter(TestModel.getInstance(),this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.bt_1:
                mPresenter.getData();
                break;
        }
    }

    @Override
    public void showData(String str) {

        Toast.makeText(this,str, Toast.LENGTH_SHORT).show();
    }
}
