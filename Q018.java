public class Q018 {
    public static void main (String[] args) {
        // 指定の数から1まで縦に表示
        // 複数行にわたり1以上の指定の数から1までを降順（大きい数から減っていく順番）に表示してください。いわゆるカウントダウンです。
        // ただし、最初の数はプログラムの先頭で変数に代入することで指定してください。

        int n = 10;

        for (int i = 0; i < n; i++) {
            int ans = n - i;
            System.out.println(ans);
        }
    }
}
