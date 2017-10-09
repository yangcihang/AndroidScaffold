package hrsoft.test_monitor.mvp.contract;

import hrsoft.test_monitor.base.BaseContract;

/**
 * @author YangCihang
 * @since 17/10/9.
 * email yangcihang@hrsoft.net
 */

public interface MainContract {
    interface View extends BaseContract.View<MainContract.Presenter> {
        void onDataLoadedSuccess();
    }

    interface Presenter extends BaseContract.Presenter {
        void requestData();
    }
}

