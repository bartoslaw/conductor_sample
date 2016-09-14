package com.example.admin.conductorfun.controllers;

import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bluelinelabs.conductor.Controller;
import com.example.admin.conductorfun.R;

/**
 * Created by admin on 08.09.2016.
 */
public class MainController extends Controller {

    public static final String TAG = MainController.class.getSimpleName();

    @Bin

    @NonNull
    @Override
    protected View onCreateView(@NonNull LayoutInflater inflater, @NonNull ViewGroup container) {
        return inflater.inflate(R.layout.controller_main, container, false);
    }


}
