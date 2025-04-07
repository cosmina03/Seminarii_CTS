package ro.acs.clase;

public class Impartire implements OperatorBinar{
    @Override
    public double aplicare(double numar1, double numar2) {
        return numar2/numar1;
    }
}
