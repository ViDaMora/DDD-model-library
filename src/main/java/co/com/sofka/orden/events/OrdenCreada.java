package co.com.sofka.orden.events;

import co.com.sofka.Usuario;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.libro.values.Libroid;
import co.com.sofka.orden.values.FechaOrden;
import co.com.sofka.orden.values.ValorTotal;
import co.com.sofka.values.Usuarioid;

import java.util.Set;

public class OrdenCreada extends DomainEvent {
    private final Usuario usuario;
    private final FechaOrden fechaOrden;
    private final ValorTotal valorTotal;
    private final Set<Libroid> libroids;
    public OrdenCreada(Usuario usuario, FechaOrden fechaOrden, ValorTotal valorTotal, Set<Libroid> libros) {
        super("sofka.orden.ordencreada");
        this.usuario=usuario;
        this.fechaOrden=fechaOrden;
        this.valorTotal=valorTotal;
        this.libroids=libros;
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
