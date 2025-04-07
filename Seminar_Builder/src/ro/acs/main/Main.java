package ro.acs.main;

import ro.acs.clase.Film;
import ro.acs.clase.Serial;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Film film=new Film.FilmBuilder("Barbie",2023).addAnProductie(2024).build();//good pentru a rezolva cu cele obligatorii
        System.out.println(film);
        Serial serial=new Serial.SerialBuilder("Riverdale",2020).setLimbaProductie("engleza").setGen("toate varstele").build();
        System.out.println(serial);
    }
}