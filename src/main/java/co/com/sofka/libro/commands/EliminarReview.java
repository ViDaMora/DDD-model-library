package co.com.sofka.libro.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.libro.values.Libroid;
import co.com.sofka.values.Reviewid;

public class EliminarReview  implements Command {

    private final Libroid libroid;
    private final Reviewid reviewid;

    public EliminarReview(Libroid libroid, Reviewid reviewid) {
        this.libroid = libroid;
        this.reviewid = reviewid;
    }

    public Libroid getLibroid() {
        return libroid;
    }

    public Reviewid getReviewid() {
        return reviewid;
    }
}
