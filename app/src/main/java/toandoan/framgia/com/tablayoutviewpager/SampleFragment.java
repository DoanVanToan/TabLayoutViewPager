package toandoan.framgia.com.tablayoutviewpager;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * A simple {@link Fragment} subclass.
 */
public class SampleFragment extends Fragment {
    private String[] mTitles = {
            "Android", "iOS", "PHP", "Ruby", "Python", "Java", "C#", "C+", "C++", "Node js",
            "React", "Rail", "Java", ".Net"
    };

    public SampleFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_sample, container, false);
        RecyclerView recyclerView = (RecyclerView) v.findViewById(R.id.recycler_sample);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        SampleAdapter adapter = new SampleAdapter(mTitles);
        recyclerView.setAdapter(adapter);
        return v;
    }
}
