public class TrueFalse extends Questions{
    private final String correctAnswer;
    private String userAnswer;

    public TrueFalse(String question, int pointValue, String correctAnswer) {
        super(question, pointValue);
        this.correctAnswer = correctAnswer;
    }

    @Override
    public void displayAnswer(){

    }
    @Override
    public void getUserAnswer(){
        System.out.print("Enter true or false: ");
        userAnswer = input.nextLine();
        validateAnswer();
    }
    public void validateAnswer(){
        setCorrect(userAnswer.equalsIgnoreCase(correctAnswer));
        System.out.println("You answered correctly: " + isCorrect());
    }
}