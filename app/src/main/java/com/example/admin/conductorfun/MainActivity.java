package com.example.admin.conductorfun;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.ViewGroup;

import com.bluelinelabs.conductor.Conductor;
import com.bluelinelabs.conductor.Router;
import com.bluelinelabs.conductor.RouterTransaction;
import com.bluelinelabs.conductor.changehandler.FadeChangeHandler;
import com.example.admin.conductorfun.controllers.MainController;

/**
 * Created by admin on 08.09.2016.
 */
public class MainActivity extends AppCompatActivity {

    private Router router;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewGroup controllerContainer = (ViewGroup) findViewById(R.id.activity_main_controller_container);

        router = Conductor.attachRouter(this, controllerContainer, savedInstanceState);

        if (!router.hasRootController()) {
            router.setRoot(RouterTransaction
                    .with(new MainController())
                    .tag(MainController.TAG)
                    .pushChangeHandler(new FadeChangeHandler())
                    .popChangeHandler(new FadeChangeHandler()));
        }

    }
}
