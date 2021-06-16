package co.com.sofka.factura;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.factura.events.DescuentoAplicado;
import co.com.sofka.factura.events.FacturaCreada;
import co.com.sofka.factura.values.Facturaid;
import co.com.sofka.libro.values.Precio;
import co.com.sofka.orden.values.Ordenid;
import co.com.sofka.orden.values.ValorTotal;
import co.com.sofka.values.Fecha;
import co.com.sofka.values.Vendedorid;

import java.util.List;
import java.util.Objects;

public class Factura extends AggregateEvent<Facturaid> {
    protected Ordenid ordenid;
    protected Vendedorid vendedorid;
    protected ValorTotal valorTotal;
    protected Fecha fecha;

    public Factura(Facturaid facturaid,Ordenid ordenid, Vendedorid vendedorid, ValorTotal valorTotal, Fecha fecha) {
        super(facturaid);
        this.ordenid = ordenid;
        this.vendedorid = vendedorid;
        this.valorTotal = valorTotal;
        this.fecha = fecha;
        appendChange(new FacturaCreada(ordenid,vendedorid,valorTotal,fecha));
    }

    private  Factura(Facturaid facturaid){
        super(facturaid);
        subscribe(new FacturaChange(this));
    }

    public static Factura from(Facturaid facturaid, List<DomainEvent> events){
        var factura= new Factura(facturaid);
        events.forEach(factura::applyEvent);
        return factura;
    }

    public void AplicarDescuento(Ordenid ordenid){
        Objects.requireNonNull(ordenid);
        appendChange(new DescuentoAplicado(ordenid));
    }


}
