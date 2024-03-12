package MainToRunClasses;

import CustomClasses.MusicianClient;

public class MusicianClass {
    public static void main(String[] args) {
        MusicianClient nin = new MusicianClient("Nine Inch Nails", 2, "Great Below");
        MusicianClient bgt = new MusicianClient("Big Time Rush", 4,"Something");
        MusicianClient slipknot = new MusicianClient("Slipknot", 9, "Wait and bleed");
        MusicianClient blank = new MusicianClient();

        MusicianClient [] musicians = {nin, bgt, slipknot, blank};

        for(MusicianClient musician: musicians){
            System.out.println(musician);
        }
    }
}
