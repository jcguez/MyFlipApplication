package mx.com.ceti.myflipapplication;

import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    private VideoView backVideoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Constants
        backVideoView = findViewById(R.id.videoView);
        // Background video
        Uri uri = Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.back_video);
        backVideoView.setVideoURI(uri);
        backVideoView.start();
        backVideoView.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mediaPlayer) {
                mediaPlayer.setLooping(true);
                mediaPlayer.setVolume(0f, 0f);
            }
        });
    }
}
