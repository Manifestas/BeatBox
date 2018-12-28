package dev.manifest.beatbox;

public class Sound {

    private String assetPath;
    private String name;

    public Sound(String assetPath) {
        this.assetPath = assetPath;
        String[] components = assetPath.split("/");
        String fileName = components[components.length -1];
        name = fileName.replace(".wav", "");
    }

    public String getAssetPath() {
        return assetPath;
    }

    public String getName() {
        return name;
    }
}
