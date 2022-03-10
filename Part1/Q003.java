package Part1;

public class Q003 {
    // 下記を行ない、実行結果を得てください。

    // ①に「aが7より小さいならtrue」となる式を書きます。
    // コメントにならい、else ifブロックを追加します。else ifの条件は「aが7ならtrue」とします。
    // またブロック内には、「aは7です」と画面に表示するプログラムを入れます。
    // コメントにならい、elseブロックを追加します。ブロック内には「aは7より大きいです」と表示するプログラムを入れます。

    public static void main(String[] args) {
        int a = 7;

        if (a < 7) {
            System.out.println("aは７以下");
        } else if (a == 7) {
            System.out.println("aは７です");
        } else {
            System.out.println("aは７以上");
        }
    }
}
