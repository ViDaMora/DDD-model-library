package co.com.sofka;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.values.Direccion;
import co.com.sofka.values.Email;
import co.com.sofka.values.Nombre;
import co.com.sofka.values.Usuarioid;

import java.util.Objects;

public class Usuario extends Entity<Usuarioid> {

    private Direccion direccion;
    private Nombre nombre;
    private Email email;

    public Usuario(Usuarioid entityId, Direccion direccion, Nombre nombre, Email email) {
        super(entityId);
        this.direccion = direccion;
        this.nombre = nombre;
        this.email = email;
    }

    public Direccion direccion() {
        return direccion;
    }

    public void actuaizarDireccion(Direccion direccion) {
        this.direccion = Objects.requireNonNull(direccion);
    }

    public Nombre nombre() {
        return nombre;
    }

    public void actualizarNombre(Nombre nombre) {
        this.nombre = Objects.requireNonNull(nombre);
    }

    public Email email() {
        return email;
    }

    public void actualizarEmail(Email email) {
        this.email = Objects.requireNonNull(email);
    }
}
