package co.com.sofka.libro.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.libro.values.Libroid;
import co.com.sofka.values.Autorid;
import co.com.sofka.values.Nombre;

public class AgregarAutor implements Command {
    private final Autorid autorid;
    private final Libroid libroid;
    private final Nombre nombre;

    public Libroid getLibroid() {
        return libroid;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public Autorid getAutorid() {
        return autorid;
    }

    public AgregarAutor(Autorid autorid, Libroid libroid, Nombre nombre) {
        this.autorid = autorid;
        this.libroid = libroid;
        this.nombre = nombre;
    }
}
