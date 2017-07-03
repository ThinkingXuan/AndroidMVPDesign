package com.you.mvptext;

/**
 * Created by youxuan on 2017/7/2 0002.
 */

public interface TestContract {

    interface View{
        //显示数据
        void showData(String str);

    }

    interface Presenter{
        //通知model要获取数据并把数据交给view层
        void getData();
    }
    interface Model{
        //获取数据
        String doData();
    }
}
