public class Main {
    public static void main(String[] args) {


        Answer[] answer1 = new Answer[3];
        answer1[0] = new Answer("Москва", true);
        answer1[1] = new Answer("Казань", false);
        answer1[2] = new Answer("Нижний Новгород", false);

        Question[] question1 = new Question[1];
        question1[0] = new Question("Столица России?",answer1);
        //...
        Game game1 = new Game("Угадай столицу!",question1);
        game1.start();

    }
}
















// аггрегация
class Car {
    private String name;
    private Wheel wheel;
}
class Wheel {

}
// композиция
class Wardrobe {
    class Door {

    }
}