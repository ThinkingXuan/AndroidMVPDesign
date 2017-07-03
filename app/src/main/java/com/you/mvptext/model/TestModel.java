package com.you.mvptext.model;

import com.you.mvptext.TestContract;

/**
 * Created by youxuan on 2017/7/2 0002.
 */

public class TestModel implements TestContract.Model {
    private static   TestModel mModel;

    public static TestModel getInstance(){
        if (mModel == null){
            mModel = new TestModel();
        }
        return mModel;
    }
    @Override
    public String doData() {
        return "mvp架构";
    }
}
