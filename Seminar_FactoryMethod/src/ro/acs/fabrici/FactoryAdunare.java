package ro.acs.fabrici;

import ro.acs.clase.Adunare;
import ro.acs.clase.OperatorBinar;

public class FactoryAdunare extends FactoryOperatorBinar{
    @Override
    public OperatorBinar getOperatorBinar() throws UnsupportedOperationException {
        return new Adunare();
    }
}
