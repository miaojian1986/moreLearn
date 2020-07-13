package xianglin.hotel.morelearn.mvp;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

//2020/07/10 miaojian
public class MvpController implements IlifeCircle {


    private Set<IlifeCircle> ilifeCircleSet = new HashSet<>();

    public static MvpController newInstance() {
        return new MvpController();
    }

    public void savePresenter(IlifeCircle ilifeCircle) {
        this.ilifeCircleSet.add(ilifeCircle);
    }

    @Override
    public void onCreate(Bundle saveIntent, Intent intent, Bundle getArguments) {
        Iterator<IlifeCircle> iterator = this.ilifeCircleSet.iterator();
        while (iterator.hasNext()) {
            IlifeCircle next = iterator.next();
            if (intent == null) {
                intent = new Intent();
            }
            if (getArguments == null) {
                getArguments = new Bundle();
            }
            next.onCreate(saveIntent, intent, getArguments);
        }
    }

    @Override
    public void onActivityCreated(Bundle saveIntent, Intent intent, Bundle getArguments) {
        Iterator<IlifeCircle> iterator = this.ilifeCircleSet.iterator();
        while (iterator.hasNext()) {
            IlifeCircle next = iterator.next();
            if (intent == null) {
                intent = new Intent();
            }
            if (getArguments == null) {
                getArguments = new Bundle();
            }
            if (saveIntent == null) {
                saveIntent = new Bundle();
            }
            next.onActivityCreated(saveIntent, intent, getArguments);
        }
    }

    @Override
    public void onStart() {
        Iterator<IlifeCircle> iterator = this.ilifeCircleSet.iterator();
        while (iterator.hasNext()) {
            IlifeCircle next = iterator.next();
            next.onStart();
        }
    }

    @Override
    public void onResume() {
        Iterator<IlifeCircle> iterator = this.ilifeCircleSet.iterator();
        while (iterator.hasNext()) {
            IlifeCircle next = iterator.next();
            next.onResume();
        }
    }

    @Override
    public void onPause() {
        Iterator<IlifeCircle> iterator = this.ilifeCircleSet.iterator();
        while (iterator.hasNext()) {
            IlifeCircle next = iterator.next();
            next.onPause();
        }
    }

    @Override
    public void onStop() {
        Iterator<IlifeCircle> iterator = this.ilifeCircleSet.iterator();
        while (iterator.hasNext()) {
            IlifeCircle next = iterator.next();
            next.onStop();
        }
    }

    @Override
    public void onDestory() {
        Iterator<IlifeCircle> iterator = this.ilifeCircleSet.iterator();
        while (iterator.hasNext()) {
            IlifeCircle next = iterator.next();
            next.onDestory();
        }
    }

    @Override
    public void destroyedView() {
        Iterator<IlifeCircle> iterator = this.ilifeCircleSet.iterator();
        while (iterator.hasNext()) {
            IlifeCircle next = iterator.next();
            next.destroyedView();
        }
    }

    @Override
    public void onViewDestroy() {
        Iterator<IlifeCircle> iterator = this.ilifeCircleSet.iterator();
        while (iterator.hasNext()) {
            IlifeCircle next = iterator.next();
            next.onViewDestroy();
        }
    }

    @Override
    public void onNewIntent(Intent intent) {
        Iterator<IlifeCircle> iterator = this.ilifeCircleSet.iterator();
        while (iterator.hasNext()) {
            IlifeCircle next = iterator.next();
            if (intent == null) {
                intent = new Intent();
            }
            next.onNewIntent(intent);
        }
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        Iterator<IlifeCircle> iterator = this.ilifeCircleSet.iterator();
        while (iterator.hasNext()) {
            IlifeCircle next = iterator.next();
            next.onActivityResult(requestCode, resultCode, data);
        }
    }

    @Override
    public void onsaveInstanceState(Bundle bundle) {
        Iterator<IlifeCircle> iterator = this.ilifeCircleSet.iterator();
        while (iterator.hasNext()) {
            IlifeCircle next = iterator.next();
            if (bundle == null) {
                bundle = new Bundle();
            }
            next.onsaveInstanceState(bundle);
        }
    }

    @Override
    public void attachView(IMvpView iMvpView) {
        Iterator<IlifeCircle> iterator = this.ilifeCircleSet.iterator();
        while (iterator.hasNext()) {
            IlifeCircle next = iterator.next();
            next.attachView(iMvpView);
        }
    }



}
