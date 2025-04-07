package ro.acs.clase;

public abstract class Personal {
    protected String nume;
    protected float salariu;

     Personal(String nume, float salariu) {
        this.nume = nume;
        this.salariu = salariu;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Personal{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", salariu='").append(salariu).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public String nume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public float salariu() {
        return salariu;
    }

    public void setSalariu(float salariu) {
        this.salariu = salariu;
    }

    public abstract void calculeazaSalariu();
}
