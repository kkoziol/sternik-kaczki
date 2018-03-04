package pl.sternik.kk.kaczki;

public enum KaczkaTypy {
    Dzika {
        @Override
        public Kaczka getInstance(String name) {
            // TODO Auto-generated method stub
            return null;
        }
    },
    Mandarynka {
        @Override
        public Kaczka getInstance(String name) {
            // TODO Auto-generated method stub
            return null;
        }
    },
    Gumowa {
        @Override
        public Kaczka getInstance(String name) {
            // TODO Auto-generated method stub
            return null;
        }
    },
    Drewniana {
        @Override
        public Kaczka getInstance(String name) {
            return new DrewnianaKaczka(name);
        }
    },
    Ges {
        @Override
        public Kaczka getInstance(String name) {
            // TODO Auto-generated method stub
            return null;
        }
    },
    ZepsutaGumowa {
        @Override
        public Kaczka getInstance(String name) {
            // TODO Auto-generated method stub
            return null;
        }
    };
    public abstract Kaczka getInstance(String name);
}
