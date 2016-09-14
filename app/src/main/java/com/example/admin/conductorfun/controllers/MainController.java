package com.example.admin.conductorfun.controllers;

import com.example.admin.conductorfun.R;

import butterknife.OnClick;

/**
 * Created by admin on 08.09.2016.
 */
public class MainController extends BaseController {

    public static final String TAG = MainController.class.getSimpleName();

    @OnClick(R.id.controller_main_button)
    public void onButtonClicked() {
        //todo add code
    }

    @Override
    protected int getControllerLayout() {
        return R.layout.controller_main;
    }

    @Override
    protected void onControllerReady() {

    }
}
