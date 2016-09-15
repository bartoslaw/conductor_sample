package com.example.admin.conductorfun.controllers;

import android.content.Intent;

import com.bluelinelabs.conductor.RouterTransaction;
import com.bluelinelabs.conductor.changehandler.HorizontalChangeHandler;
import com.bluelinelabs.conductor.changehandler.SimpleSwapChangeHandler;
import com.example.admin.conductorfun.R;

import butterknife.OnClick;

/**
 * Created by admin on 08.09.2016.
 */
public class MainController extends BaseController {

    public static final String TAG = MainController.class.getSimpleName();

    @OnClick(R.id.controller_main_button)
    public void onButtonClicked() {
        getRouter().pushController(
                RouterTransaction
                        .with(new SubController())
                        .tag(SubController.TAG)
                        .pushChangeHandler(new SimpleSwapChangeHandler())
                        .popChangeHandler(new HorizontalChangeHandler()));
    }

    @Override
    protected int getControllerLayout() {
        return R.layout.controller_main;
    }

    @Override
    protected void onControllerReady() {
        setRetainViewMode(RetainViewMode.RETAIN_DETACH);
    }

    @Override
    public boolean handleBack() {
        return super.handleBack();
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
    }
}
