import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public abstract class Persona {
	
	private String nombre;
    private boolean haceEjercicio;
    private boolean usaLentes;
    private boolean isMexicano;
    private boolean tieneCoche;

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean gethaceEjercicio() {
        return haceEjercicio;
    }

    public void sethaceEjercicio(boolean haceEjercicio) {
        this.haceEjercicio = haceEjercicio;
    }

    public boolean getusaLentes() {
        return usaLentes;
    }

    public void setusaLentes(boolean usaLentes) {
        this.usaLentes = usaLentes;
    }

    public boolean getisMexicano() {
        return isMexicano;
    }

    public void setisMexicano(boolean isMexicano) {
        this.isMexicano = isMexicano;
    }

    public boolean gettieneCoche() {
        return tieneCoche;
    }

    public void settieneCoche(boolean tieneCoche) {
        this.tieneCoche = tieneCoche;
    }
}

class Ricardo extends Persona {
    public Ricardo() {
        super("Ricardo");
    }
}

class Miguel extends Persona {
    public Miguel() {
        super("Miguel");
    }
}

class Juan extends Persona {
    public Juan() {
        super("Juan");
    }
}

class Ale extends Persona {
    public Ale() {
        super("Ale");
    }
}

class Sebastian extends Persona {
    public Sebastian() {
        super("Sebastian");
    }
}

class Tokito extends Persona {
    public Tokito() {
        super("Tokito");
    }
}

class David extends Persona {
    public David() {
        super("David");
    }
}

class Daniel extends Persona {
    public Daniel() {
        super("Daniel");
    }
}

class Carmen extends Persona {
    public Carmen() {
        super("Carmen");
    }
}

class Bell extends Persona {
    public Bell() {
        super("Bell");
    }

}
