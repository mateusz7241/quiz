import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Quest {

    public void readQuest() {
        try {
            Scanner scanner = new Scanner(new File("Quest.txt"));
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
            scanner.close();
        } catch (
                FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
