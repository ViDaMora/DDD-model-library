package co.com.sofka.values;

import co.com.sofka.domain.generic.Identity;

public class Vendedorid extends Identity {
    public static Vendedorid of(String id){
        return new Vendedorid(id);
    }
    public Vendedorid(String uuid) {
        super(uuid);
    }

    public Vendedorid() {
    }
}
