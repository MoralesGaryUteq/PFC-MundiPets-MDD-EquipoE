import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HistorialMedico {
    private int idHistorial ;

    private Date fechaRegistro ;

    private String alergias ;

    private String enfermedades ;

    private String tratamientos;

    public List<Vacuna> vacuna = new ArrayList<Vacuna> ();

    public List<DocumentoVeterinario> documentoMedico = new ArrayList<DocumentoVeterinario> ();

    public void registrarVacuna(final Vacuna vacuna) {
    }

    private void adjuntarDocumento(final DocumentoVeterinario documento) {
    }

}
