import java.util.ArrayList;
import java.util.Collections;

public class Main {

	private static ArrayList<Persona> personas = new ArrayList<>();
	
	public static void main(String[] args){
		
		personas.add(new Ricardo());
        personas.add(new Miguel());
        personas.add(new Juan());
        personas.add(new Ale());
        personas.add(new Sebastian());
        personas.add(new Tokito());
        personas.add(new David());
        personas.add(new Daniel());
        personas.add(new Carmen());
        personas.add(new Bell());

        Collections.shuffle(personas);
        for (int i = 0; i < personas.size(); i++) {
            Persona p = personas.get(i);
            p.sethaceEjercicio(i % 2 == 0);
            p.setusaLentes((i + 1) % 2 == 0);
            p.setisMexicano((i + 2) % 2 == 0);
            p.settieneCoche((i + 3) % 2 == 0);
        }
        
        for (Persona p : personas) {
            System.out.println(p.getNombre() + ": " +" Hace ejercicio =" + p.gethaceEjercicio() + ",  Usa lentes =" + p.getusaLentes() + ",  Es mexicano =" + p.getisMexicano() + ", Tiene coche =" + p.gettieneCoche());
            		}
        
        int haceEjercicioCount = 0;
        int usaLentesCount = 0;
        int isMexicanoCount = 0;
        int tieneCocheCount = 0;

        for (Persona p : personas) {
            if (p.gethaceEjercicio()) {
                haceEjercicioCount++;
            }
            if (p.getusaLentes()) {
                usaLentesCount++;
            }
            if (p.getisMexicano()) {
                isMexicanoCount++;
            }
            if (p.gettieneCoche()) {
                tieneCocheCount++;
            }
        }

        System.out.println("El Atributo hace ejercicio aparece en: " + haceEjercicioCount + " personas ");
        System.out.println("El Atributo usa lentes aparece en: " + usaLentesCount + " personas ");
        System.out.println("El Atributo es mexicano aparece en: " + isMexicanoCount + " personas ");
        System.out.println("El Atributo tiene coche aparece en: " + tieneCocheCount + " personas ");
    }

}

