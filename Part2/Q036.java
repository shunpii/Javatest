package Part2;
public class Q036 {
    public static void main(String[] args) {

        // 配列データの並び替え（選択法）
        // 配列に格納された複数の数値データについて、数の小さい順（昇順）になるように並び替えてください。
        // 確認のために、並び替えの前後で配列データを表示させてください

        int[] n = {68, 55, 72, 93, 87};

        System.out.println("並び替え前");
        for (int i = 0; i < n.length; i++) {
            System.out.println(n[i]);
        }

        for (int i = 0; i < n.length; i++) {
            int minindex = i;

            for (int j = i + 1; j < n.length; j++) {
                if (n[minindex] > n[j]) {
                    minindex = j;
                }
            }

            int work = n[i];
            n[i] = n[minindex];
            n[minindex] = work;
        }

        System.out.println("並び替え後");
        for (int i = 0; i < n.length; i++) {
            System.out.println(n[i]);
        }
    }
}