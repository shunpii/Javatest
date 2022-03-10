package Part2;
public class Q022 {
    public static void main(String[] args) {

        // 九九表
        // かけ算九九の表（答えのみ）を表示させてください。
        // 数と数の間は半角スペースで区切ります。

        int n = 9;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                int ans = i * j;
                System.out.print(ans + " ");
            }
            System.out.println();
        }
    }
}