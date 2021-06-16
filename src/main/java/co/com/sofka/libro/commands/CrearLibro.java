package co.com.sofka.libro.commands;

import co.com.sofka.libro.values.Libroid;
import co.com.sofka.libro.values.Titulo;

public class CrearLibro {
    private final Libroid libroid;
    private final Titulo titulo;

    public CrearLibro(Libroid libroid, Titulo titulo) {
        this.libroid = libroid;
        this.titulo = titulo;
    }

    public Libroid getLibroid() {
        return libroid;
    }

    public Titulo getTitulo() {
        return titulo;
    }
}
