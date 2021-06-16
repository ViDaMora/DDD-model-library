package co.com.sofka.orden.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.libro.values.Libroid;

public class LibroBorrado extends DomainEvent {
    private final Libroid libroid;
    public LibroBorrado(Libroid libroid) {
        super("sofka.orden.libroborrado");
        this.libroid=libroid;
    }

    public Libroid getLibroid() {
        return libroid;
    }
}
