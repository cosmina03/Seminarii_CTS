package ro.acs.fabrici;

import ro.acs.clase.OperatorBinar;
import ro.acs.clase.Scadere;

public class FactoryScadere extends FactoryOperatorBinar{
    @Override
    public OperatorBinar getOperatorBinar() throws UnsupportedOperationException {
        return new Scadere();
    }
}
