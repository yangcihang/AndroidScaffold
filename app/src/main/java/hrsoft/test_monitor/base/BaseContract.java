package hrsoft.test_monitor.base;

/**
 * @author YangCihang
 * @since 17/10/9.
 * email yangcihang@hrsoft.net
 */

public interface BaseContract {

    interface View<T extends Presenter>{
        void setPresenter(T presenter);
    }
    interface Presenter{
        //销毁
        void destroy();
    }
}
