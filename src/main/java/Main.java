import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean loop=true;
        boolean correct = false;
        int numberQuest = 0;
        int numberAnswerEnd = 5;
        int numberAnswerStart = 0;

        Quest quest = new Quest();
        List<String> questList = quest.readQuest();


        Odpowiedzi odpowiedzi = new Odpowiedzi();
        List<String> answerList = odpowiedzi.answer();


        while (loop){
            System.out.println(questList.get(numberQuest));
            for (int i=numberAnswerStart;i<numberAnswerEnd-1 ;i++){
                System.out.println(answerList.get(i));
            }
            if(scanner.next().toLowerCase(Locale.ROOT).equals(answerList.get(numberAnswerEnd-1).toLowerCase(Locale.ROOT))){
                System.out.println("Poprawna odpowiedz");
                numberQuest++;
                numberAnswerEnd+=5;
                numberAnswerStart+=5;
                correct=true;
            }
            else if(numberQuest==questList.size() && correct==true){
                loop=false;
            }

        }


    }
}
