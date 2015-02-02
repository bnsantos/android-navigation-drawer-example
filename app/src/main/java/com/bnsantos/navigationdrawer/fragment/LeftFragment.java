package com.bnsantos.navigationdrawer.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.bnsantos.navigationdrawer.R;
import com.bnsantos.navigationdrawer.activity.MainActivity;

public class LeftFragment extends Fragment implements AdapterView.OnItemClickListener {
    private ListView mListView;

    public LeftFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_left, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mListView = (ListView)view.findViewById(R.id.leftListView);
        String[] planets = getResources().getStringArray(R.array.countries);
        mListView.setAdapter(new ArrayAdapter<>(getActivity(), android.R.layout.simple_list_item_1, planets));
        mListView.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        ((MainActivity)getActivity()).togle();
    }
}
