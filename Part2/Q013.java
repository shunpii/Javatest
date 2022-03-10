package Part2;
public class Q013 {
    public static void main(String[] args) {
        // 左下がりに文字を並べる
        // 複数行にわたり1つずつずらしながら文字「■」を表示することで、実行例のような左下がりの線を表示させてください。
        // なお、各列で■の前にあるスペース部分は、全角スペースを埋めてください。
        // ただし、行数はプログラムの先頭で変数に代入することで指定してください。

        int n = 8;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j == n - i - 1) {
                    System.out.print('■');
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
