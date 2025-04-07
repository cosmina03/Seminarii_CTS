package ro.acs.clase;

public class Medic extends Personal{
    private int spor;

    Medic(String nume, float salariu, int spor) {
        super(nume, salariu);
        this.spor = spor;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Medic{");
        sb.append("spor=").append(spor);
        sb.append(", nume='").append(nume).append('\'');
        sb.append(", salariu=").append(salariu);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void calculeazaSalariu() {
        this.salariu=(this.salariu*this.spor /100)+this.salariu;
    }
}
