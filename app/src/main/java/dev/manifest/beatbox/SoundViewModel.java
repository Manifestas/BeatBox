package dev.manifest.beatbox;

public class SoundViewModel {

    private Sound sound;
    private BeatBox beatBox;

    public SoundViewModel(BeatBox beatBox) {
        this.beatBox = beatBox;
    }

    public Sound getSound() {
        return sound;
    }

    public String getTitle() {
        return sound.getName();
    }

    public void setSound(Sound sound) {
        this.sound = sound;
    }
}
