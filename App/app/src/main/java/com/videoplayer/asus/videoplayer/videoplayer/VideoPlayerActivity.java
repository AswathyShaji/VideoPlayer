package com.videoplayer.asus.videoplayer.videoplayer;

import android.app.ProgressDialog;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.MediaController;
import android.widget.VideoView;

import com.videoplayer.asus.videoplayer.R;

public class VideoPlayerActivity extends AppCompatActivity {


    private String filename;
    VideoView vv;
    private MediaController mediaControls;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_player);
        System.gc();
        Intent i = getIntent();
        Bundle extras = i.getExtras();
        filename = extras.getString("videofilename");
        // vv = new VideoView(getApplicationContext());
        setContentView(R.layout.activity_video_player);
        vv = (VideoView) findViewById(R.id.vdoview1);
        vv.setVideoPath(filename);
        vv.setMediaController(new MediaController(this));
        vv.requestFocus();
        vv.start();



    }

}

