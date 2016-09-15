package com.example.admin.conductorfun.controllers;

import android.os.Handler;
import android.widget.Toast;

import com.example.admin.conductorfun.R;

public class ThirdController extends BaseController {

    public static final String TAG = ThirdController.class.getSimpleName();

    @Override
    protected int getControllerLayout() {
        return R.layout.controller_third;
    }

    @Override
    protected void onControllerReady() {
        Toast.makeText(getActivity(), "In 5 seconds i will pop to root", Toast.LENGTH_SHORT).show();
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                getRouter().popToRoot();
            }
        }, 5000);
    }
}
