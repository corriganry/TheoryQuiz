/**
 * Model class that contains everything we need for a question
 */
public class Question {
    private String question;
    private String a;
    private String b;
    private String c;
    private String d;
    private String answer;

    // Get function for question
    public String getQuestion() {
        return question;
    }
    // Set function for question
    public void setQuestion(String question) {
        this.question = question;
    }
    // Get function for A
    public String getA() {
        return a;
    }
    // Set function for A
    public void setA(String a) {
        this.a = a;
    }
    // Get function for B
    public String getB() {
        return b;
    }
    // Set function for B
    public void setB(String b) {
        this.b = b;
    }
    // Get function for C
    public String getC() {
        return c;
    }
    // Set function for C
    public void setC(String c) {
        this.c = c;
    }
    // Get function for D
    public String getD() {
        return d;
    }
    // Set function for D
    public void setD(String d) {
        this.d = d;
    }
    // Get function for answer
    public String getAnswer() {
        return answer;
    }
    // Set function for answer
    public void setAnswer(String answer) {
        this.answer = answer;
    }
    
    /**
     * contains the question, a, b, c, d, and answer for Question
     */
    public Question() {
        question = "none";
        a = "none";
        b = "none";
        c = "none";
        d = "none";
        answer = "none";
    }
    /**
     * sets the parameters for a question
     * @param question is the question itself
     * @param a is answer option a
     * @param b is answer option b
     * @param c is answer option c
     * @param d is answer option d
     * @param answer is the actual answer
     */
    public Question(String question, String a, String b, String c, String d, String answer) {
        setQuestion(question);
        setA(a);
        setB(b);
        setC(c);
        setD(d);
        setAnswer(answer);
    }
    @Override
    /**
     * toString function that allows us to write the question to a string
     */
    public String toString() {
        return String.format("%s\na %s\nb %s\nc %s\nd %s\n%s\n",question,a,b,c,d,answer);
    }
    
}
