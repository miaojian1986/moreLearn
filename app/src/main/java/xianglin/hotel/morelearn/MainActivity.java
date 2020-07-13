package xianglin.hotel.morelearn;

import android.content.Intent;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.OnClick;
import xianglin.hotel.morelearn.activity.BaseActivityFullScreen;
import xianglin.hotel.morelearn.activity.worknew.TestActivity;
import xianglin.hotel.morelearn.activity.worknew.TestFragmentActivity;
import xianglin.hotel.morelearn.annotation.LayoutInject;

@LayoutInject(getLayout = R.layout.activity_main)
public class MainActivity extends BaseActivityFullScreen {

    @BindView(R.id.ic_back)
    ImageView icBack;
    @BindView(R.id.tv_title)
    TextView tvTitle;
    @BindView(R.id.rel_head_contains)
    RelativeLayout relHeadContains;
    @BindView(R.id.tv_hello)
    TextView tvHello;

    @Override
    public void afterBindView() {
        tvTitle.setText(R.string.main_title);
        tvHello.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, TestFragmentActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    protected ImageView initIcBack() {
        return icBack;
    }

    @Override
    protected RelativeLayout initRelHead() {
        return relHeadContains;
    }

//    @OnClick(R.id.tv_hello)
//    public void onViewClicked() {
//        Intent intent = new Intent(this, TestActivity.class);
//        startActivity(intent);
//    }
}