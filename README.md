# java_practice

Java learning and practice

## 学習用フォルダ構成

| フォルダ | 学習内容 |
| --- | --- |
| `basics/` | 基本文法、変数、型、条件分岐、繰り返し、ArrayListの基本操作 |
| `collections/` | 配列、ArrayList、HashMap |
| `object_oriented/` | クラス、インスタンス、カプセル化、継承、オーバーライド、ポリモーフィズム、インターフェース |
| `algorithms/` | 探索、ソート、再帰など |
| `paiza/` | 問題ごとのサブフォルダで解答を管理 |

課題ごとにJavaファイルを保存し、分野別に学習内容を管理します。

保存例：

- `basics/ArrayListBasic.java`
- `basics/ArrayListNumbers.java`
- `collections/HashMapPractice.java`
- `object_oriented/PolymorphismPractice.java`
- `paiza/problem_name/Main.java`

各ファイルには対応する `package` 宣言を記述し、リポジトリのルートディレクトリからコンパイル・実行します。

例：

```bash
javac basics/ArrayListBasic.java
java basics.ArrayListBasic
```

各フォルダの `.gitkeep` は、空のフォルダをGitで管理するためのファイルです。

## 学習記録

| 日付 | テーマ・保存先 | 学んだこと・次に取り組むこと |
| --- | --- | --- |
| 2026-10-08 | 学習フォルダの整理、コレクション、オブジェクト指向 | ArrayList、HashMap、クラス、カプセル化、継承、オーバーライド |
| 2026-10-09 | ポリモーフィズム、ArrayListの復習 | オーバーロード、型変換、ポリモーフィズム、ArrayListの基本操作と数値処理 |

---

### 2026年10月8日（木）午前 — コレクションとオブジェクト指向

既存の学習フォルダ整理の記録に加え、以下の内容を学習した。カプセル化・継承・HashMapは会話で確認し、具体的な内容とArrayListは当日の練習コード・Git履歴から確認した。

| 学習内容 | 練習コード | 学んだこと |
| --- | --- | --- |
| ArrayList | [ArrayListPractice.java](collections/ArrayListPractice.java) | `ArrayList<Integer>`を作成し、`add()`で10〜50を追加。`remove(2)`でインデックス2の要素（30）を削除し、60を追加。拡張for文で各要素を取り出して表示した。 |
| HashMap | [HashMapPractice.java](collections/HashMapPractice.java) | `HashMap<String, Integer>`で名前と点数をキー・値として管理。`put()`による登録と同じキーの値の更新、`remove()`による削除、`get()`による取得を練習した。 |
| クラス・インスタンス・コンストラクタ | [PokemonPractice.java](object_oriented/PokemonPractice.java) | `Pokemon`クラスに名前とHPを持たせ、`new Pokemon("ピカチュウ", 60)`でインスタンスを作成。コンストラクタと`this`を使ってフィールドを初期化した。 |
| カプセル化・getter | [PokemonPractice.java](object_oriented/PokemonPractice.java) | 名前とHPを`private`にし、外部から直接変更せずにメソッドを通して扱う構成を練習した。`getHp()`と`getName()`でフィールドの値を取得できるようにした。 |
| メソッドによる状態管理・入力チェック | [PokemonPractice.java](object_oriented/PokemonPractice.java) | `damage()`と`heal()`でHPを変更。負の引数は`if`と`return`で処理を中止し、ダメージ時は`Math.max()`でHPの下限を0、回復時は`Math.min()`で上限を100にした。HP60から100のダメージで0、そこから150の回復で100になる例を記述した。 |
| 継承・親クラスのコンストラクタ | [PikachuPractice.java](object_oriented/PikachuPractice.java) | `Pikachu extends PokemonBase`で親クラスを継承。子クラスのコンストラクタから`super("ピカチュウ")`で親クラスのコンストラクタを呼び出した。 |
| メソッドのオーバーライド | [PikachuPractice.java](object_oriented/PikachuPractice.java) | `@Override`を付けて`attack()`を上書き。親クラスの「攻撃する」に対し、子クラスでは「10まんボルト！」を表示する処理を記述し、`pikachu.attack()`で呼び出した。 |
| パッケージ・インポート | `collections/`、`object_oriented/`内の各練習コード | `package collections;`と`package object_oriented;`で分野ごとにコードを分類。コレクションの練習では`import java.util.*;`を使用した。 |

継承の練習ファイルの最終更新時刻は12:08のため、午前中の学習という区分は会話での申告に基づく。実行結果の説明はコードから確認できる内容を記載している。

#### 学習を通して整理したこと

- ArrayListはインデックスで要素を扱い、HashMapはキーと値の組で情報を扱う。
- カプセル化では、フィールドを隠すだけでなく、値を変更するメソッドにチェックや範囲制御をまとめる。
- 継承では親クラスの構成を引き継ぎ、オーバーライドで子クラスに応じた処理を定義できる。
- フォルダ構成に載せているテーマでも、練習コードや会話で確認できない内容は、この日の学習実績として記載しない。

