package co.com.sofka.orden;

import co.com.sofka.domain.generic.EventChange;

import co.com.sofka.orden.events.FechaOrdenActualizado;
import co.com.sofka.orden.events.LibroAgregado;
import co.com.sofka.orden.events.LibroBorrado;
import co.com.sofka.orden.events.OrdenCreada;

public class OrdenChange extends EventChange {
    public OrdenChange(Orden orden) {
        apply((LibroAgregado event)->{
            orden.libros.add(event.getLibroid());
        });

        apply((FechaOrdenActualizado event)->{
            orden.fechaOrden=event.getFechaOrden();
        });

        apply((LibroBorrado event)->{
            orden.libros.removeIf(libroid -> libroid.equals(event.getLibroid()));
        });

        apply((OrdenCreada event)->{
            orden.fechaOrden=event.getFechaOrden();
            orden.libros = event.getLibroids();
            orden.usuario=event.getUsuario();
            orden.valorTotal=event.getValorTotal();
        });
    }
}
