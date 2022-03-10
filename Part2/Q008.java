package Part2;
public class Q008 {
    public static void main(String[] args) {
        // 縦ストライプ
        // 複数行にわたり奇数列に文字「■」、偶数列に文字「　」（全角スペース）を交互に並べて表示することで、縦向きのストライプ（縞模様）を表示させてください。
        // ただし、行数や列数はプログラムの先頭で変数に代入することで指定してください。

        int row = 5;
        int col = 7;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (j % 2 == 0) {
                    System.out.print("■");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
