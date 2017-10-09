package hrsoft.test_monitor.mvp.contract;

import hrsoft.test_monitor.base.BaseContract;

/**
 * @author YangCihang
 * @since 17/10/9.
 * email yangcihang@hrsoft.net
 */

public interface MineContract {
    interface View extends BaseContract.View<Presenter>{
    }
    interface Presenter extends BaseContract.Presenter{

    }
}
