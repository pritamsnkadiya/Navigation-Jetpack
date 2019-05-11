package com.example.pritamsankadiya.tabnavigation;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;

public class SplashFragment extends Fragment {

    public Handler handler;
    private Context context;
    private Activity activity;

    public SplashFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        this.context = context;
        this.activity = getActivity();
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                NavController navController = Navigation.findNavController(activity, R.id.container);
                navController.navigate(R.id.show_tabs);
            }
        }, 1000);


        return inflater.inflate(R.layout.fragment_splash, container, false);

    }

    @Override
    public void onDetach() {
        super.onDetach();

    }
}
