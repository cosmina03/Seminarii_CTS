package ro.acs.clase;

public class SimpleFactoryPersonal {

    public static Personal getPersonal(PersonalMedical tip, String nume, float salariu, int optiuneSalariu){
        switch (tip){
            case Medic -> {return new Medic(nume,salariu,optiuneSalariu);}
            case Asistent -> {return new Asistent(nume,salariu,optiuneSalariu);}
            case Brancardier -> {return new Brancardier(nume,salariu,optiuneSalariu);}
            default -> {
               throw new RuntimeException("Tipul personalului nu este corect");
            }
        }
    }
}
