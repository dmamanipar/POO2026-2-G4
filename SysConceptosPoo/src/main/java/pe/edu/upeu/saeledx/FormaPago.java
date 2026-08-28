package pe.edu.upeu.saeledx;

public sealed interface FormaPago permits PagoEfectivo, PagoTarjeta, PagoTransferencia, PagoYape, PagoPOS {
    boolean procesar(double monto);
}
