package co.com.sofka.orden.commands;

import co.com.sofka.Usuario;
import co.com.sofka.domain.generic.Command;
import co.com.sofka.libro.values.Libroid;
import co.com.sofka.orden.values.FechaOrden;
import co.com.sofka.orden.values.Ordenid;
import co.com.sofka.orden.values.ValorTotal;

import java.util.Set;

public class CrearOrden implements Command {
    private final Ordenid ordenid;
    private final Usuario usuario;
    private final FechaOrden fechaOrden;
    private final ValorTotal valorTotal;
    private final Set<Libroid> libroids;

    public CrearOrden(Ordenid ordenid, Usuario usuario, FechaOrden fechaOrden, ValorTotal valorTotal, Set<Libroid> libroids) {
        this.ordenid = ordenid;
        this.usuario = usuario;
        this.fechaOrden = fechaOrden;
        this.valorTotal = valorTotal;
        this.libroids = libroids;
    }

    public Ordenid getOrdenid() {
        return ordenid;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public FechaOrden getFechaOrden() {
        return fechaOrden;
    }

    public ValorTotal getValorTotal() {
        return valorTotal;
    }

    public Set<Libroid> getLibroids() {
        return libroids;
    }
}
