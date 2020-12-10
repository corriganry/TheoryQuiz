import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * Class with the main function that runs the application
 */
public class QuizApp {
    /**
     * function to welcome the user
     */
    public static void welcome() {
        System.out.println("*                 What could possibly be more fun than this?                  *");
        System.out.println("*******************************************************************************");
        System.out.println("*                   OOP Theory and Concept Questions                          *");
        System.out.println("*******************************************************************************");
        System.out.println("*                 Nothing. Nothing at all. Nope. Nada. Nunca.                 *");
        System.out.println("");
    }
    /**
     * Function to show the options for the user and retrieve which number they pick
     * @param sc is the scanner object that we use to receieve the number
     * @return the users choice
     */
    public static int showMenuAndGetChoice(Scanner sc) {
        System.out.println("Here are your choices:");
        System.out.println("1. Take a quiz. ");
        System.out.println("2. See questions and answers. ");
        System.out.println("3. Exit");
        System.out.print("Enter the number of your choice: ");
        int result = sc.nextInt();
        sc.nextLine();
        return result;
    }
    /**
     * main
     * @param args
     */
    public static void main(String[] args){
        ArrayList<Question> questions = new ArrayList<Question>();
        ArrayList<Question> questions2 = new ArrayList<Question>();
        QuestionReader qr = new QuestionReader();
        Scanner sc = new Scanner(System.in);
        int result = 0;
        welcome();
        System.out.print("Enter name of file containing questions: ");
        String path = sc.nextLine();
        questions = qr.readFromJSON(path);
        questions2 = qr.readFromJSON(path);
        while (result != 3) {
        result = showMenuAndGetChoice(sc);
        System.out.println("");
        if (result == 1) {
            System.out.print("How many questions would you like? ");
            int questionAmount = sc.nextInt();
            System.out.println("");
            int correctAnswers;
            Quizzer quizzer = new Quizzer();
            correctAnswers = quizzer.generateRandomQuestion(questionAmount, questions, path);
        }
        else if (result == 2) {
            QuestionPrinter questionPrinter = new QuestionPrinter();
            questionPrinter.printQuestions(questions);
        }
    }
            System.out.println("***************************************************************************");
            System.out.println("*                   Thank you for using my program.                       *");
            System.out.println("***************************************************************************");
    }
}