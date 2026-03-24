import java.util.HashMap;
import java.util.Collection;
import java.util.Map;

public class FestivalRepository {
    private Map<String, Assistent> assistents;

    public FestivalRepository() {
        assistents = new HashMap<>();
    }

    public boolean registrarAssistent(Assistent a) {
        if (assistents.containsKey(a.getCodiTicket())) {
            return false;
        }
        assistents.put(a.getCodiTicket(), a);
        return true;
    }

    public Assistent buscarPerTicket(String codi) {
        return assistents.get(codi);
    }

    public Collection<Assistent> obtenirLlista() {
        return assistents.values();
    }

    public boolean cancellarEntrada(String codi) {
        if (assistents.containsKey(codi)) {
            assistents.remove(codi);
            return true;
        }
        return false;
    }

    public double calcularEdatMitjana() {
        if (assistents.isEmpty()) return 0;

        int suma = 0;
        for (Assistent a : assistents.values()) {
            suma += a.getEdat();
        }

        return (double) suma / assistents.size();
    }
}