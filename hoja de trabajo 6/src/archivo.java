import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class archivo {

            public ArrayList<String> abrirAcrhivo() {

                ArrayList<String> nueva=new ArrayList<String>();
                String fileName = "cards_desc.txt";
                try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
                    String line;
                    while ((line = br.readLine()) != null) {
                        nueva.add(line);

                    }
                } catch (IOException e) {
                    System.err.println("Error al leer el archivo: " + e.getMessage());
                }
                return nueva;
            }

    }

