package hrsoft.test_monitor.mvp.presenter;

import java.util.ArrayList;
import java.util.List;

import hrsoft.test_monitor.base.BasePresenter;
import hrsoft.test_monitor.mvp.contract.MainContract;
import hrsoft.test_monitor.util.ToastUtil;
import hrsoft.test_monitor.util.Utility;

/**
 * @author YangCihang
 * @since 17/10/9.
 * email yangcihang@hrsoft.net
 */

public class MainPresenter extends BasePresenter<MainContract.View> implements MainContract.Presenter {
    /**
     * P层构造方法;
     * 创建P层时就进行双向绑定
     *
     * @param mView V层的引用
     */
    public MainPresenter(MainContract.View mView) {
        super(mView);
    }

    @Override
    public void requestData() {
        ToastUtil.showToast("123");
        Utility.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                List<String> models = new ArrayList<>();
                for (int i = 0; i < 50; i++) {
                    models.add("" + i);
                }
                mView.onDataLoadedSuccess(models);
            }
        });

    }
}
