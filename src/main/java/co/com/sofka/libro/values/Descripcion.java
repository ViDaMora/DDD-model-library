package co.com.sofka.libro.values;

import co.com.sofka.domain.generic.ValueObject;
import co.com.sofka.values.Comentario;

import java.util.Objects;

public class Descripcion implements ValueObject<String> {

    private final String value;
    public Descripcion(String value) {
        this.value = Objects.requireNonNull(value);
        if(this.value.isBlank()){
            throw new IllegalArgumentException("La descripcion no debe ser vacia");
        }
        if (this.value.length()<20)
            throw new IllegalArgumentException("La descripcion debe contener mas de 20 caracteres");

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
    public String value() {
        return value;
    }
}
