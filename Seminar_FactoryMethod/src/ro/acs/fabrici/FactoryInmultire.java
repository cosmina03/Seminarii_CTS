package ro.acs.fabrici;

import ro.acs.clase.Inmultire;
import ro.acs.clase.OperatorBinar;

public class FactoryInmultire extends FactoryOperatorBinar {
    @Override
    public OperatorBinar getOperatorBinar() throws UnsupportedOperationException {
        return new Inmultire();
    }
}
