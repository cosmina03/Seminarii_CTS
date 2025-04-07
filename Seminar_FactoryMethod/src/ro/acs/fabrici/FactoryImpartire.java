package ro.acs.fabrici;

import ro.acs.clase.Impartire;
import ro.acs.clase.OperatorBinar;

public class FactoryImpartire extends FactoryOperatorBinar{
    @Override
    public OperatorBinar getOperatorBinar() throws UnsupportedOperationException {
        return new Impartire();
    }
}
