package co.com.sofka.orden.values;

import co.com.sofka.domain.generic.ValueObject;
import co.com.sofka.values.Comentario;

import java.util.Date;
import java.util.Objects;

public class FechaOrden implements ValueObject<Date> {
    public final Date value;

    public FechaOrden(Date value) {
        this.value = Objects.requireNonNull(value);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Comentario)) return false;
        Comentario that = (Comentario) o;
        return Objects.equals(value(), that.value());
    }

    @Override
    public int hashCode() {
        return Objects.hash(value());
    }


    @Override
    public Date value() {
        return value;
    }
}
