package xianglin.hotel.morelearn.activity.worknew;


import xianglin.hotel.morelearn.mvp.IMvpView;
import xianglin.hotel.morelearn.mvp.IlifeCircle;
import xianglin.hotel.morelearn.mvp.MvpController;

public interface ITestActivityContract {

    interface Iview extends IMvpView {
        void viewDo();
    }

    interface  Ipresenter extends IlifeCircle {

        void pdo();
    }

    Iview emptView = new Iview() {
        @Override
        public void viewDo() {

        }

        @Override
        public MvpController getMvpController() {
            return null;
        }
    };
}
