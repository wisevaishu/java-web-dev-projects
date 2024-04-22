import java.util.ArrayList;

public class Quiz {
    private final ArrayList<Questions> questions = new ArrayList<>();
    private int score;
    private int total;

    public void runQuiz(){
        for (Questions question : questions) {
            question.displayQuestion();
            question.displayAnswer();
            question.getUserAnswer();
            if (question.isCorrect()) {
                score += question.getPointValue();
            }
            total += question.getPossiblePointValue();
            System.out.println("\nCurrent score: " + score + "/" + total + "\n");
        }
    }

    public void addQuestion(Questions question){
        questions.add(question);
    }

    public void grade(){
        System.out.println("Score: " + score + "/" + total);
    }
}
