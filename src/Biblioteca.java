
import java.time.LocalDate;
import java.util.List;

public class Biblioteca extends Llibre {

    private List<Llibre> copiesLlibres;

    public Biblioteca(String nom, String tipus, String editorial, LocalDate any, Autor autor, String identificador, String estatLlibre) {
        super(nom, tipus, editorial, any, autor, identificador, estatLlibre);
    }

    public List<Llibre> getCopiesLlibres() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void setCopiesLlibres(List<Llibre> copiesLlibres) {
    }
}
