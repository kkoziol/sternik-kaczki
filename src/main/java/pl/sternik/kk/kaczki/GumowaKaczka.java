package pl.sternik.kk.kaczki;

import pl.sternik.kk.kaczki.kwakanie.Piskajaca;
import pl.sternik.kk.kaczki.latanie.Nielot;

public class GumowaKaczka extends Kaczka {

    public GumowaKaczka(String nazwa) {
        super("Gumowa:"+nazwa, new Nielot(), new Piskajaca());
    }
}
