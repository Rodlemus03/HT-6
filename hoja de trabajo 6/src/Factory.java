import java.util.*;
public class Factory {
    public Map<String,String> getMap(String tipo){
        if(tipo.equalsIgnoreCase("HashMap")){
            return new HashMap<>();
        }else if(tipo.equalsIgnoreCase("TreeMap")){
            return new TreeMap<>();
        } else if (tipo.equalsIgnoreCase("LinkedHashMap")) {
            return new LinkedHashMap<>();
        }else{
            throw new IllegalArgumentException("TIPO DE MAPA INVALIDO");
        }
    }
}
