package co.com.sofka.libro.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.libro.values.Precio;

public class PrecioAcuatlizado extends DomainEvent {
    private final  Precio precio;

    public PrecioAcuatlizado(Precio precio) {
        super("sofka.libro.precioactualizado");
        this.precio=precio;
    }

    public Precio precio() {
        return precio;
    }
}
