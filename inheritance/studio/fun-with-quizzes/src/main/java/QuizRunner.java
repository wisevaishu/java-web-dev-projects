public class QuizRunner {
    public static void main(String[] args) {
        TrueFalse trueFalse1 = new TrueFalse("The sky is blue.",1,"true");
        MultipleChoice multChoice1 = new MultipleChoice("What color is grass?", 1, "1. Blue", "2" +
                ". Green", "3. Red", "4. Orange", 2);
        CheckBox checkBox1 = new CheckBox("Which pets have fur?", 2, "1. Dogs", "2. Snakes",
                "3. Birds","4. Cats", true,false, false, true);
        Quiz quiz = new Quiz();
        quiz.addQuestion(trueFalse1);
        quiz.addQuestion(multChoice1);
        quiz.addQuestion(checkBox1);
        quiz.runQuiz();
        quiz.grade();
    }
}
