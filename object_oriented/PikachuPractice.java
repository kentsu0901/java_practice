package object_oriented;

public class PikachuPractice {
  public static void main(String[] args) {
    Pikachu pikachu = new Pikachu();
    pikachu.attack();
  }
}

class PokemonBase {
  private String name;

  PokemonBase (String name) {
    this.name = name;
  }

  void attack() {
    System.out.println("攻撃する");
  }
}

class Pikachu extends PokemonBase {

  Pikachu() {
    super("ピカチュウ");
  }

  @Override
  void attack() {
    System.out.println("10まんボルト！");
  }
}
