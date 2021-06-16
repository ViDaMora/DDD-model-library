package co.com.sofka.factura.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.factura.values.Facturaid;
import co.com.sofka.orden.values.Ordenid;
import co.com.sofka.orden.values.ValorTotal;
import co.com.sofka.values.Fecha;
import co.com.sofka.values.Vendedorid;

public class FacturaCreada extends DomainEvent {

    private final Ordenid ordenid;
    private final Vendedorid vendedorid;
    private final ValorTotal valorTotal;
    private final Fecha fecha;
    public FacturaCreada(Ordenid ordenid, Vendedorid vendedorid, ValorTotal valorTotal, Fecha fecha) {
        super("sofka.factura.facturacreada");
        this.ordenid = ordenid;
        this.vendedorid=vendedorid;
        this.valorTotal=valorTotal;
        this.fecha=fecha;
    }

    public Ordenid getOrdenid() {
        return ordenid;
    }

    public Vendedorid getVendedorid() {
        return vendedorid;
    }

    public ValorTotal getValorTotal() {
        return valorTotal;
    }

    public Fecha getFecha() {
        return fecha;
    }
}
