package pl.sternik.kk.kaczki;

import pl.sternik.kk.kaczki.kwakanie.Kwaczka;
import pl.sternik.kk.kaczki.latanie.Latajaca;

public class DzikaKaczka extends Kaczka {

    public DzikaKaczka(String nazwa) {
        super("Dzika:" + nazwa, new Latajaca(), new Kwaczka());
    }
}
