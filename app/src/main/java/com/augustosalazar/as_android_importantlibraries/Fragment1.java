package com.augustosalazar.as_android_importantlibraries;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import org.greenrobot.eventbus.EventBus;

import eventBus.MessageChangeF2;
import eventBus.MessageChangeF3;


/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment1 extends Fragment implements View.OnClickListener {

    Button buttonF2,buttonF3;

    public Fragment1() {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v =  inflater.inflate(R.layout.fragment_fragment1, container, false);

        buttonF2 = (Button) v.findViewById(R.id.button);
        buttonF3 = (Button) v.findViewById(R.id.button2);

        buttonF2.setOnClickListener(this);
        buttonF3.setOnClickListener(this);

        return v;
    }

    @Override
    public void onClick(View v) {

        if (v.getId() == R.id.button) {
            EventBus.getDefault().post(new MessageChangeF2("Changing background for Fragment 2"));
        } else if (v.getId() == R.id.button2){
            EventBus.getDefault().post(new MessageChangeF3("Changing background for Fragment 3"));
        }
    }
}
