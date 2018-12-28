package dev.manifest.beatbox;

import android.support.v4.app.Fragment;
import android.os.Bundle;

public class BeatBoxActivity extends SingleFragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_beat_box);
    }

    @Override
    protected Fragment createFragment() {
        return BeatBoxFragment.newInstance();
    }
}
