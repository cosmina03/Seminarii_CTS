package ro.acs.main;

import ro.acs.clase.*;

public class Main {
    public static void main(String[] args) {
        SimpleFactoryPersonal factoryPersonal=new SimpleFactoryPersonal();
        Asistent asistent= (Asistent) factoryPersonal.getPersonal(PersonalMedical.Asistent,"Gigel",1000,20);
        Brancardier brancardier= (Brancardier) factoryPersonal.getPersonal(PersonalMedical.Brancardier,"Ionel",900,19);
        Medic medic = (Medic) factoryPersonal.getPersonal(PersonalMedical.Medic,"Teo",19000,100);
        medic.calculeazaSalariu();
        asistent.calculeazaSalariu();
        brancardier.calculeazaSalariu();
        System.out.println(medic);
        System.out.println(brancardier);
        System.out.println(asistent);
    }
}
