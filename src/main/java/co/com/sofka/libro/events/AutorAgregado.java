package co.com.sofka.libro.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.values.Autorid;
import co.com.sofka.values.Nombre;

public class AutorAgregado extends DomainEvent {
    private final Autorid autorid;
    private final  Nombre nombre;

    public AutorAgregado(Autorid autorid, Nombre nombre) {
        super("sofka.libro.autoragregado");
        this.autorid = autorid;
        this.nombre=nombre;
    }

    public Autorid autorid() {
        return autorid;
    }

    public Nombre nombre() {
        return nombre;
    }
}
