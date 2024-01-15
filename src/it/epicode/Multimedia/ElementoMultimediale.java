package it.epicode.Multimedia;

public abstract class ElementoMultimediale {
    public String titolo;
    public int durata;
    public int volume;
    public int luce;



    //Audio
    public ElementoMultimediale(String title, int duration, int volume){
        this.titolo = title;
        this.durata = duration;
        this.volume = volume;
    }

    //Video
    public ElementoMultimediale(String title, int duration, int volume, int luce){
        this.titolo = title;
        this.durata = duration;
        this.volume = volume;
        this.luce = luce;
    }

    //Image
    public ElementoMultimediale(String title, int luce){
        this.titolo = title;
        this.luce = luce;
    }


    public void funzioneVolume() {
        for(int i = 0; i < this.volume; i++){
            System.out.println("!");
        }
    }

    public void funzioneLuce() {
        for(int i = 0; i < this.luce; i++){
            System.out.println("*");
        }
    }

    public void funzioneAudio(){
        for(int i = 0; i < this.durata; i++){
            System.out.println(this.titolo + " ") ;
            funzioneVolume();
            System.out.println();
        }
    }

    public void funzioneVideo(){
        for(int i = 0; i < this.durata; i++){
            System.out.println(this.titolo + " ");
            funzioneVolume();
            funzioneLuce();
            System.out.println();
        }
    }

    public void funzioneImmagine(){
        for(int i = 0; i < this.luce; i++){
            System.out.println(this.titolo + " ");
            funzioneLuce();
            System.out.println();
        }
    }

    public int aumentaVolume() {
        return this.volume += 1;
    }

    public int abbassaVolume(){
        if (this.volume > 0) {
            return this.volume -= 1;
        } else {
            return this.volume;
        }
    }


    public int aumentaLuce() {
        return this.luce += 1;
    }

    public int abbassaLuce(){
        return this.luce -= 1;
    }




}
