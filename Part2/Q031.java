package Part2;
public class Q031 {
    public static void main(String[] args) {

        // 配列データの平均
        // 配列に格納された数値データの平均を求め表示させてください。
        // ただし、操作対象の配列はプログラムの先頭で宣言し、適当な初期値を代入してください。

        int[] a = {68, 55, 72, 93, 87};
        int sum = 0;

        for (int i = 0; i < a.length; i++) {
            sum = sum + a[i];
        }
        int ave = sum / a.length;
        System.out.println(ave);
    }
}