import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Odpowiedzi extends FileNotFoundException{

    public List<String> answer(){
        List<String> answerList = new ArrayList<>();
        File odpowiedzi = new File("Answer.txt");

        Scanner odczytOdp = null;

        {
            try {
                odczytOdp = new Scanner(odpowiedzi);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
        while (odczytOdp.hasNextLine()){
            answerList.add(odczytOdp.nextLine());

        }
        return answerList;
    }

}
