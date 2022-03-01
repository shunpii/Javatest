public class Q023 {
    public static void main(String[] args) {

        // 九九表をきれいに表示
        // かけ算九九の表（答えのみ）を表示させてください。
        // 数と数の間は半角スペースで区切ります。

        int n = 9;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++){
                int ans = i * j;
                if (ans <= 9) {
                    System.out.print(" ");
                }
                System.out.print(ans + " ");
            }
            System.out.println();
        }
    }
}