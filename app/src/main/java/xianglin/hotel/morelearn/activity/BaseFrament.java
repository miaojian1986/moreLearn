package xianglin.hotel.morelearn.activity;


import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import butterknife.ButterKnife;
import butterknife.Unbinder;
import xianglin.hotel.morelearn.annotation.LayoutInject;
import xianglin.hotel.morelearn.mvp.view.LifeCircleMvpFragment;


/**
 * create by miaojian
 * on 2020/7/13
 */
public abstract class BaseFrament extends LifeCircleMvpFragment {
    Unbinder unbinder;
    Context mContext;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater,container,savedInstanceState);
        View mView = null;
        //设置资源
        LayoutInject layoutInject = getClass().getAnnotation(LayoutInject.class);
        if(layoutInject!=null){
            int layoutId = layoutInject.getLayout();
            if(layoutId>0){
                mView = initFragmentView(inflater,layoutId);
            }else{
                throw new RuntimeException("layoutId < 0");
            }
        }else{
            throw new RuntimeException("@layoutInject=null");
        }
        //绑定ButterKnife
        unbinder = ButterKnife.bind(this,mView);

        afterBindView();
        return  mView;
    }

    public abstract  void afterBindView();

    @Override
    public void onDestroy() {
        if(unbinder!=null){
            unbinder.unbind();
            unbinder = null;
        }
        super.onDestroy();
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        this.mContext = context;
    }

    protected  View initFragmentView( LayoutInflater inflater,int layoutId){
        return inflater.inflate(layoutId,null);
    };
}
