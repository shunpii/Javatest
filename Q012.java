public class Q012 {
    public static void main(String[] args) {
        // 右下がりに文字を並べる
        // 複数行にわたり1つずつずらしながら文字「■」を表示することで、実行例のような右下がりの線を表示させてください。
        // ただし、行数はプログラムの先頭で変数に代入することで指定してください。なお、各列で■の前にあるスペース部分は、全角スペースを埋めてください。

        int n = 8;

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j ++) {
                System.out.print(" ");
            }
            System.out.println("■");
        }
    }
}
