package com.augustosalazar.as_android_importantlibraries;


import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;

import java.security.cert.LDAPCertStoreParameters;
import java.util.Random;

import eventBus.MessageEvent;


/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment2 extends Fragment {

    @Override
    public void onStart() {
        super.onStart();
        Log.d(General.TAG, "F2 On start");
        EventBus.getDefault().register(this);
    }

    @Override
    public void onStop() {
        EventBus.getDefault().unregister(this);
        super.onStop();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_fragment2, container, false);
        Log.d(General.TAG, "F2 onCreateView");
        return v;
    }

    @Subscribe
    public void onMessageEvent(MessageEvent event){
        Log.d(General.TAG, "F2 onMessageEvent "+event.message);
        Random rnd = new Random();
        int color = Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256));
        this.getView().setBackgroundColor(color);
    }

}
