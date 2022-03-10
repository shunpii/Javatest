package Part2;
public class Q029 {
    public static void main(String[] args) {
        // 配列データのコピー
        // 配列に格納された複数の数値データについて、別に用意した配列に同じ並びでコピーしてください。
        // ただし、コピー元の配列はプログラムの先頭で宣言し、適当な初期値を代入してください。
        // また、コピー先の配列はコピー元の配列と同じ型・同じ要素数となるようにプログラムの先頭で宣言してください。

        int[] n = {10, 20, 30, 40, 50};
        int[] a = new int[n.length];

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        
        for (int i = 0; i < n.length; i++) {
            a[i] = n[i];
        }

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}