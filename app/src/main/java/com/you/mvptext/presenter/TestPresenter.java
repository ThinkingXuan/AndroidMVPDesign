package com.you.mvptext.presenter;

import com.you.mvptext.TestContract;

/**
 * Created by youxuan on 2017/7/2 0002.
 */

public class TestPresenter implements TestContract.Presenter {

    private TestContract.Model  mModel;
    private TestContract.View mView;


    public TestPresenter(TestContract.Model model, TestContract.View view) {
        mModel = model;
        mView = view;
    }

    @Override
    public void getData() {
        mView.showData(mModel.doData());
    }


}
