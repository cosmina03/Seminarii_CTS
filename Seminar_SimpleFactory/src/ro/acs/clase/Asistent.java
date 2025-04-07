package ro.acs.clase;

public class Asistent extends Personal{
    private int spor;

     Asistent(String nume, float salariu, int spor) {
        super(nume, salariu);
        this.spor = spor;
    }

    @Override
    public void calculeazaSalariu() {
        this.salariu=(this.salariu*this.spor /100)+this.salariu;

    }
}
