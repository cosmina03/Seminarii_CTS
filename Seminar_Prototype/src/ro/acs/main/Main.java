package ro.acs.main;

import ro.acs.clase.DirtBlock;
import ro.acs.clase.Inventatory;
import ro.acs.clase.StoneBlock;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Inventatory inventatory=new Inventatory();
        DirtBlock dirtBlock= (DirtBlock) inventatory.getBlock("Dirt");
        dirtBlock.setDepth(80);
        dirtBlock.setHeight(90);
        dirtBlock.setLength(90);
        StoneBlock stoneBlock= (StoneBlock) inventatory.getBlock("Stone");
        System.out.println(dirtBlock);
        System.out.println(stoneBlock);

    }
}