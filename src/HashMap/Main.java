
package HashMap;
import java.util.ArrayList;
import java.util.HashMap;
/**
 * @author Estudiante
 */
public class Main {
    public static void main (String[] args){
        Equipo e = new Equipo("H");
        Jugador j = new Jugador ("V",123);
        e.addJugador(j);
        
        HashMap jugadores = e.getJugadores();
        
        Jugador jugador = (Jugador) jugadores.get(123);
        System.out.println(jugador.getNombre());
        
        ArrayList<Jugador> jgs = (ArrayList) jugadores.values();
        
        for(Jugador jg : jgs){
            System.out.println(jg);
        }
        
    }
}
