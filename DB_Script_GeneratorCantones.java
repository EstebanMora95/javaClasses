import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
 
/**
 * This program demonstrates how to read characters from a text file
 * using a BufferedReader for efficiency.
 * @author www.codejava.net
 *
 */
public class DB_Script_GeneratorCantones {
 
    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader("infoCantones.txt");
            FileWriter writer = new FileWriter("scriptCantones.txt");
            BufferedReader bufferedReader = new BufferedReader(reader);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
 
            String line;
 
            while ((line = bufferedReader.readLine()) != null) {
              
                String[] componentesLinea = line.split(",");  
                bufferedWriter.write("insert into canton (idcanton, idprovincia, nombre) values ('"+componentesLinea[0] +"','"+componentesLinea[1]+"','"+componentesLinea[2]+"');");
                bufferedWriter.newLine();
                
                
            }
           
            bufferedReader.close();
            reader.close();
            bufferedWriter.close();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
 
}