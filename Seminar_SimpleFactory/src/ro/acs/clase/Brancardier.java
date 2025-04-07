package ro.acs.clase;

public class Brancardier extends Personal {

    private int vechime;

     Brancardier(String nume, float salariu, int vechime) {
        super(nume, salariu);
        this.vechime = vechime;
    }

    public int vechime() {
        return vechime;
    }

    @Override
    public void calculeazaSalariu() {
        if(this.vechime>10){
            setSalariu(super.salariu()+100);
            //this.salariu+=100;
        }
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Brancardier{");
        sb.append("vechime=").append(vechime);
        sb.append(", nume='").append(nume).append('\'');
        sb.append(", salariu='").append(salariu).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
