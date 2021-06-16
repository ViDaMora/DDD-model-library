package co.com.sofka.values;

import co.com.sofka.domain.generic.Identity;

public class Usuarioid extends Identity {
    public static Usuarioid of(String id){
        return new Usuarioid(id);
    }
    public Usuarioid(String uuid) {
        super(uuid);
    }

    public Usuarioid() {
    }
}
