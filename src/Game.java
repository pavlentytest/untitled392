public class Game {
    private String name;
    private Question[] questions;
    private int counter;
    //...

    public Game(String name, Question[] questions) {
        this.name = name;
        this.questions = questions;
    }

    public void start() {
        System.out.println("Приветствуем тебя в нашей викторине!");
        for()
    }
}

class Question {
    private String title;
    private Answer[] answers;

    public Question(String title, Answer[] answers) {
        this.title = title;
        this.answers = answers;
    }
}
class Answer {
    private String value;
    private boolean correct;

    public Answer(String value, boolean correct) {
        this.value = value;
        this.correct = correct;
    }
}
