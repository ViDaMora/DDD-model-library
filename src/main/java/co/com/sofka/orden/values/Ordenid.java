package co.com.sofka.orden.values;

import co.com.sofka.domain.generic.Identity;
import co.com.sofka.factura.values.Facturaid;

public class Ordenid extends Identity {

    public Ordenid() {
    }

    private Ordenid(String id){
        super(id);
    }
    public static Ordenid of(String id){
        return new Ordenid(id);
    }
}
