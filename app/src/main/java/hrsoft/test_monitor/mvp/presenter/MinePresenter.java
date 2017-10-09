package hrsoft.test_monitor.mvp.presenter;

import hrsoft.test_monitor.base.BasePresenter;
import hrsoft.test_monitor.mvp.contract.MineContract;

/**
 * @author YangCihang
 * @since 17/10/9.
 * email yangcihang@hrsoft.net
 */

public class MinePresenter extends BasePresenter<MineContract.View> implements MineContract.Presenter{
    /**
     * P层构造方法;
     * 创建P层时就进行双向绑定
     *
     * @param mView V层的引用
     */
    public MinePresenter(MineContract.View mView) {
        super(mView);
    }
}
