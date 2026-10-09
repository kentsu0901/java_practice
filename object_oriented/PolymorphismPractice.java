package object_oriented;

public class PolymorphismPractice {
  public static void main(String[] args) {
    Animal[] animals = {new Animal(), new Dog(), new Cat()};

    for (Animal animal : animals) {
      animal.speak();
    }
  }
}

class Animal {
  void speak() {
    System.out.println("動物が鳴いています");
  }
}

class Dog extends Animal {
  @Override 
  void speak() {
    System.out.println("ワンワン！");
  }
}

class Cat extends Animal {
  @Override 
  void speak() {
    System.out.println("ニャー！");
  }
}
