package xianglin.hotel.morelearn.activity.worknew;

import android.util.Log;

import xianglin.hotel.morelearn.mvp.base.BaseMvpPresenter;


public class TestPresenter extends BaseMvpPresenter<ITestActivityContract.Iview>
        implements ITestActivityContract.Ipresenter{


    public TestPresenter(ITestActivityContract.Iview view) {
        super(view);
    }


    public void testDo(){
        getView().viewDo();
    }


    @Override
    public void onDestory() {
        super.onDestory();
        Log.i("TestPresenter","onDestory");
    }

    //防止空指针
    @Override
    protected ITestActivityContract.Iview getEmptyView() {
        return ITestActivityContract.emptView;
    }

    @Override
    public void pdo() {
        Log.i("TestPresenter","pdo");
        testDo();
    }
}
