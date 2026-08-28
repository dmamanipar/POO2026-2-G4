package pe.edu.upeu.saeledx;

public record PagoPOS() implements FormaPago{
    @Override
    public boolean procesar(double monto) {
        return false;
    }
}
