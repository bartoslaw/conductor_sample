package com.example.admin.conductorfun.changehandlers;

import android.animation.Animator;
import android.support.annotation.NonNull;
import android.view.View;
import android.view.ViewGroup;

import com.bluelinelabs.conductor.changehandler.AnimatorChangeHandler;

/**
 * Created by admin on 08.09.2016.
 */
public class CustomChangeHandler extends AnimatorChangeHandler {
    @Override
    protected Animator getAnimator(@NonNull ViewGroup container, View from, View to, boolean isPush, boolean toAddedToContainer) {
        return null;
    }

    @Override
    protected void resetFromView(@NonNull View from) {

    }
}
