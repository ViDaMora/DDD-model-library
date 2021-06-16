package co.com.sofka;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.domain.generic.Identity;
import co.com.sofka.libro.values.Libroid;
import co.com.sofka.values.Comentario;
import co.com.sofka.values.Fecha;
import co.com.sofka.values.Reviewid;
import co.com.sofka.values.Usuarioid;

import java.util.Objects;

public class Review extends Entity<Reviewid> {

    private Libroid libroid;
    private Usuarioid usuarioid;
    private Fecha fechaReseña;
    private Comentario comentario;

    public Review(Reviewid entityId, Libroid libroid, Usuarioid usuarioid, Fecha fechaReseña, Comentario comentario) {
        super(entityId);
        this.libroid = libroid;
        this.usuarioid = usuarioid;
        this.fechaReseña = fechaReseña;
        this.comentario = comentario;
    }

    public Libroid libroid() {
        return libroid;
    }

    public Usuarioid usuarioid() {
        return usuarioid;
    }

    public Fecha fechaReseña() {
        return fechaReseña;
    }

    public Comentario comentario() {
        return comentario;
    }

    public void actualizarFecha(Fecha fechaReseña) {
        this.fechaReseña = Objects.requireNonNull(fechaReseña);
    }

    public void ActualizarComentario(Comentario comentario) {
        this.comentario = Objects.requireNonNull(comentario) ;
    }
}
