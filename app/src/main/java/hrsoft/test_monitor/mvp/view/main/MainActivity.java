package hrsoft.test_monitor.mvp.view.main;

import hrsoft.test_monitor.R;
import hrsoft.test_monitor.base.activity.ToolbarActivityPresenter;
import hrsoft.test_monitor.mvp.contract.MainContract;
import hrsoft.test_monitor.mvp.presenter.MainPresenter;
import hrsoft.test_monitor.util.ToastUtil;

public class MainActivity extends ToolbarActivityPresenter<MainContract.Presenter> implements MainContract.View {

    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    protected void initVariable() {
    }

    @Override
    protected void initView() {
        mPresenter.requestData();
    }

    @Override
    protected void loadData() {

    }

    @Override
    public MainContract.Presenter initPresenter() {
        return new MainPresenter(this);
    }

    @Override
    public void onDataLoadedSuccess() {
        ToastUtil.showToast("123123");
    }
}

