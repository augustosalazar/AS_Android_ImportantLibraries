package com.augustosalazar.as_android_importantlibraries;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import org.greenrobot.eventbus.EventBus;

import eventBus.MessageEvent;


/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment1 extends Fragment implements View.OnClickListener {

    Button button;

    public Fragment1() {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v =  inflater.inflate(R.layout.fragment_fragment1, container, false);

        button= (Button) v.findViewById(R.id.button);

        button.setOnClickListener(this);

        return v;
    }

    @Override
    public void onClick(View v) {
        EventBus.getDefault().post(new MessageEvent("Changing background for Fragment 2"));
    }
}
