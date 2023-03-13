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
        String entradaMenuGeneral="";
        System.out.println("-------------------MENU---------------------");
        System.out.println("1. Ver coleccion ");
        System.out.println("2. Agregar carta ");
        System.out.println("3. Mostrar tipo ");
        System.out.println("4. Nombre, tipo y cantidad de carta ");
        System.out.println("5. Nombre, tipo y cantidad de carta ordenada ");
        System.out.println("6. Mostrar el nombre y tipo de todas las cartas existentes ");
        System.out.println("7. Mostrar el nombre y tipo de todas las cartas existentes ordenadas por tipo ");
        System.out.println("--> ");
        entradaMenuGeneral=teclado.next();

        if(entradaMenuGeneral.equalsIgnoreCase("1")){
            System.out.println(coleccion);
        }else if(entradaMenuGeneral.equalsIgnoreCase("2")){

        }else if(entradaMenuGeneral.equalsIgnoreCase("3")){

        }else if(entradaMenuGeneral.equalsIgnoreCase("4")){

        }else if(entradaMenuGeneral.equalsIgnoreCase("5")){

        }else if(entradaMenuGeneral.equalsIgnoreCase("6")){

        }else if(entradaMenuGeneral.equalsIgnoreCase("7")){

        }else{
            System.out.println("Ingresa un valor correcto ");
        }





    }
}