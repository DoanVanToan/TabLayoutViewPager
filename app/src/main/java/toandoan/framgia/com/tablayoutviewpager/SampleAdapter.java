package toandoan.framgia.com.tablayoutviewpager;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.List;

/**
 * Created by framgia on 09/05/2017.
 */

public class SampleAdapter extends RecyclerView.Adapter<SampleAdapter.ViewHolder> {
    private String[] mTitles;
    private LayoutInflater mInflater;

    public SampleAdapter(String[] titles) {
        mTitles = titles;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        if (mInflater == null) {
            mInflater = LayoutInflater.from(parent.getContext());
        }
        View v = mInflater.inflate(android.R.layout.simple_list_item_1, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.bindData(mTitles[position]);
    }

    @Override
    public int getItemCount() {
        return mTitles != null ? mTitles.length : 0;
    }

    static class ViewHolder extends RecyclerView.ViewHolder {
        private TextView mTextTitle;

        public ViewHolder(View itemView) {
            super(itemView);
            mTextTitle = (TextView) itemView.findViewById(android.R.id.text1);
        }

        public void bindData(String title) {
            if (title != null) {
                mTextTitle.setText(title);
            }
        }
    }
}
