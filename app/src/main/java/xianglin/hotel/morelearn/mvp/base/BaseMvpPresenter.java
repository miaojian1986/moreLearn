package xianglin.hotel.morelearn.mvp.base;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;

import xianglin.hotel.morelearn.mvp.IMvpView;
import xianglin.hotel.morelearn.mvp.presenter.LiftCircleMvpPresenter;


/**
 * 2020/07/10 miaojian
 * @param <T>
 */
public abstract class BaseMvpPresenter<T extends IMvpView> extends LiftCircleMvpPresenter<T> {


    public BaseMvpPresenter(T view){
        super(view);
    }

    @Override
    public void onCreate(Bundle saveIntent, Intent intent, Bundle getArguments) {

    }

    @Override
    public void onActivityCreated(Bundle saveIntent, Intent intent, Bundle getArguments) {

    }

    @Override
    public void onStart() {

    }

    @Override
    public void onResume() {

    }

    @Override
    public void onPause() {

    }

    @Override
    public void onStop() {

    }

    @Override
    public void destroyedView() {

    }

    @Override
    public void onViewDestroy() {

    }

    @Override
    public void onNewIntent(Intent intent) {

    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {

    }

    @Override
    public void onsaveInstanceState(Bundle bundle) {

    }
}
