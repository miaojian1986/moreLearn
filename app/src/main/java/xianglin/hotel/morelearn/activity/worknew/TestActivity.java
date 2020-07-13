package xianglin.hotel.morelearn.activity.worknew;


import android.util.Log;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;


import butterknife.BindView;
import butterknife.OnClick;
import xianglin.hotel.morelearn.R;
import xianglin.hotel.morelearn.activity.BaseActivityFullScreen;
import xianglin.hotel.morelearn.annotation.LayoutInject;

@LayoutInject(getLayout = R.layout.activity_test)
public class TestActivity extends BaseActivityFullScreen implements ITestActivityContract.Iview {


    ITestActivityContract.Ipresenter ipresenter;

    @BindView(R.id.ic_back)
    ImageView icBack;
    @BindView(R.id.tv_title)
    TextView tvTitle;
    @BindView(R.id.rel_head_contains)
    RelativeLayout relHeadContains;

    @Override
    public void afterBindView() {
        tvTitle.setText(R.string.test_title);
        ipresenter = new TestPresenter(this);
        ipresenter.pdo();
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
    public void viewDo() {
        Log.i("iTestActivityContract", "viewDo");
    }


}
