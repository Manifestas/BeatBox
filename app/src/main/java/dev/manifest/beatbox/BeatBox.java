package dev.manifest.beatbox;

import android.content.Context;
import android.content.res.AssetManager;
import android.util.Log;

import java.io.IOException;

public class BeatBox {

    public static final String TAG = "BeatBox";
    public static final String SOUNDS_FOLDER = "sample_sounds";

    public AssetManager assets;

    public BeatBox(Context context) {
        assets = context.getAssets();
        loadSounds();
    }

    private void loadSounds() {
        String[] soundNames;
        try {
            soundNames = assets.list(SOUNDS_FOLDER);
            Log.i(TAG, "Found " + soundNames.length + " sounds");
        } catch (IOException ioe) {
            Log.e(TAG, "Could not list assets", ioe);
            return;
        }
    }
}
