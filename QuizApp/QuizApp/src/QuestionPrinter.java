import java.util.ArrayList;

/**
 * Class to print the questions out
 */
public class QuestionPrinter {
    /**
     * function to print the questions
     * @param questions are the questions retrieved from the file.
     */
    public static void printQuestions(ArrayList<Question> questions) {
        System.out.println("Here are the answers:");
        for (Question question : questions) {
            String answer = question.getAnswer();
            String q = question.getQuestion();
            System.out.printf("%s  %s\n",answer, q);
        }
        System.out.println("");
    }
}
