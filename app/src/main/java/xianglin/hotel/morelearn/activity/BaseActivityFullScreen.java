package xianglin.hotel.morelearn.activity;


import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;



/**
 * create by miaojian
 * on 2020/7/10
 */
public abstract class BaseActivityFullScreen extends BaseActivity {

    ImageView icBack;
    RelativeLayout relHeadContains;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHead();
        afterBindView();
    }


    public abstract void afterBindView();

    void setHead() {
        icBack = initIcBack();
        relHeadContains = initRelHead();
        setSteepStatusBar();
        if (icBack != null) {
            icBack.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    finish();
                }
            });
        }

    }

    //设置沉浸状态栏
    private void setSteepStatusBar() {
        Window window = getWindow();
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        window.setStatusBarColor(Color.TRANSPARENT);
        window.getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_STABLE | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN);
        ViewGroup mContentView = (ViewGroup) window.findViewById(Window.ID_ANDROID_CONTENT);
        View mChildView = mContentView.getChildAt(0);
        if (mChildView != null) {
            ViewCompat.setFitsSystemWindows(mChildView, false);
            ViewCompat.requestApplyInsets(mChildView);
        }
    }

    protected abstract ImageView initIcBack();

    protected abstract RelativeLayout initRelHead();


}
