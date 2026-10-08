package object_oriented;

public class PokemonPractice {
  public static void main(String[] args) {

    Pokemon pikachu = new Pokemon("ピカチュウ", 60);

    pikachu.damage(100);
    System.out.println(pikachu.getHp()); // 0

    pikachu.heal(150);
    System.out.println(pikachu.getHp()); // 100

  }
}

class Pokemon {
  private String name;
  private int hp;

  Pokemon(String name, int hp) {
    this.name = name;
    this.hp = hp;
  }

  void damage(int amount) {
    if (amount < 0) {
      return;
    }

    this.hp = Math.max(0, this.hp - amount);
  }

  int getHp() {
    return this.hp;
  }

  void heal(int amount) {
    if (amount < 0) {
      return;
    }

    this.hp = Math.min(100, this.hp + amount);
  }

  String getName() {
    return this.name;
  }
}
