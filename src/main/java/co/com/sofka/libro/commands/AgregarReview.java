package co.com.sofka.libro.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.libro.values.Libroid;
import co.com.sofka.values.Comentario;
import co.com.sofka.values.Reviewid;
import co.com.sofka.values.Usuarioid;

import java.util.Date;

public class AgregarReview  implements Command {

    private final Reviewid reviewid;
    private final Libroid libroid;
    private final Usuarioid usuarioid;
    private final Date fechaReseña;
    private final Comentario comentario;

    public AgregarReview(Reviewid reviewid, Libroid libroid, Usuarioid usuarioid, Date fechaReseña, Comentario comentario) {
        this.reviewid = reviewid;
        this.libroid = libroid;
        this.usuarioid = usuarioid;
        this.fechaReseña = fechaReseña;
        this.comentario = comentario;
    }

    public Reviewid getReviewid() {
        return reviewid;
    }

    public Libroid getLibroid() {
        return libroid;
    }

    public Usuarioid getUsuarioid() {
        return usuarioid;
    }

    public Date getFechaReseña() {
        return fechaReseña;
    }

    public Comentario getComentario() {
        return comentario;
    }
}
