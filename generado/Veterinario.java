import java.util.ArrayList;
import java.util.List;

public class Veterinario {
    private int idVeterinario ;

    private String nombre ;

    private String especialidad ;

    private String numeroLicencia ;

    public List<ValidacionMedica> validacionMedica = new ArrayList<ValidacionMedica> ();

    public void emitirValidacion(final String doc) {
    }

    public void consultarLicencia(final String numeroLicencia ) {
    }

}
