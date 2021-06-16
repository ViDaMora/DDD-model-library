package co.com.sofka.libro.events;

import co.com.sofka.Autor;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.libro.values.Titulo;

import java.util.HashSet;
import java.util.Set;

public class LibroCreado extends DomainEvent {
    private final Titulo titulo;
    public LibroCreado(Titulo titulo){
            super("sofka.libro.librocreado");
            this.titulo = titulo;

    }

    public Titulo Titulo() {
        return titulo;
    }
}
