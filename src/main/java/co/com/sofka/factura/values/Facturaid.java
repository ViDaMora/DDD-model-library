package co.com.sofka.factura.values;

import co.com.sofka.domain.generic.Identity;

public class Facturaid extends Identity {
    public Facturaid() {
    }
    private Facturaid(String id){
        super(id);
    }
    public static Facturaid of(String id){
        return new Facturaid(id);
    }
}