---

### 2026年10月9日（金）午前 — ポリモーフィズムとArrayList

前日に学習した継承・オーバーライドの知識を発展させ、ポリモーフィズムを学習した。

また、Javaの型変換とオーバーロードのルールを確認し、ArrayListの基本操作を実装問題で復習した。

| 学習内容 | 練習コード | 学んだこと |
| --- | --- | --- |
| ポリモーフィズム | [PolymorphismPractice.java](object_oriented/PolymorphismPractice.java) | `Animal`を親クラス、`Dog`と`Cat`を子クラスとして定義。`Animal`型の変数に子クラスのインスタンスを代入し、実際のインスタンスに応じて`speak()`の処理が切り替わることを確認した。 |
| 配列とポリモーフィズム | [PolymorphismPractice.java](object_oriented/PolymorphismPractice.java) | `Animal[]`に`Animal`、`Dog`、`Cat`のインスタンスを格納。拡張for文で`speak()`を呼び出し、共通の親クラス型で異なる子クラスをまとめて扱えることを確認した。 |
| オーバーロード | 会話での学習 | 同じ名前のメソッドでも、引数の数・型・順序が異なれば定義できることを学習。戻り値の型だけが異なる場合はオーバーロードにならないことを確認した。 |
| 型変換とメソッド選択 | 会話での学習 | `int`、`long`、`double`、`char`、`String`の違いを確認。基本データ型の拡大変換やボクシング、オーバーロードでのメソッド選択の優先順位を学習した。 |
| ArrayListの基本操作 | [ArrayListBasic.java](basics/ArrayListBasic.java) | `ArrayList<String>`を作成し、`add()`で追加、`set()`で変更、`remove()`で削除、`size()`で要素数を取得。拡張for文で残った要素を表示した。 |
| ArrayListと数値処理 | [ArrayListNumbers.java](basics/ArrayListNumbers.java) | `ArrayList<Integer>`に整数を格納し、拡張for文で合計を計算。`if`文と`%`演算子で偶数を判定し、別のArrayListに格納した。 |

#### 学習を通して整理したこと

**ポリモーフィズム**

- 親クラス型の変数には、子クラスのインスタンスを代入できる。
- オーバーライドされたメソッドは、実際のインスタンスの型に応じて実行される。
- 共通の親クラス型を使うことで、異なる子クラスのインスタンスを配列にまとめて扱える。

```java
Animal[] animals = {new Animal(), new Dog(), new Cat()};

for (Animal animal : animals) {
    animal.speak();
}
```

**オーバーライドとオーバーロード**

- オーバーライドは、親クラスから継承したメソッドを子クラスで再定義する仕組み。
- オーバーロードは、同じ名前で引数の異なるメソッドを複数定義する仕組み。
- オーバーロードでは、引数の数・型・順序によってメソッドを区別する。
- 戻り値の型だけを変更してもオーバーロードにはならない。

**型変換**

- `int`から`long`や`double`への暗黙的な型変換が可能。
- `char`は`int`に暗黙的に変換できる。
- `char`と`String`は異なる型であり、自動的に相互変換されるわけではない。
- オーバーロードのメソッド選択では、基本データ型の拡大変換がボクシングより優先される。
- `Integer`から`int`への自動変換をアンボクシングと呼ぶ。

**ArrayList**

- 通常の配列は要素数が固定されるが、ArrayListは要素数を動的に変更できる。
- `add()`：要素の追加
- `get()`：要素の取得
- `set()`：要素の変更
- `remove()`：要素の削除
- `size()`：要素数の取得
- `ArrayList<Integer>`では基本データ型の`int`ではなく、ラッパークラスの`Integer`を使用する。
- 拡張for文を使うことで、各要素に対して集計や条件判定を行える。

```java
ArrayList<Integer> numbers = new ArrayList<>();

numbers.add(10);
numbers.add(25);
numbers.add(30);
numbers.add(45);
numbers.add(50);

int sum = 0;
ArrayList<Integer> evens = new ArrayList<>();

for (int number : numbers) {
    sum += number;

    if (number % 2 == 0) {
        evens.add(number);
    }
}
```

#### 次に取り組むこと

- Javaのオブジェクト指向について、実装問題を通して理解を深める。
- 学習した文法をアルゴリズム問題にも活用する。

---

<!-- 今後の記録は、下の形式をコピーして学習記録の末尾に追記する。
### YYYY年M月D日（曜日）午前／午後 — 学習テーマ

| 学習内容 | 練習コード | 学んだこと |
| --- | --- | --- |
| テーマ | 対象ファイルへのリンク | 実際に取り組んだ内容・理解したこと |

#### 次に取り組むこと
- 必要に応じて記載する。
-->
