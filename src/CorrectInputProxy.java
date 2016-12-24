import java.util.Scanner;
/**
 * Created by jlaba on 25.12.2016.
 */
public class CorrectInputProxy extends ICorrectInput {
    String secretWord = "Flower";

    public void Сorrectness(){
        System.out.println("###########################");
        System.out.println(secretWord);
        System.out.println("###########################");
        System.out.println("Please, enter a word that you can see at the screen. We want to make sure that you" +
                "are not a robot: ");
        Scanner scan= new Scanner(System.in);
        String text= scan.nextLine();
        if(text.equals(secretWord)){
            CorrectInput input = new CorrectInput();
            input.Сorrectness();
        }else{
            IncorrectInput input1 = new IncorrectInput();
            input1.Сorrectness();
        }
    }

}
