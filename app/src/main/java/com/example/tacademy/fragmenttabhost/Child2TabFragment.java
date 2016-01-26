package com.example.tacademy.fragmenttabhost;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Tacademy on 2016-01-26.
 */
public class Child2TabFragment extends Fragment{
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_child2_tab, container, false);
    }
    @Override
    public void onResume() {
        super.onResume();
        getActivity().setTitle("child2");
    }
}
