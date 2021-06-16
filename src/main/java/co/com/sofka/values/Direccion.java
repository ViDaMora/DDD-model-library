package co.com.sofka.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Direccion implements ValueObject<String> {
    public final String value;

    public Direccion(String value) {
        this.value = Objects.requireNonNull(value);
        if(this.value.isBlank()){
            throw new IllegalArgumentException("La direccion no debe ser vacia");
        }
        if (this.value.length()<8)
            throw new IllegalArgumentException("La direccion no es valida, tiene muy pocos caracteres");

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
