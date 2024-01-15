import it.epicode.Audio.Audio;
import it.epicode.Multimedia.ElementoMultimediale;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Quale titolo vuoi ascoltare? ");
        String inserisciTitolo = scan.nextLine();

        System.out.println("Quanto deve durare la traccia? ");
        int inserisciDurata = scan.nextInt();

        System.out.println("A quanto imposto il volume? ");
        int inserisciVolume = scan.nextInt();


        System.out.println("Quale titolo vuoi ascoltare? ");
        String inserisciTitolo1 = scan.nextLine();

        System.out.println("Quanto deve durare la traccia? ");
        int inserisciDurata1 = scan.nextInt();

        System.out.println("A quanto imposto il volume? ");
        int inserisciVolume1 = scan.nextInt();

        ElementoMultimediale[] multimedia = new ElementoMultimediale[5];
        multimedia[0]= new Audio(inserisciTitolo, inserisciDurata, inserisciVolume);
        multimedia[1]= new Audio (inserisciTitolo1, inserisciDurata1, inserisciVolume1);
        multimedia[0].funzioneAudio();



        }
    }
}