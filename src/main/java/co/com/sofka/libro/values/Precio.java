package co.com.sofka.libro.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Precio implements ValueObject<Double> {
    private final Double valor;

    public Precio(Double valor) {
        this.valor = Objects.requireNonNull(valor);
        if (this.valor<0)
            throw new IllegalArgumentException("No se permiten valores negativos");
    }

    @Override
    public Double value() {
        return this.valor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Precio)) return false;
        Precio precio = (Precio) o;
        return Objects.equals(valor, precio.valor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(valor);
    }
}
