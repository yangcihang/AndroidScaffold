package hrsoft.test_monitor.mvp.view.mine;

import hrsoft.test_monitor.base.fragment.BaseFragmentPresenter;
import hrsoft.test_monitor.mvp.contract.MineContract;

/**
 * @author YangCihang
 * @since 17/10/9.
 * email yangcihang@hrsoft.net
 */

public class MineFragment extends BaseFragmentPresenter<MineContract.Presenter> implements MineContract.View{
    @Override
    protected MineContract.Presenter initPresenter() {
        return null;
    }

    @Override
    protected int getLayoutId() {
        return 0;
    }

    @Override
    protected void initVariable() {

    }

    @Override
    protected void initView() {

    }

    @Override
    protected void loadData() {

    }
}
