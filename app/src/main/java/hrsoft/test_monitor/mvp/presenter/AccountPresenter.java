package hrsoft.test_monitor.mvp.presenter;

import hrsoft.test_monitor.base.BasePresenter;
import hrsoft.test_monitor.mvp.contract.AccountContract;

/**
 * @author YangCihang
 * @since 17/10/11.
 * email yangcihang@hrsoft.net
 */

public class AccountPresenter extends BasePresenter<AccountContract.View> implements AccountContract.Presenter {
    /**
     * P层构造方法;
     * 创建P层时就进行双向绑定
     *
     * @param mView V层的引用
     */
    public AccountPresenter(AccountContract.View mView) {
        super(mView);
    }

    @Override
    public void requestLogin() {

    }
}
