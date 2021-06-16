package co.com.sofka.libro.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.values.Reviewid;

import java.util.UUID;

public class ReviewEliminada extends DomainEvent {

    private final Reviewid reviewid;

    public ReviewEliminada(Reviewid reviewid) {
        super("sofka.libro.revieweliminada");
        this.reviewid = reviewid;
    }

    public Reviewid reviewid() {
        return reviewid;
    }
}
