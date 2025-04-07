package ro.acs.fabrici;

import ro.acs.clase.OperatorBinar;

public abstract class FactoryOperatorBinar {
    public abstract OperatorBinar getOperatorBinar() throws UnsupportedOperationException;
}
