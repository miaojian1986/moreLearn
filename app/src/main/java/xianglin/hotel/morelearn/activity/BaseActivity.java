package xianglin.hotel.morelearn.activity;


import android.os.Bundle;
import androidx.annotation.Nullable;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import xianglin.hotel.morelearn.annotation.LayoutInject;
import xianglin.hotel.morelearn.mvp.view.LifeCircleMvpActivity;


/**
 * create by miaojian
 * on 2020/7/10
 */
public abstract class BaseActivity extends LifeCircleMvpActivity {
    Unbinder unbinder;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //设置资源
        setLayoutResource();
        //绑定ButterKnife
        unbinder = ButterKnife.bind(this);

    }


    @Override
    protected void onDestroy() {
        unbinder.unbind();
        unbinder = null;
        super.onDestroy();
    }

    private void setLayoutResource(){
        LayoutInject layoutInject = getClass().getAnnotation(LayoutInject.class);
        if(layoutInject!=null){
            int layoutId = layoutInject.getLayout();
            if(layoutId>0){
                setContentView(layoutId);
            }else{
                throw new RuntimeException("layoutId < 0");
            }
        }else{
            throw new RuntimeException("@layoutInject=null");
        }
    }
}
