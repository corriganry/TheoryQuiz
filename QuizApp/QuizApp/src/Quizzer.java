import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * Quizzer class that chooses questions randomly and presents them. Also checks how many questions you get right
 */
public class Quizzer {
    /**
     * Function to give the user random questions and see how many they get right
     * @param amount is the amount of questions the user wants
     * @param questions are the questions that we retrieved from the file
     * @param fileName is the name of the file the user entered. I have this in here to reset the questions everytime after I remove the questions.
     * @return the amount of questions the user answered correctly
     */
    public int generateRandomQuestion(int amount, ArrayList<Question> questions, String fileName) {
    Random rnd = new Random();
    Scanner sc = new Scanner(System.in);
    QuestionReader qr = new QuestionReader();
    // used to make sure that all of the questions are in the ArrayList after previously being removed
    questions = qr.readFromJSON(fileName);
    int correctAnswers = 0;
    int amountOfQuestions = 18;
    if (amount > 18 || amount <= 0) {
        System.out.println("That is an invalid number of questions. Please Input a value between 1 and 18.");
    }
    else {
        for (int i = 0; i < amount; i++) {
            int rand = rnd.nextInt(amountOfQuestions);
            System.out.println(questions.get(rand).getQuestion());
            System.out.printf("a. %s\n", questions.get(rand).getA());
            System.out.printf("b. %s\n", questions.get(rand).getB());
            System.out.printf("c. %s\n", questions.get(rand).getC());
            System.out.printf("d. %s\n", questions.get(rand).getD());
            System.out.print("Type the letter of your choice: ");
            String choice = sc.nextLine();
            String answer = questions.get(rand).getAnswer();
            if (choice.equalsIgnoreCase(answer)) {
                correctAnswers++;
                System.out.println("Correct!");
            } else {
                System.out.printf("Sorry. The correct answer is %s\n", answer);
            }
            questions.remove(rand);
            amountOfQuestions--;
            System.out.println("");
        }
        System.out.printf("You answered %d correct out of %d questions asked.\n", correctAnswers, amount);
    }
    return correctAnswers;
    }
}
