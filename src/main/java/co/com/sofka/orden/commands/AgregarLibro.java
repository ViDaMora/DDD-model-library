package co.com.sofka.orden.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.libro.values.Libroid;
import co.com.sofka.orden.values.Ordenid;

public class AgregarLibro implements Command {
    private final Ordenid ordenid;
    private final Libroid libroid;

    public AgregarLibro(Ordenid ordenid, Libroid libroid) {
        this.ordenid = ordenid;
        this.libroid = libroid;
    }

    public Ordenid getOrdenid() {
        return ordenid;
    }

    public Libroid getLibroid() {
        return libroid;
    }
}
