package co.com.sofka.libro.values;

import co.com.sofka.domain.generic.Identity;

public class Libroid extends Identity {

    public Libroid() {
    }
    private  Libroid(String id){
        super(id);
    }
    public static Libroid of(String id){
        return new Libroid(id);
    }

}
