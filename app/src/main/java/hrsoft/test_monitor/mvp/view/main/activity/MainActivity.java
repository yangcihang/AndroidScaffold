package hrsoft.test_monitor.mvp.view.main.activity;


import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.List;

import butterknife.BindView;
import hrsoft.test_monitor.R;
import hrsoft.test_monitor.base.activity.ToolbarPresenterActivity;
import hrsoft.test_monitor.mvp.contract.MainContract;
import hrsoft.test_monitor.mvp.presenter.MainPresenter;
import hrsoft.test_monitor.mvp.view.main.adapter.TestAdapter;
import hrsoft.test_monitor.widget.RefreshView;

public class MainActivity extends ToolbarPresenterActivity<MainContract.Presenter> implements MainContract.View {
    @BindView(R.id.rec_test)
    RecyclerView testRec;
    @BindView(R.id.refresh_test)
    RefreshView testRefresh;

    private TestAdapter adapter;

    @Override
    public MainContract.Presenter initPresenter() {
        return new MainPresenter(this);
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    protected void initVariable() {
        adapter = new TestAdapter(this);
    }

    @Override
    protected void initView() {
        testRec.setLayoutManager(new LinearLayoutManager(this));
        testRec.setAdapter(adapter);
    }

    @Override
    protected void loadData() {
        testRefresh.setOnRefreshListener(new RefreshView.PullToRefreshListener() {
            @Override
            public void onRefresh() {
                mPresenter.requestData();
            }
        }, 12);
    }

    @Override
    public void onDataLoadedSuccess(List<String> models) {
        adapter.setData(models);
        testRefresh.finishRefreshing();
    }
}
