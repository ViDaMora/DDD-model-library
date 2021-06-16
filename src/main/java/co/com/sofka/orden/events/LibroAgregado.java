package co.com.sofka.orden.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.libro.values.Libroid;

public class LibroAgregado extends DomainEvent {
    private final Libroid libroid;
    public LibroAgregado(Libroid libroid) {
        super("sofka.orden.libroagregado");
        this.libroid = libroid;
    }

    public Libroid getLibroid() {
        return libroid;
    }
}
