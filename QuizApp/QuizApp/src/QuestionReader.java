import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

/**
 * Class to read questions from a file and input them into an ArrayList
 */
public class QuestionReader {
    /**
     * function to read a file and retrieve the questions from that file
     * @param fname is the name of the file
     * @return is the questions read from the file
     */
    public ArrayList<Question> readFromJSON(String fname) {
        ArrayList<Question> questions = new ArrayList<Question>();
        try {
            FileReader reader = new FileReader(new File(fname));
            JSONParser parser = new JSONParser();
            JSONObject all = (JSONObject)parser.parse(reader);
            JSONArray arr = (JSONArray)all.get("questions");
            Iterator itr = arr.iterator();
            JSONObject questionObject;
            String question, a, b, c, d, answer;
            while (itr.hasNext()) {
                questionObject = (JSONObject)itr.next();
                question = questionObject.get("question").toString();
                a = questionObject.get("a").toString();
                b = questionObject.get("b").toString();
                c = questionObject.get("c").toString();
                d = questionObject.get("d").toString();
                answer = questionObject.get("answer").toString();
                questions.add(new Question(question,a,b,c,d,answer));
            }
            reader.close();
            return questions;
        } catch (Exception ex) {
            return null;
        }
    }
}
