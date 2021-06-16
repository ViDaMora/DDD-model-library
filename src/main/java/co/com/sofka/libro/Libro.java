package co.com.sofka.libro;

import co.com.sofka.Autor;
import co.com.sofka.Review;
import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.libro.events.*;
import co.com.sofka.libro.values.*;
import co.com.sofka.values.*;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Libro extends AggregateEvent<Libroid> {

    public Set<Review> reviews;
    public Descripcion descripcion;
    public FechaPublicacion fechaPublicacion;
    public Set<Autor> autores;
    public Precio precio;
    public Titulo titulo;


    public Libro(Libroid libroid, Descripcion descripcion, FechaPublicacion fechaPublicacion, Precio precio, Titulo titulo) {
        super(libroid);
        this.descripcion = descripcion;
        this.fechaPublicacion = fechaPublicacion;
        this.precio = precio;
        this.titulo = titulo;
        appendChange(new LibroCreado(titulo)).apply();
    }

    private Libro(Libroid libroid){
        super(libroid);
        subscribe(new LibroChange(this));
    }

    public static Libro from(Libroid libroid, List<DomainEvent> events){
        var libro = new Libro(libroid);
        events.forEach(libro::applyEvent);
        return libro;
    }


    public void agregarReview(Reviewid entityId, Libroid libroid, Usuarioid usuarioid, Fecha fechaReseña, Comentario comentario){
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(libroid);
        Objects.requireNonNull(usuarioid);
        Objects.requireNonNull(fechaReseña);
        Objects.requireNonNull(comentario);
        appendChange(new ReviewAgregada(entityId,libroid,usuarioid,fechaReseña,comentario));
    }

    public void eliminarReview(Reviewid reviewid){
        Objects.requireNonNull(reviewid);
        appendChange(new ReviewEliminada(reviewid));
    }

    public void agregarAutor(Autorid entityId, Nombre nombre){
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(nombre);
        appendChange(new AutorAgregado(entityId,nombre));
    }

    public void precioActualizado(Precio precio){
        Objects.requireNonNull(precio);
        appendChange(new PrecioAcuatlizado(precio));
    }

    public Set<Review> reviews() {
        return reviews;
    }

    public Descripcion descripcion() {
        return descripcion;
    }

    public FechaPublicacion fechaPublicacion() {
        return fechaPublicacion;
    }

    private Set<Autor> autores() {
        return autores;
    }

    public Precio precio() {
        return precio;
    }

    public Titulo titulo() {
        return titulo;
    }

     Optional<Autor> autorPorId(Autorid autorid){
        return autores().stream().filter(autor -> autor.identity().equals(autorid)).findFirst();
    }

    public Optional<Review> reviewPorId(Reviewid reviewid){
        return reviews().stream().filter(review -> review.identity().equals(reviewid)).findFirst();
    }
}
