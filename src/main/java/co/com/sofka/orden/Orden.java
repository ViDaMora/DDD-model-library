package co.com.sofka.orden;

import co.com.sofka.Usuario;
import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.libro.values.Libroid;
import co.com.sofka.orden.events.FechaOrdenActualizado;
import co.com.sofka.orden.events.LibroAgregado;
import co.com.sofka.orden.events.LibroBorrado;
import co.com.sofka.orden.events.OrdenCreada;
import co.com.sofka.orden.values.FechaOrden;
import co.com.sofka.orden.values.Ordenid;
import co.com.sofka.orden.values.ValorTotal;

import java.util.List;
import java.util.Objects;
import java.util.Set;

public class Orden extends AggregateEvent<Ordenid> {
    protected Usuario usuario;
    protected FechaOrden fechaOrden;
    protected ValorTotal valorTotal;
    protected Set<Libroid> libros;

    public Orden(Ordenid entityId, Usuario usuario, FechaOrden fechaOrden, ValorTotal valorTotal, Set<Libroid> libros) {
        super(entityId);
        this.usuario = usuario;
        this.fechaOrden = fechaOrden;
        this.valorTotal = valorTotal;
        this.libros = libros;
        appendChange(new OrdenCreada(usuario,fechaOrden,valorTotal,libros)).apply();
    }
    private Orden(Ordenid ordenid){
        super(ordenid);
        subscribe(new OrdenChange(this));
    }
    public  static  Orden from(Ordenid ordenid, List<DomainEvent> events){
        var orden =new Orden(ordenid);
        events.forEach(orden::applyEvent);
        return orden;
    }

    public void  agregarLibro(Libroid libroid){
        Objects.requireNonNull(libroid);
        appendChange(new LibroAgregado(libroid));
    }

    public void ActualizarFechaOrden(FechaOrden fechaOrden){
        Objects.requireNonNull(fechaOrden);
        appendChange(new FechaOrdenActualizado(fechaOrden));
    }

    public void borrarLibro(Libroid libroid){
        Objects.requireNonNull(libroid);
        appendChange(new LibroBorrado(libroid));
    }

    public Usuario usuario() {
        return usuario;
    }

    private void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public FechaOrden fechaOrden() {
        return fechaOrden;
    }

    private void setFechaOrden(FechaOrden fechaOrden) {
        this.fechaOrden = fechaOrden;
    }

    public ValorTotal valorTotal() {
        return valorTotal;
    }

    private void setValorTotal(ValorTotal valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Set<Libroid> libros() {
        return libros;
    }

    private void setLibros(Set<Libroid> libros) {
        this.libros = libros;
    }
}
