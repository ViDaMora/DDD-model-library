package co.com.sofka.values;

import co.com.sofka.domain.generic.Identity;

public class Autorid extends Identity {
    public Autorid(String uuid) {
        super(uuid);
    }

    public Autorid() {
    }
    public static Autorid of(String id){
        return new Autorid(id);
    }
}
