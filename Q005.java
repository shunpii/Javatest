public class Q005 {
    public static void main(String[] args) {
        // 横と縦に並べる（二重ループ）
        // 文字「●」を縦、横に四角形に敷き詰めるように表示させてください。
        // ただし、並べる行数、列数はプログラムの先頭で変数に代入することで指定してください。

        int row = 5;
        int col = 5;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("●");
            }
            System.out.println();
        }
    }
}
