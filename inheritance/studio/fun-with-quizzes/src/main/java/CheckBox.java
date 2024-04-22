import java.util.ArrayList;

public class CheckBox extends Questions{
    //Fields
    private final ArrayList<String> possAnswers = new ArrayList<>();
    private final ArrayList<Boolean> correctAnswers = new ArrayList<>();
    private final ArrayList<Boolean> userAnswers = new ArrayList<>();
    //Constructor


    public CheckBox(String question, int pointValue, String ans1, String ans2, String ans3,
                    String ans4, Boolean correctAns1, Boolean correctAns2, Boolean correctAns3,
                    Boolean correctAns4) {
        super(question, pointValue);
        this.possAnswers.add(ans1);
        this.possAnswers.add(ans2);
        this.possAnswers.add(ans3);
        this.possAnswers.add(ans4);
        this.correctAnswers.add(correctAns1);
        this.correctAnswers.add(correctAns2);
        this.correctAnswers.add(correctAns3);
        this.correctAnswers.add(correctAns4);
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
        for (int i = 1; i<5; i++) {
            System.out.print("Enter 0 if answer " + i + " is incorrect. Enter 1 if it's correct: ");
            userAnswers.add(input.nextInt() != 0);
        }
        validateAnswer();
    }
    @Override
    void validateAnswer() {
        for (int i = 0; i< correctAnswers.size(); i++) {
            if (correctAnswers.get(i)==userAnswers.get(i)) {
                setCorrect(true);
            }else {
                setPointValue(-1);
            }
        }
        System.out.println("You answered correctly: " + isCorrect());
    }

    //Getters and setter
}