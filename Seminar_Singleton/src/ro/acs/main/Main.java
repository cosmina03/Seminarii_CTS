package ro.acs.main;

import ro.acs.singleton.VirtualMachine;
import ro.acs.singleton.VirtualMachineEager;
import ro.acs.singleton.VirtualMachineEnum;
import ro.acs.singleton.VirtualMachineLazy;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // cream o clasa normala
        VirtualMachine virtualMachine=new VirtualMachine(8089,"10.0.1.1","new user machine","new user");
        VirtualMachine virtualMachine1=new VirtualMachine(8089,"10.89.80","Virtual Machine2", "Gigel");
        System.out.println(virtualMachine1==virtualMachine);

        //Creare instante EAGER

        VirtualMachineEager virtualMachineEager=VirtualMachineEager.getInstance();
        System.out.println(virtualMachineEager);
        VirtualMachineEager virtualMachineEager1=VirtualMachineEager.getInstance();
        System.out.println(virtualMachineEager==virtualMachineEager1);

        //Creare pentru EnumSingleton

        VirtualMachineEnum virtualMachineEnum=VirtualMachineEnum.INSTANCE;
        System.out.println(virtualMachineEnum);
        VirtualMachineEnum virtualMachineEnum1=VirtualMachineEnum.INSTANCE;
        System.out.println(virtualMachineEnum==virtualMachineEnum);

        //Creare Lazy

        VirtualMachineLazy virtualMachineLazy=VirtualMachineLazy.getInstance();
        System.out.println(virtualMachineLazy);
        VirtualMachineLazy virtualMachineLazy1=VirtualMachineLazy.getInstance();
        System.out.println(virtualMachineLazy1==virtualMachineLazy);






    }
}