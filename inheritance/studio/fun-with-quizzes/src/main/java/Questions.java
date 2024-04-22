import java.util.Scanner;

public abstract class Questions {
    private final String question;
    private boolean isCorrect;
    private int pointValue;
    private final int possiblePointValue;
    public static Scanner input = new Scanner(System.in);

    public Questions(String question, int pointValue) {
        this.question = question;
        this.pointValue = pointValue;
        this.possiblePointValue = pointValue;
    }

    public void displayQuestion(){
        System.out.println(question);
    }

    abstract void displayAnswer();
    abstract void getUserAnswer();
    abstract void validateAnswer();

    public int getPointValue() {
        return pointValue;
    }

    public int getPossiblePointValue() {
        return possiblePointValue;
    }

    public void setPointValue(int pointValue) {
        this.pointValue += pointValue;
    }

    public boolean isCorrect() {
        return isCorrect;
    }

    public void setCorrect(boolean correct) {
        isCorrect = correct;
    }
}
