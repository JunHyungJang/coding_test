


interface Animal {

    // 변수는 항상 public static final 입니다.
    int MAX_VALUE = 100;
    String GREETING = "Hello, world!";


    void makeSound();

    //java 8 이상부터 인터페이스도 구현 메소드를 만들 수 있음
    default void sleep(){
        System.out.println("SLEEP");
    }

    static void info(){
        System.out.println("INFO");
    }
}

interface Pet {
    void play();

    default void cuddle() {
        System.out.println("Pet is cuddling");
    }
}


class Dog implements Animal,Pet {

    @Override
    public void makeSound() {
        System.out.println("멍멍");
    }

    @Override
    public void play() {

    }
}

public class InterfaceTest {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.makeSound();
        dog.sleep();
        dog.play();

        Animal.info();
        System.out.println(Animal.GREETING);

    }
}
