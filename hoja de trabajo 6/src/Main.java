import java.util.Scanner;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        //Creacion de objetos
        Scanner teclado=new Scanner(System.in);
        Factory fabrica=new Factory();
        archivo manejoArchivo=new archivo();
        Map<String, String> mapa=null;
        Map<String,String> coleccion=null;
        ArrayList<String> archivoAbierto=null;
        manejoArchivos manejoStrings=new manejoArchivos();

        //MENU GENERAL
        System.out.println("BIENVENIDO ");


        //Variables
        String seleccion="";
        String tipoMapa="";
        String entrada="";
        String entradaMenuGeneral="";

        //MENU PARA TIPO DE HASH

        System.out.println("Deseas hacer tus operaciones por: ");
        System.out.println("1. HashMap");
        System.out.println("2. TreeMap");
        System.out.println("3. LinkedHashMap");
        System.out.println("--> ");
        seleccion=teclado.next();


        if(seleccion.equalsIgnoreCase("1")){
            tipoMapa="HashMap";
            mapa=fabrica.getMap(tipoMapa);
            coleccion=fabrica.getMap(tipoMapa);
        }else if(seleccion.equalsIgnoreCase("2")){
            tipoMapa="TreeMap";
            mapa=fabrica.getMap(tipoMapa);
            coleccion=fabrica.getMap(tipoMapa);

        }else if(seleccion.equalsIgnoreCase("3")){
            tipoMapa="LinkedHashMap";
            mapa=fabrica.getMap(tipoMapa);
            coleccion=fabrica.getMap(tipoMapa);

        }else{
            System.out.println("Ingresa una opcion correcta ");
        }

        archivoAbierto=manejoArchivo.abrirAcrhivo();
        String cadena="";
        String[] separado=null;
        for(int i=0;i<archivoAbierto.size();i++){
            cadena=archivoAbierto.get(i);
            separado=manejoStrings.separar(cadena);
            mapa.put(separado[0],separado[1]);

        }
        while(entradaMenuGeneral.equalsIgnoreCase("8")!=true) {


            System.out.println("-------------------MENU---------------------");
            System.out.println("1. Ver coleccion ");
            System.out.println("2. Agregar carta ");
            System.out.println("3. Mostrar tipo ");
            System.out.println("4. Nombre, tipo y cantidad de carta de la coleeccion ");
            System.out.println("5. Nombre, tipo y cantidad de carta ordenada de la coleccion");
            System.out.println("6. Mostrar el nombre y tipo de todas las cartas existentes ");
            System.out.println("7. Mostrar el nombre y tipo de todas las cartas existentes ordenadas por tipo ");
            System.out.println("8. Salir");
            System.out.println("--> ");
            entradaMenuGeneral = teclado.next();

            if (entradaMenuGeneral.equalsIgnoreCase("1")) {
                System.out.println(coleccion);
            } else if (entradaMenuGeneral.equalsIgnoreCase("2")) {
                String tipoAgregar = "";
                String valorAgregar = "";
                System.out.println("Ingresa el nombre de la carta que desea agregar a la coleccion");
                entrada = teclado.next();
                if (mapa.containsKey(entrada)) {
                    tipoAgregar = entrada;
                    valorAgregar = mapa.get(entrada);
                    coleccion.put(tipoAgregar, valorAgregar);
                } else {
                    System.out.println("Ingresa una opcion correcta ");
                }
                System.out.println(coleccion);

            } else if (entradaMenuGeneral.equalsIgnoreCase("3")) {


                System.out.println("Ingresa el nombre de la carta que desea obtener el tipo ");
                entrada = teclado.next();
                if (mapa.containsKey(entrada)) {
                    System.out.println(mapa.get(entrada));
                } else {
                    System.out.println("Ingresa una opcion correcta ");
                }
            } else if (entradaMenuGeneral.equalsIgnoreCase("4")) {
                for (Map.Entry<String, String> entry : coleccion.entrySet()) {
                    String key = entry.getKey();
                    String value = entry.getValue();
                    System.out.println("Nombre: " + key + "<----------------------> Tipo: " + value);

                }
                System.out.println("Cantidad de cartas: " + coleccion.size());
            } else if (entradaMenuGeneral.equalsIgnoreCase("5")) {


                List<Map.Entry<String, String>> lista = new ArrayList<>(coleccion.entrySet());

                Collections.sort(lista, new Comparator<Map.Entry<String, String>>() {
                    public int compare(Map.Entry<String, String> o1, Map.Entry<String, String> o2) {
                        return o1.getValue().compareTo(o2.getValue());
                    }
                });


                for (Map.Entry<String, String> x : lista) {
                    System.out.println("Nombre: " + x.getKey() + ", Tipo: " + x.getValue());
                }

            } else if (entradaMenuGeneral.equalsIgnoreCase("6")) {
                for (Map.Entry<String, String> entry : mapa.entrySet()) {
                    String key = entry.getKey();
                    String value = entry.getValue();
                    System.out.println("Nombre: " + key + "<----------------------> Tipo: " + value);
                }
            } else if (entradaMenuGeneral.equalsIgnoreCase("7")) {
                List<Map.Entry<String, String>> lista2 = new ArrayList<>(mapa.entrySet());

                // Ordenar la lista utilizando un Comparator
                Collections.sort(lista2, new Comparator<Map.Entry<String, String>>() {
                    public int compare(Map.Entry<String, String> o1, Map.Entry<String, String> o2) {
                        return o1.getValue().compareTo(o2.getValue());
                    }
                });

                // Imprimir la lista ordenada
                for (Map.Entry<String, String> x : lista2) {
                    System.out.println("Nombre: " + x.getKey() + ", Tipo: " + x.getValue());
                }
            } else if (entradaMenuGeneral.equalsIgnoreCase("8")) {
                System.out.println("Feliz dia");
            } else {
                System.out.println("Ingresa un valor correcto ");
            }
        }




    }
}