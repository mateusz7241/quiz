import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Quest {

    public List<String> readQuest() {
        List<String> quests = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(new File("Quest.txt"));
            while (scanner.hasNextLine()) {
                quests.add(scanner.nextLine());
            }

            scanner.close();
            return quests;
        } catch (
                FileNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}
