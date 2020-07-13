package xianglin.hotel.morelearn.activity.worknew;





import androidx.fragment.app.Fragment;

import xianglin.hotel.morelearn.mvp.IMvpView;
import xianglin.hotel.morelearn.mvp.IlifeCircle;
import xianglin.hotel.morelearn.mvp.MvpController;


public interface ITestActivityFragmentContract {

    interface Iview extends IMvpView {

        void showFragment(Fragment mFragment);

        void addFragment(Fragment mFragment);

        void hideFragment(Fragment mFragment);
    }

    interface  Ipresenter extends IlifeCircle {


        void initFragment();

    }

    ITestActivityFragmentContract.Iview emptView = new ITestActivityFragmentContract.Iview() {


        @Override
        public MvpController getMvpController() {
            return null;
        }

        @Override
        public void showFragment(Fragment mFragment) {

        }

        @Override
        public void addFragment(Fragment mFragment) {

        }

        @Override
        public void hideFragment(Fragment mFragment) {

        }
    };

}
