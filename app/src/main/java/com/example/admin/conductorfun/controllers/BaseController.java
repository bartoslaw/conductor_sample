package com.example.admin.conductorfun.controllers;

import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bluelinelabs.conductor.Controller;

import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * Created by admin on 14.09.2016.
 */
public abstract class BaseController extends Controller {

    protected abstract int getControllerLayout();

    protected abstract void onControllerReady();

    private Unbinder unbinder;

    @NonNull
    @Override
    protected View onCreateView(@NonNull LayoutInflater inflater, @NonNull ViewGroup container) {
        View view = inflater.inflate(getControllerLayout(), container, false);
        ;
        unbinder = ButterKnife.bind(this, view);
        return view;
    }

    @Override
    protected void onDestroyView(View view) {
        unbinder.unbind();
        super.onDestroyView(view);
    }
}
