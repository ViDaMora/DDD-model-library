package co.com.sofka;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.values.Nombre;
import co.com.sofka.values.Vendedorid;

import java.util.Objects;

public class Vendedor extends Entity<Vendedorid> {
    private Nombre nombre;

    public Vendedor(Vendedorid entityId) {
        super(entityId);
    }

    public Nombre nombre() {
        return nombre;
    }

    public void actualizarNombre(Nombre nombre) {
        this.nombre = Objects.requireNonNull(nombre);
    }
}
