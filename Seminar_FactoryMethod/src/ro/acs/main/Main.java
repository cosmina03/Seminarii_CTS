package ro.acs.main;

import ro.acs.fabrici.Calculator;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Calculator calculator=new Calculator(4,9,"-");
        System.out.println(calculator.calculeaza());
    }
}