package co.com.sofka.values;

import co.com.sofka.domain.generic.Identity;

public class Reviewid extends Identity {
    public Reviewid(String uuid) {
        super(uuid);
    }

    public Reviewid() {
    }
    public static Reviewid of(String id){
        return new Reviewid(id);
    }
}
