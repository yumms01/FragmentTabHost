package com.example.tacademy.fragmenttabhost;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/**
 * Created by Tacademy on 2016-01-26.
 */
public class Tab2Fragment extends Fragment {

    public Tab2Fragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_tab2, container, false);
    }

    @Override
    public void onResume() {
        super.onResume();
        getActivity().setTitle("tab2");
    }

//    @Override
//    public void setUserVisibleHint(boolean isVisibleToUser) {
//        super.setUserVisibleHint(isVisibleToUser);
//        if (isVisibleToUser) {
//            getActivity().setTitle("tab2");
//        }
//    }
}
