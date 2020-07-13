package xianglin.hotel.morelearn.activity.worknew;


import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import butterknife.BindView;
import xianglin.hotel.morelearn.R;
import xianglin.hotel.morelearn.activity.BaseActivityFullScreen;
import xianglin.hotel.morelearn.annotation.ConstantTool;
import xianglin.hotel.morelearn.annotation.LayoutInject;


@LayoutInject(getLayout = R.layout.activity_testfragment)
public class TestFragmentActivity extends BaseActivityFullScreen implements ITestActivityFragmentContract.Iview {


    TestFragmentActivityPresenter mPresenter = new TestFragmentActivityPresenter(this);

    @BindView(R.id.ic_back)
    ImageView icBack;
    @BindView(R.id.tv_title)
    TextView tvTitle;
    @BindView(R.id.rel_head_contains)
    RelativeLayout relHeadContains;
    @BindView(R.id.rb_shanghai)
    RadioButton rbShanghai;
    @BindView(R.id.rb_shenzhen)
    RadioButton rbShenzhen;
    @BindView(R.id.rb_hangzhou)
    RadioButton rbHangzhou;
    @BindView(R.id.rb_beijing)
    RadioButton rbBeijing;

    @Override
    public void afterBindView() {
        tvTitle.setText("fragment测试");
        initFragment();
        setclickListener();
    }

    private void setclickListener() {
        rbShanghai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mPresenter.replaceFragment(ConstantTool.SHANGHAI);
            }
        });
        rbShenzhen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mPresenter.replaceFragment(ConstantTool.SHENZHEN);
            }
        });
        rbHangzhou.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mPresenter.replaceFragment(ConstantTool.HANGZHOU);
            }
        });
        rbBeijing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mPresenter.replaceFragment(ConstantTool.BEIJING);
            }
        });
    }

    private void initFragment() {
        mPresenter.initFragment();
    }


    @Override
    protected ImageView initIcBack() {
        return icBack;
    }

    @Override
    protected RelativeLayout initRelHead() {
        return relHeadContains;
    }


    @Override
    public void showFragment(Fragment mFragment) {
        getSupportFragmentManager().beginTransaction().show(mFragment).commit();
    }

    @Override
    public void addFragment(Fragment mFragment) {
        getSupportFragmentManager().beginTransaction().add(R.id.frag_main, mFragment).commit();
    }

    @Override
    public void hideFragment(Fragment mFragment) {
        getSupportFragmentManager().beginTransaction().hide(mFragment).commit();
    }
}
