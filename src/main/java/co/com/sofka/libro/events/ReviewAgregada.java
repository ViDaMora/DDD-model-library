package co.com.sofka.libro.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domain.generic.Identity;
import co.com.sofka.libro.values.Libroid;
import co.com.sofka.values.Comentario;
import co.com.sofka.values.Fecha;
import co.com.sofka.values.Reviewid;
import co.com.sofka.values.Usuarioid;

import java.util.UUID;

public class ReviewAgregada extends DomainEvent {

    private final Reviewid reviewid;
    private final Libroid libroid;
    private final Usuarioid usuarioid;
    private final Fecha fechaReseña;
    private final Comentario comentario;

    public ReviewAgregada(Reviewid reviewid, Libroid libroid, Usuarioid usuarioid, Fecha fechaReseña, Comentario comentario) {
        super("sofka.libro.ReviewAgregada");
        this.reviewid = reviewid;
        this.libroid = libroid;
        this.usuarioid = usuarioid;
        this.fechaReseña = fechaReseña;
        this.comentario = comentario;
    }

    public Reviewid reviewid() {
        return reviewid;
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
}
