package Part2;
public class Q027 {
    public static void main(String[] args) {

        // 文字数が指定数以下のデータのみ表示
        // 文字列型の配列に格納された複数の文字列データについて、文字数が指定数以下のデータのみを先頭から順に表示させてください。
        // ただし、操作対象の配列はプログラムの先頭で宣言し、適当な初期値を代入してください。
        // また、文字数もプログラムの先頭で変数に代入することで指定してください。

        String[] a = {"abc", "abcd", "abcde", "xx", "yyy"};
        int n = 3;

        for (int i = 0; i < a.length; i++) {
            if (a[i].length() <= n) {
                System.out.println(a[i]);
            }
        }
    }
}