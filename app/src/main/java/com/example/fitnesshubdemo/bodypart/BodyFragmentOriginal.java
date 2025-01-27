package com.example.fitnesshubdemo.bodypart;

import android.app.Activity;
import android.app.Fragment;
import android.view.MotionEvent;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.fitnesshubdemo.MainActivity;


/**
 * Created by angelo on 2015/2/15.
 */
public abstract class BodyFragmentOriginal extends Fragment implements MainActivity.MyTouchListener {
    public ImageView bodyImageView;
    private boolean isMan = true;

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ((MainActivity)activity).registerTouchListener(this);
    }

    @Override
    public void onResume() {
        super.onResume();
        setShowImage(isMan);
    }

    @Override
    public void onTouchEvent(MotionEvent event) {
        if(event.getAction() == MotionEvent.ACTION_UP){
            //Logical processing
        }
    }

    public void setMan(boolean isMan) {
        this.isMan = isMan;
    }

    public abstract void setShowImage(Boolean isMan);

}
