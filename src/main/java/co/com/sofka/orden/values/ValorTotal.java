package co.com.sofka.orden.values;

import co.com.sofka.domain.generic.ValueObject;


public class ValorTotal implements ValueObject<Double> {

    private final double valor;

    public ValorTotal(Double valor) {
        this.valor = valor;
    }

    public Double getValor() {
        return valor;
    }

    @Override
    public Double value() {
        return this.valor;
    }
}
