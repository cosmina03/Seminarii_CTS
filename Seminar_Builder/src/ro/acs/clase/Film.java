package ro.acs.clase;

public class Film {
    String titlu;
    int anAparitie;
    String gen;
    boolean areLimitaVarsta;
    int durataInMinute;
    String limbaProductie;
    boolean esteDisponibilIn4D;
    int anProductie;

    Film() {
    }

    Film(String titlu, int anAparitie, String gen, boolean areLimitaVarsta, int durataInMinute, String limbaProductie, boolean esteDisponibilIn4D, int anProductie) {
        this.titlu = titlu;
        this.anAparitie = anAparitie;
        this.gen = gen;
        this.areLimitaVarsta = areLimitaVarsta;
        this.durataInMinute = durataInMinute;
        this.limbaProductie = limbaProductie;
        this.esteDisponibilIn4D = esteDisponibilIn4D;
        this.anProductie = anProductie;
    }

    public String titlu() {
        return titlu;
    }

    public int anAparitie() {
        return anAparitie;
    }

    public String gen() {
        return gen;
    }

    public boolean areLimitaVarsta() {
        return areLimitaVarsta;
    }

    public int durataInMinute() {
        return durataInMinute;
    }

    public String limbaProductie() {
        return limbaProductie;
    }

    public boolean esteDisponibilIn4D() {
        return esteDisponibilIn4D;
    }

    public int anProductie() {
        return anProductie;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Film{");
        sb.append("titlu='").append(titlu).append('\'');
        sb.append(", anAparitie=").append(anAparitie);
        sb.append(", gen='").append(gen).append('\'');
        sb.append(", areLimitaVarsta=").append(areLimitaVarsta);
        sb.append(", durataInMinute=").append(durataInMinute);
        sb.append(", limbaProductie='").append(limbaProductie).append('\'');
        sb.append(", esteDisponibilIn4D=").append(esteDisponibilIn4D);
        sb.append(", anProductie=").append(anProductie);
        sb.append('}');
        return sb.toString();
    }

    public static class FilmBuilder{
        private Film film=null;
        public FilmBuilder(String titlu, int anAparitie){
            this.film=new Film();
            this.film.titlu=titlu;
            this.film.anAparitie=anAparitie;
        }

        public FilmBuilder addGen(String gen){
            this.film.gen=gen;
            return this;
        }
        public FilmBuilder addAreLimitaVarsta(){
            this.film.areLimitaVarsta=true;
            return this;
        }
        public FilmBuilder addDurataInMinute(int durata){
            this.film.durataInMinute=durata;
            return this;
        }
        public FilmBuilder addLimbaProductie(String limbaProductie){
            this.film.limbaProductie=limbaProductie;
            return this;
        }
        public FilmBuilder addEsteDisponibilIn4D(){
            this.film.esteDisponibilIn4D=true;
            return this;
        }
        public FilmBuilder addAnProductie(int anProductie){
            this.film.anProductie=anProductie;
            return this;
        }
        public Film build(){
            return this.film;
        }

    }
}
