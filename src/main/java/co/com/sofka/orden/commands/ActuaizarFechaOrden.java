package co.com.sofka.orden.commands;

import co.com.sofka.orden.values.FechaOrden;
import co.com.sofka.orden.values.Ordenid;

public class ActuaizarFechaOrden {
    private final FechaOrden fechaOrden;
    private final Ordenid ordenid;

    public ActuaizarFechaOrden(FechaOrden fechaOrden, Ordenid ordenid) {
        this.fechaOrden = fechaOrden;
        this.ordenid = ordenid;
    }

    public FechaOrden getFechaOrden() {
        return fechaOrden;
    }

    public Ordenid getOrdenid() {
        return ordenid;
    }
}
