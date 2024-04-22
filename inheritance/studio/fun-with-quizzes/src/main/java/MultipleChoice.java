import java.util.ArrayList;

public class MultipleChoice extends Questions{
    //Fields
    private final ArrayList<String> possAnswers = new ArrayList<>();
    private final int correctAnswerInt;
    private int userAnswer;
    //Constructor
    public MultipleChoice(String question, int pointValue, String ans1, String ans2, String ans3,
                          String ans4, int correctAnswerInt) {
        super(question, pointValue);
        this.possAnswers.add(ans1);
        this.possAnswers.add(ans2);
        this.possAnswers.add(ans3);
        this.possAnswers.add(ans4);
        this.correctAnswerInt = correctAnswerInt;
    }
    //Methods
    @Override
    void displayAnswer() {
        for (String answer : possAnswers){
            System.out.println(answer);
        }
    }

    @Override
    void getUserAnswer() {
        System.out.print("Enter number of correct answer: ");
        userAnswer = input.nextInt();
        validateAnswer();
    }
    @Override
    void validateAnswer(){
        setCorrect(userAnswer == correctAnswerInt);
        System.out.println("You answered correctly: " + isCorrect());
    }
    //Getters and setters

}