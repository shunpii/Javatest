public class Q007 {
    public static void main(String[] args) {
        // 横ストライプ
        // 奇数行にのみ文字「■」を並べて表示することで、横向きのストライプ（縞模様）を表示させてください。
        // ただし、行数や列数はプログラムの先頭で変数に代入することで指定してください。

        int row = 5;
        int col = 7;

        for (int i = 0; i < row; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < col; j++) {
                    System.out.print("■");
                }            
            }
            System.out.println();
        }
    }
}
