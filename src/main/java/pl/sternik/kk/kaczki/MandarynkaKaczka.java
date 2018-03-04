package pl.sternik.kk.kaczki;

import pl.sternik.kk.kaczki.kwakanie.Kwaczka;
import pl.sternik.kk.kaczki.latanie.Latajaca;

public class MandarynkaKaczka extends Kaczka {

    public MandarynkaKaczka(String nazwa) {
        super("Mandarynka:"+nazwa, new Latajaca(), new Kwaczka());
    }
}
