package co.com.sofka.factura.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.libro.values.Precio;
import co.com.sofka.orden.values.Ordenid;

public class DescuentoAplicado extends DomainEvent {
    private final Ordenid ordenid;


    public DescuentoAplicado(Ordenid ordenid) {
        super("sofka.factura.descuentoaplicado");
        this.ordenid=ordenid;

    }

    public Ordenid getOrdenid() {
        return ordenid;
    }


}
