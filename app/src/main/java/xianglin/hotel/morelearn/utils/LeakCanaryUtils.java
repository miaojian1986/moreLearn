package xianglin.hotel.morelearn.utils;

import android.app.Application;
import android.content.Context;

import com.squareup.leakcanary.BuildConfig;
import com.squareup.leakcanary.LeakCanary;
import com.squareup.leakcanary.RefWatcher;

/**
 * create by shiming
 * on 2020/6/6
 */
public class LeakCanaryUtils {

    private static RefWatcher mRefWatcherr;
    public static void init(Application context) {
        if (BuildConfig.DEBUG) {
            if (LeakCanary.isInAnalyzerProcess(context)) {
                return;
            }
            mRefWatcherr = LeakCanary.install(context);
        }
    }

    public static void collectMemoryLeak(Context context) {
        if (BuildConfig.DEBUG) {
            if (mRefWatcherr != null) {
                mRefWatcherr.watch(context);
            }
        }
    }
}
