package pl.sternik.kk.kaczki;

import pl.sternik.kk.kaczki.kwakanie.Niemowa;
import pl.sternik.kk.kaczki.latanie.Nielot;

public class DrewnianaKaczka extends Kaczka {

    public DrewnianaKaczka(String nazwa) {
        super("Drewniana:"+nazwa, new Nielot(), new Niemowa());
    }

}
