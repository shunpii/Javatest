package Part2;
public class Q010 {
    public static void main(String[] args) {
        // 三角形に文字を並べる
        // 複数行にわたり数を1つずつ増やしながら文字「■」を表示することで、実行例のような三角形を表示させてください。
        // ただし、行数（＝列数）はプログラムの先頭で変数に代入することで指定してください。

        int n = 8;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("■");
            }
            System.out.println();
        }
    }
}
