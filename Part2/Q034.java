package Part2;
public class Q034 {
    public static void main(String[] args) {

        // 最小値の探索
        // 配列に格納された数値データのうち、最小値とその格納位置（添字）を表示させてください。
        // なお、同じ値が複数の配列要素に格納されている場合は、添字が小さい方を表示させてください。

        int[] a = {68, 55, 72, 93, 87};

        int min = a[0];
        int index = 0;

        for (int i = 0; i < a.length; i++) {
            if (min > a[i]) {
                min = a[i];
                index = i;
            }
        }
        System.out.println(min);
        System.out.println(index);
    }
}

