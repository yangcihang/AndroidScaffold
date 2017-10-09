package hrsoft.test_monitor.common;

/**
 * @author YangCihang
 * @since 17/10/9.
 * email yangcihang@hrsoft.net
 */

public class LogicErrorException extends Throwable {
    public LogicErrorException() {
        super("逻辑上不可达的代码，请检查！！！");
    }
}
