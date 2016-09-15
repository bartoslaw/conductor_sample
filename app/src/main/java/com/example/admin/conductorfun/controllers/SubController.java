package com.example.admin.conductorfun.controllers;

import com.bluelinelabs.conductor.RouterTransaction;
import com.bluelinelabs.conductor.changehandler.FadeChangeHandler;
import com.example.admin.conductorfun.R;

import butterknife.OnClick;

/**
 * Created by admin on 08.09.2016.
 */
public class SubController extends BaseController {
    public static final String TAG = SubController.class.getSimpleName();

    @OnClick(R.id.subcontroller_button)
    public void onButtonClick() {
        getRouter().pushController(
                RouterTransaction
                        .with(new ThirdController())
                        .tag(ThirdController.TAG)
                        .pushChangeHandler(new FadeChangeHandler())
                        .popChangeHandler(new FadeChangeHandler()));
    }

    @Override
    protected int getControllerLayout() {
        return R.layout.controller_sub;
    }

    @Override
    protected void onControllerReady() {

    }
}
