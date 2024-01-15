package it.epicode.Video;

import it.epicode.Multimedia.ElementoMultimediale;

public class Video extends ElementoMultimediale {


    public Video(String title, int duration, int volume) {
        super(title, duration, volume);
    }

    @Override
    public void funzioneVideo() {
        super.funzioneVideo();
    }

    @Override
    public void funzioneVolume() {
        super.funzioneVolume();
    }

    @Override
    public int aumentaVolume() {
        return super.aumentaVolume();
    }

    @Override
    public int abbassaVolume() {
        return super.abbassaVolume();
    }

    @Override
    public void funzioneLuce(){
        super.funzioneLuce();
    }

    @Override
    public int aumentaLuce(){
        return super.aumentaLuce();
    }

    @Override
    public int abbassaLuce(){
        return super.abbassaLuce();
    }

}
