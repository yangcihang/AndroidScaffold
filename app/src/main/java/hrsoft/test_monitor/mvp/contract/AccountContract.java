package hrsoft.test_monitor.mvp.contract;

import java.util.List;

import hrsoft.test_monitor.base.BaseContract;

/**
 * @author YangCihang
 * @since 17/10/11.
 * email yangcihang@hrsoft.net
 */

public interface AccountContract {

    interface View extends BaseContract.View<Presenter> {
        void onLoginSuccess(List<String> models);
    }

    interface Presenter extends BaseContract.Presenter {
        void requestLogin();
    }
}
