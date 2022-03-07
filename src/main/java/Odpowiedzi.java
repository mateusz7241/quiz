import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Odpowiedzi extends FileNotFoundException{
    File odpowiedzi = new File("odpowiedzi.txt");

        Scanner odczytOdp;

    {
        try {
            odczytOdp = new Scanner(odpowiedzi);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    String odpowiedziDoPytań = odczytOdp.nextLine();
}
