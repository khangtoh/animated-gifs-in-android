package eu.andlabs.tutorial.animatedgifs;

import java.io.IOException;
import java.io.InputStream;

import android.app.Activity;
import android.os.Bundle;
import eu.andlabs.tutorial.animatedgifs.views.GifDecoderView;
import eu.andlabs.tutorial.animatedgifs.views.GifWebView;

public class AnimationActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        InputStream stream = null;
        try {
            stream = getAssets().open("piggy.gif");
        } catch (IOException e) {
            e.printStackTrace();
        }
        
//        GifMovieView view = new GifMovieView(this, stream);
//        GifDecoderView view = new GifDecoderView(this, stream);
        GifWebView view = new GifWebView(this, "file:///android_asset/piggy.gif");                 
        
        setContentView(view);
    }
}