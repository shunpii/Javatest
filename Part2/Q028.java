package Part2;
public class Q028 {
    public static void main(String[] args) {

        // 指定範囲のデータのみ表示
        // 配列に格納された複数の数値データについて、指定した範囲（最小値と最大値を指定）のデータのみを先頭から順に表示させてください。
        // ただし、操作対象の配列はプログラムの先頭で宣言し、適当な初期値を代入してください。
        // また、範囲の最小値と最大値についても、プログラムの先頭でそれぞれ変数に代入することで指定してください。

        int[] a = {40, 10, 30, 50, 20};
        int max = 39;
        int min = 20;

        for (int i = 0; i < a.length; i++) {
            if (min <= a[i] && a[i] <= max) {
                System.out.println(a[i]);
            }
        }
    }
}