package co.com.sofka.orden.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.orden.values.FechaOrden;

public class FechaOrdenActualizado extends DomainEvent {
    private final FechaOrden fechaOrden;

    public FechaOrdenActualizado(FechaOrden fechaOrden) {
        super("sofka.orden.fechaordenactualizado");
        this.fechaOrden=fechaOrden;
    }

    public FechaOrden getFechaOrden() {
        return fechaOrden;
    }
}
