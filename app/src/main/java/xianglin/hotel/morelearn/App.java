package xianglin.hotel.morelearn;

import android.app.Application;

import xianglin.hotel.morelearn.utils.LeakCanaryUtils;


/**
 * create by shiming
 * on 2020/6/6
 */
public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        //收集内存泄漏
       LeakCanaryUtils.init(this);

    }








    @Override
    public void onTerminate() {

        super.onTerminate();
    }



}
