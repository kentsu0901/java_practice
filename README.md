# java_practice
Java learning and practice


## 学習用フォルダ構成

| フォルダ | 学習内容 |
| --- | --- |
| `basics/` | 基本文法、変数、型、条件分岐、繰り返し |
| `collections/` | 配列、ArrayList、HashMap |
| `object_oriented/` | クラス、インスタンス、カプセル化、継承、インターフェース |
| `algorithms/` | 探索、ソート、再帰など |
| `paiza/` | 問題ごとのサブフォルダで解答を管理 |

課題ごとにサブフォルダを作り、その中に `Main.java` を保存します。
例：`collections/01_arraylist/Main.java`、`paiza/problem_name/Main.java`。
各課題のフォルダで `javac Main.java`、`java Main` の順に実行できます。

各フォルダの `.gitkeep` は、空のフォルダをGitで管理するためのファイルです。

## 学習記録

| 日付 | テーマ・保存先 | 学んだこと・次に取り組むこと |
| --- | --- | --- |
| 2026-10-08 | 学習フォルダの整理 | 分野ごとに学習内容と課題を管理する構成を作成 |


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

<!-- 今後の記録は、下の形式をコピーして学習記録の末尾に追記する。
### YYYY年M月D日（曜日）午前／午後 — 学習テーマ

| 学習内容 | 練習コード | 学んだこと |
| --- | --- | --- |
| テーマ | 対象ファイルへのリンク | 実際に取り組んだ内容・理解したこと |

#### 次に取り組むこと
- 必要に応じて記載する。
-->
