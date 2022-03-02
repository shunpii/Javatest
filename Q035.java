public class Q035 {
    public static void main(String[] args) {

        // 最大値の探索
        // 配列に格納された数値データのうち、最大値とその格納位置（添字）を表示させてください。
        // なお、同じ値が複数の配列要素に格納されている場合は、添字が小さい方を表示させてください。

        int[] a = {68, 55, 72, 93, 87};

        int max = a[0];
        int index = 0;

        for (int i = 0; i < a.length; i++) {
            if (max < a[i]) {
                max = a[i];
                index = i;
            }
        }
        System.out.println(max);
        System.out.println(index);
    }
}

