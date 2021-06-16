package co.com.sofka;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.values.Autorid;
import co.com.sofka.values.Nombre;

import java.util.Objects;

public class Autor extends Entity<Autorid> {

    private  Nombre nombre;

    public Autor(Autorid entityId, Nombre nombre) {
        super(entityId);
        this.nombre =nombre;
    }

    public void actualizarNombreAutor(Nombre nombre){
        this.nombre = Objects.requireNonNull(nombre);
    }

    public Nombre Nombre() {
        return nombre;
    }
}
