package Part2;
public class Q026 {
    public static void main(String[] args) {

        // 配列の内容をカンマ区切りで表示
        // 配列に格納されたデータを先頭から順にカンマ区切りで表示させてください。
        // ただし、操作対象の配列はプログラムの先頭で宣言し、適当な初期値を代入してください。

        int[] a = {10, 20, 30, 40, 50};

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
            if (i != a.length -1) {
                System.out.print(",");
            }
        }
    }
}