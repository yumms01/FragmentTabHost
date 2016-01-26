package com.example.tacademy.fragmenttabhost;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTabHost;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/**
 * Created by Tacademy on 2016-01-26.
 */
public class Tab1Fragment extends Fragment {

    public Tab1Fragment() {

    }

    FragmentTabHost tabHost;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_tab1, container, false);
        tabHost = (FragmentTabHost)view.findViewById(R.id.tabHost);
        tabHost.setup(getContext(), getChildFragmentManager(), android.R.id.tabcontent);

        tabHost.addTab(tabHost.newTabSpec("child1").setIndicator("차일드1"), Child1TabFragment.class, null);
        tabHost.addTab(tabHost.newTabSpec("child2").setIndicator("차일드2"), Child2TabFragment.class, null);
        return view;
    }
}
