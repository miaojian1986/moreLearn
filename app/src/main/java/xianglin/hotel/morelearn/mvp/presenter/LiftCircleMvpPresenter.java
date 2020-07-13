package xianglin.hotel.morelearn.mvp.presenter;



import java.lang.ref.WeakReference;

import xianglin.hotel.morelearn.mvp.IMvpView;
import xianglin.hotel.morelearn.mvp.IlifeCircle;
import xianglin.hotel.morelearn.mvp.MvpController;

public abstract class LiftCircleMvpPresenter<T extends IMvpView> implements IlifeCircle {

    protected WeakReference<T> weakReference;

    protected LiftCircleMvpPresenter() {
        super();
    }

    public LiftCircleMvpPresenter(IMvpView iMvpView) {
        super();
        attachView(iMvpView);
        MvpController mvpController = iMvpView.getMvpController();
        mvpController.savePresenter(this);
    }

    @Override
    public void attachView(IMvpView iMvpView) {
        if (weakReference == null) {
            weakReference = new WeakReference(iMvpView);
        } else {
            T view = weakReference.get();
            if (view != iMvpView) {
                weakReference = new WeakReference(iMvpView);
            }
        }
    }

    @Override
    public void onDestory() {
        weakReference = null;
    }

    protected T getView() {
        T view = weakReference != null ? weakReference.get() : null;

        if (view == null) {
            return getEmptyView();
        }
        return view;
    }

    protected abstract T getEmptyView();
}
