abstract class Animal2 {
    private String name;
    private int age;

    public Animal2(String name, int age){
        this.name = name;
        this.age=age;
    }
    //추상클래스
    abstract void makeSound();

    //일반메소드
    public void sleep() { // 일반 메서드
        System.out.println(name + " is sleeping");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}


class Dog2 extends Animal2 {
    public Dog2(String name, int age) {
        super(name, age);
    }

    @Override
    void makeSound() {
        System.out.println("Woof");
    }
}
public class AbstractTest {
    public static void main(String[] args) {

        Dog2 dog2 = new Dog2("JINDO", 10);
        dog2.makeSound();
        dog2.sleep();

    }
}
