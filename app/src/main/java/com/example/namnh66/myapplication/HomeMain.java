package com.example.namnh66.myapplication;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import java.util.Date;
import java.util.ArrayList;
import java.util.PriorityQueue;

public class HomeMain extends AppCompatActivity implements View.OnClickListener{
    private LinearLayout btn_home;
    private LinearLayout btn_activites;
    private LinearLayout btn_addlistings;
    private LinearLayout btn_notifications;
    private LinearLayout btn_others;
    private ImageView img_home;
    private ImageView img_activities;
    private ImageView img_addlistings;
    private ImageView img_notifications;
    private ImageView img_others;
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
        setContentView(R.layout.home_main);
        initWiget();
        setEventClickViews();
    }
    private void initWiget(){
        btn_home = (LinearLayout)findViewById(R.id.btn_home);
        btn_activites = (LinearLayout)findViewById(R.id.btn_activities);
        btn_addlistings = (LinearLayout)findViewById(R.id.btn_addlistings);
        btn_notifications = (LinearLayout)findViewById(R.id.btn_notifications);
        btn_others = (LinearLayout)findViewById(R.id.btn_others);
        img_home = (ImageView)findViewById(R.id.img_home);
        img_activities = (ImageView)findViewById(R.id.img_activities);
        img_addlistings = (ImageView)findViewById(R.id.img_addlistings);
        img_notifications = (ImageView)findViewById(R.id.img_notifications);
        img_others = (ImageView)findViewById(R.id.img_others);
    }
    public void setEventClickViews(){
        btn_home.setOnClickListener(this);
        btn_activites.setOnClickListener(this);
        btn_addlistings.setOnClickListener(this);
        btn_notifications.setOnClickListener(this);
        btn_others.setOnClickListener(this);
    }
    public void setImg_home(){
        img_home.setImageResource(R.drawable.home_bottom3x);
    }
    public void setImg_activities(){
        img_activities.setImageResource(R.drawable.activity_bottom3x);
    }
    public void setImg_addlistings(){
        img_addlistings.setImageResource(R.drawable.add_bottom3x);
    }
    public void setImg_notifications(){
        img_notifications.setImageResource(R.drawable.notify_bottom3x);
    }
    public void setImg_others(){
        img_others.setImageResource(R.drawable.more_bottom3x);
    }
    public boolean loadFragment(android.support.v4.app.Fragment fragment){
        if (fragment!=null)
        {
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.fragment_container,fragment)
                    .commit();
            return true;
        }
        return false;
    }
    @Override
    public void onClick(View view) {
        android.support.v4.app.Fragment fragment = null;
        switch (view.getId()){
            case R.id.btn_home:
                setImg_activities();
                setImg_addlistings();
                setImg_notifications();
                setImg_others();
                img_home.setImageResource(R.drawable.home_bottom_hl3x);
                fragment = new FragmentHome();
                loadFragment(fragment);
                break;
            case R.id.btn_activities:
                setImg_addlistings();
                setImg_notifications();
                setImg_others();
                setImg_home();
                img_activities.setImageResource(R.drawable.activity_bottom_hl3x);
                fragment = new FragmentActivites();
                loadFragment(fragment);
                break;
            case R.id.btn_addlistings:
                setImg_activities();
                setImg_notifications();
                setImg_others();
                setImg_home();
                img_addlistings.setImageResource(R.drawable.add_bottom_hl3x);
                break;
            case R.id.btn_notifications:
                setImg_activities();
                setImg_addlistings();
                setImg_others();
                setImg_home();
                img_notifications.setImageResource(R.drawable.notify_bottom_hl3x);
                break;
            case R.id.btn_others:
                setImg_activities();
                setImg_addlistings();
                setImg_notifications();
                setImg_home();
                img_others.setImageResource(R.drawable.more_bottom_hl3x);
                break;
            default:
                break;
        }
    }
}
