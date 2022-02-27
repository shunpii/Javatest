public class Q016 {
    public static void main(String[] args) {
        // 1から指定の数まで縦に表示
        // 複数行にわたり1から指定の数までを順に表示してください。
        // ただし、最後の数はプログラムの先頭で変数に代入することで指定してください。

        int n = 7;
        int mul = 5;

        for (int i = 1; i <= n; i++) {
            int ans = i * mul;
            System.out.println(ans);
        }
    }
}
