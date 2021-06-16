package co.com.sofka.libro.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.libro.values.Libroid;
import co.com.sofka.libro.values.Precio;

public class ActualizarPrecio implements  Command {

    private final Precio precio;
    private final Libroid libroid;

    public ActualizarPrecio(Precio precio,Libroid libroid) {
        this.precio = precio;
        this.libroid = libroid;
    }

    public Precio getPrecio() {
        return precio;
    }

    public Libroid getLibroid() {
        return libroid;
    }
}
