package xianglin.hotel.morelearn.mvp;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;

public interface IlifeCircle {

    void onCreate(Bundle saveIntent, Intent intent, Bundle getArguments);

    void onActivityCreated(Bundle saveIntent, Intent intent, Bundle getArguments);

    void onStart();

    void onResume();

    void onPause();

    void onStop();

    void onDestory();

    void destroyedView();

    void onViewDestroy();

    void onNewIntent(Intent intent);

    void onActivityResult(int requestCode, int resultCode, @Nullable Intent data);

    void onsaveInstanceState(Bundle bundle);

    void attachView(IMvpView iMvpView);
}
