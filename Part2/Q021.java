package Part2;
public class Q021 {
    public static void main(String[] args) {
        // 3の倍数のときのみ?を表示しながら1から指定の数まで表示
        // 1から指定の数までの数字をカンマ（,）区切りで表示してください。ただし、3の倍数のときのみ文字「?」を表示してください。
        // また、最後の数はプログラムの先頭で変数に代入することで指定してください。

        int n = 20;

        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0) {
                System.out.print("?");
            } else {
                System.out.print(i);
            }
            if (i != n) {
                System.out.print(",");
            }
        }
    }
}