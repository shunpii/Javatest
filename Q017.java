public class Q017 {
    public static void main(String[] args) {
        // 1から指定の数まで縦に表示
        // 複数行にわたり1から指定の数までを順に表示してください。
        // ただし、最後の数はプログラムの先頭で変数に代入することで指定してください。

        int n = 20;
        int mul = 4;

        for (int i = 1; i <= n; i++) {
            if (i % mul == 0) {
                System.out.println(i);
            }
        }
    }
}
