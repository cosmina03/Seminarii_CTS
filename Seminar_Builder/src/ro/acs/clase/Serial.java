package ro.acs.clase;

public class Serial {
    String nume;
    int nrEpisoade;
    int nrSezoane;//default sa fie 1
    boolean areLimitaVarsta;
    String limbaProductie;
    String gen;

    private Serial() {
    }

    private Serial(String nume, int nrEpisoade, int nrSezoane, boolean areLimitaVarsta, String limbaProductie, String gen) {
        this.nume = nume;
        this.nrEpisoade = nrEpisoade;
        this.nrSezoane = nrSezoane;
        this.areLimitaVarsta = areLimitaVarsta;
        this.limbaProductie = limbaProductie;
        this.gen = gen;
    }

    public String nume() {
        return nume;
    }

    public int nrEpisoade() {
        return nrEpisoade;
    }

    public int nrSezoane() {
        return nrSezoane;
    }

    public boolean areLimitaVarsta() {
        return areLimitaVarsta;
    }

    public String limbaProductie() {
        return limbaProductie;
    }

    public String gen() {
        return gen;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Serial{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", nrEpisoade=").append(nrEpisoade);
        sb.append(", nrSezoane=").append(nrSezoane);
        sb.append(", areLimitaVarsta=").append(areLimitaVarsta);
        sb.append(", limbaProductie='").append(limbaProductie).append('\'');
        sb.append(", gen='").append(gen).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public static class SerialBuilder{
        String nume;
        int nrEpisoade;
        int nrSezoane;//default sa fie 1
        boolean areLimitaVarsta;
        String limbaProductie;
        String gen;

        public SerialBuilder(String titlu, int nrEpisoade){
            this.nume=titlu;
            this.nrEpisoade=nrEpisoade;
            this.nrSezoane=1;
        }

        public SerialBuilder setNrSezoane(int nrSezoane) {
            this.nrSezoane = nrSezoane;
            return this;
        }

        public SerialBuilder setAreLimitaVarsta(boolean areLimitaVarsta) {
            this.areLimitaVarsta = areLimitaVarsta;
            return this;
        }

        public SerialBuilder setLimbaProductie(String limbaProductie) {
            this.limbaProductie = limbaProductie;
            return this;
        }

        public SerialBuilder setGen(String gen) {
            this.gen = gen;
            return this;
        }
        public Serial build(){
          //  Serial serial=new Serial(nume,nrEpisoade,nrSezoane,areLimitaVarsta,limbaProductie,gen);
            Serial serial=new Serial();
            serial.nume=this.nume;
            serial.nrEpisoade=nrEpisoade;
            serial.nrSezoane=nrSezoane;
            serial.gen=gen;
            serial.limbaProductie=limbaProductie;
            serial.areLimitaVarsta=areLimitaVarsta;
            return serial;
        }
    }
}
