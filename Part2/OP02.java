package Part2;
public class OP02 {
    public static void main(String[] args) {

        // スワップ処理 〜 2つの変数データの入れ替え​​
        // 2つの数値型変数に別々の初期値が格納されている状態から、この2つの変数に格納されているデータを入れ替えてください。
        // 確認のため、入れ替えの前後で変数の値を表示させてください。

        int x = 1;
        int y = 2;

        System.out.println("スワップ処理前");
        System.out.println("x : " + x);
        System.out.println("y : " + y);

        int z = x;
        x = y;
        y = z;

        System.out.println("スワップ処理後");
        System.out.println("x : " + x);
        System.out.println("y : " + y);





        
    }
}

