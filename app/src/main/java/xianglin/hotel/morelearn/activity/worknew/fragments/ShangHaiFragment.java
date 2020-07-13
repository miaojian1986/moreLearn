package xianglin.hotel.morelearn.activity.worknew.fragments;

import android.widget.TextView;

import butterknife.BindView;
import xianglin.hotel.morelearn.R;
import xianglin.hotel.morelearn.activity.BaseFrament;
import xianglin.hotel.morelearn.annotation.LayoutInject;

@LayoutInject(getLayout = R.layout.fragment_shanghai)
public class ShangHaiFragment extends BaseFrament {


    @BindView(R.id.tv_shanghai)
    TextView tvShanghai;

    @Override
    public void afterBindView() {

    }
}
