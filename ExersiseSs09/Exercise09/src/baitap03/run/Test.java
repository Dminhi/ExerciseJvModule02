package baitap03.run;

import baitap03.ra.AudioPlayer;
import baitap03.ra.VideoPlayer;

public class Test {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();
        VideoPlayer videoPlayer = new VideoPlayer();
        audioPlayer.play();
        videoPlayer.play();
    }
}
