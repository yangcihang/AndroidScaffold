package hrsoft.test_monitor.mvp.view.main.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import hrsoft.test_monitor.base.adapter.BaseRecyclerViewAdapter;

/**
 * @author YangCihang
 * @since 17/10/11.
 * email yangcihang@hrsoft.net
 */

public class TestAdapter extends BaseRecyclerViewAdapter<String> {

    public TestAdapter(Context context) {
        super(context);
    }

    @Override
    public ViewHolder<String> onCreateViewHolder(ViewGroup parent, int viewType) {
        TextView textView = new TextView(context);
        return new ItemHolder(textView);
    }

    private class ItemHolder extends ViewHolder<String> {
        public ItemHolder(View itemView) {
            super(itemView);
        }

        @Override
        protected void onBind(String s, int position) {
            ((TextView) itemView).setText(s);
        }
    }
}
