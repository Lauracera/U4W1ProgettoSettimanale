package it.epicode.Audio;

import it.epicode.ElementoMultimediale;

public class Audio extends ElementoMultimediale {
    public String titleAudio;
    public int duration;
    public int volume = 0;

    public Audio(String title, int duration, int volume){
        this.titleAudio = title;
        this.duration = duration;
        this.volume = volume;
    }

    public int abbassaVolume(){
       if(volume > 0){
            this.volume = volume -1;
       }
       return this.volume;
    }

    public int alzaVolume(){
        this.volume = volume +1;
        return this.volume;
    }



   public String play(){
        for( int i = 0; i< this.volume; i++){
            this.titleAudio += "!" ;
        }
        return this.titleAudio;


   }
}

