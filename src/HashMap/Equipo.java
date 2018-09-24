
package HashMap;
import java.util.HashMap;
/**
 * @author Estudiante
 */
public class Equipo {
    private String nombre;
    private HashMap<Integer,Jugador> jugadores;
    
    public Equipo(String nombre){
        this.nombre=nombre;
        this.jugadores=new HashMap<>();
    }
    
    public boolean addJugador (Jugador jugador){
        Jugador j= this.jugadores.put(jugador.getCedula(), jugador);
        if(j!=null){
            return true;
        }else{
            return false;
        }
    }
    
    public HashMap getJugadores(){
        return this.jugadores;
    }
}