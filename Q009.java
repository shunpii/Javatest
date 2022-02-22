public class Q009 {
    public static void main(String[] args) {
        // 市松模様
        // 複数行にわたり文字「■」と文字「　」（全角スペース）を交互に並べて表示することで、実行例のような市松模様を表示させてください。
        // ただし、行数や列数はプログラムの先頭で変数に代入することで指定してください。

        int row = 6;
        int col = 10;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (j % 2 == i % 2) {
                    System.out.print("■");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
