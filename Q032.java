public class Q032 {
    public static void main(String[] args) {

        // 指定範囲のデータのみ合計
        // 配列に格納された数値データのうち、指定の範囲に含まれるデータのみの合計を求め表示させてください。
        // ただし、操作対象の配列はプログラムの先頭で宣言し、適当な初期値を代入してください。
        // また、範囲の最小値と最大値についても、プログラムの先頭でそれぞれ変数に代入することで指定してください。

        int[] a = {68, 55, 72, 93, 87};
        int max = 100;
        int min = 80;
        int sum = 0;

        for (int i = 0; i < a.length; i++) {
            if (min < a[i] && a[i] < max) {
                sum = sum + a[i];          
            }
        }
        System.out.println(sum);
    }
}
