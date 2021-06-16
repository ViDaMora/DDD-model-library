package co.com.sofka.libro;

import co.com.sofka.Autor;
import co.com.sofka.Review;
import co.com.sofka.domain.generic.EventChange;
import co.com.sofka.libro.Libro;
import co.com.sofka.libro.events.*;

import java.util.HashSet;

public class LibroChange extends EventChange {
    public LibroChange(Libro libro) {
        apply((LibroCreado event ) ->{
            libro.titulo = event.Titulo();
            libro.autores= new HashSet<>();
        });

        apply((AutorAgregado event)->{
            libro.autores.add(new Autor(event.autorid(), event.nombre()));
        });

        apply((PrecioAcuatlizado event)->{
            libro.precio=event.precio();
        });

        apply((ReviewAgregada event)->{
            libro.reviews.add(new Review(event.reviewid(),event.libroid(), event.usuarioid(), event.fechaReseña(), event.comentario()));
        });

        apply((ReviewEliminada event)->{
            libro.reviews.removeIf(review -> review.identity().equals(event.reviewid()));
        });

    }


}
