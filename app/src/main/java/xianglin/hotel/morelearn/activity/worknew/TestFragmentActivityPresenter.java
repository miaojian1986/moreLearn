package xianglin.hotel.morelearn.activity.worknew;






import androidx.fragment.app.Fragment;

import xianglin.hotel.morelearn.R;
import xianglin.hotel.morelearn.activity.worknew.fragments.BeijingFragment;
import xianglin.hotel.morelearn.activity.worknew.fragments.HangzhouFragment;
import xianglin.hotel.morelearn.activity.worknew.fragments.ShangHaiFragment;
import xianglin.hotel.morelearn.activity.worknew.fragments.ShenzhenFragment;
import xianglin.hotel.morelearn.annotation.LayoutInject;
import xianglin.hotel.morelearn.mvp.base.BaseMvpPresenter;


@LayoutInject(getLayout = R.layout.activity_testfragment)
public class TestFragmentActivityPresenter extends BaseMvpPresenter<ITestActivityFragmentContract.Iview>
        implements ITestActivityFragmentContract.Ipresenter {


    //当前fragment的角标
    private int mCurrentFragmentIndex;
    private Fragment[] mFragments = new Fragment[4];
    private int mCurrentRadioId;

    public TestFragmentActivityPresenter(ITestActivityFragmentContract.Iview view) {
        super(view);
    }

    @Override
    protected ITestActivityFragmentContract.Iview getEmptyView() {
        return ITestActivityFragmentContract.emptView;
    }

    @Override
    public void initFragment() {
        mCurrentFragmentIndex = 0;
        replaceFragment(mCurrentFragmentIndex);
    }

    //切换fragment的方法
    public void replaceFragment(int mCurrentFragmentIndex) {
        //隐藏上一个fragment
        hideFragment( mFragments[this.mCurrentFragmentIndex]);
        Fragment mFragment = mFragments[mCurrentFragmentIndex];
        if (mFragment != null) {
            addAndShowFragment(mFragment);
            setCurrentCheck(mCurrentFragmentIndex);
        } else {
            newCurrentFragment(mCurrentFragmentIndex);
            setCurrentCheck(mCurrentFragmentIndex);
        }
    }
    
    //记录当前角标
    private void setCurrentCheck(int mCurrentFragmentIndex) {
        this.mCurrentFragmentIndex = mCurrentFragmentIndex;
        switch (mCurrentFragmentIndex){
            case 0:
               mCurrentRadioId = R.id.rb_shanghai;
               break;
            case 1:
                mCurrentRadioId = R.id.rb_shenzhen;
                break;
            case 2:
                mCurrentRadioId = R.id.rb_hangzhou;
                break;
            case 3:
                mCurrentRadioId = R.id.rb_beijing;
                break;
        }
    }
    //创建fragment
    private void newCurrentFragment(int mCurrentFragmentIndex) {
        Fragment fragment = null;
        switch (mCurrentFragmentIndex) {
            case 0:
                fragment = new ShangHaiFragment();
                break;
            case 1:
                fragment = new ShenzhenFragment();
                break;
            case 2:
                fragment = new HangzhouFragment();
                break;
            case 3:
                fragment = new BeijingFragment();
                break;
        }
        mFragments[mCurrentFragmentIndex] = fragment;
        addAndShowFragment(fragment);
    }

    //显示fragment
    private void addAndShowFragment(Fragment mFragment) {
        if(mFragment.isAdded()){
            getView().showFragment(mFragment);
        }else{
            getView().addFragment(mFragment);
        }
    }

    //隐藏fragment
    private void hideFragment(Fragment mFragment) {
        if(mFragment != null){
              getView().hideFragment(mFragment);
        }
       
    }
}
