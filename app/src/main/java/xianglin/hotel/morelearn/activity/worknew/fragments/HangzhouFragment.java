package xianglin.hotel.morelearn.activity.worknew.fragments;

import android.widget.TextView;

import butterknife.BindView;
import xianglin.hotel.morelearn.R;
import xianglin.hotel.morelearn.activity.BaseFrament;
import xianglin.hotel.morelearn.annotation.LayoutInject;

@LayoutInject(getLayout = R.layout.fragment_hangzhou)
public class HangzhouFragment extends BaseFrament {


    @BindView(R.id.tv_hangzhou_title)
    TextView tvHangzhouTitle;

    @Override
    public void afterBindView() {

    }
}
