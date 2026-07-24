import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Mascota {
    private int idMascota ;

    private String nombre ;

    private String raza ;

    private String sexo;

    private Date fechaNacimiento ;

    private String estadoSalud ;

    private String microchip;

    public HistorialMedico historialMedico;

    public List<AntecedenteGenetico> antecedenteGenetico = new ArrayList<AntecedenteGenetico> ();

    public void consultarPerfil() {
    }

    public void actualizarEstadoReproductivo() {
    }

}
