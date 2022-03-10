package Part2;
public class Q006 {
    public static void main(String[] args) {
        // 2つの文字を交互に並べる（条件分岐と繰り返し）
        // 文字「◇」と文字「◆」を交互に表示させてください。
        // ただし、並べる文字数はプログラムの先頭で変数に代入することで指定してください

        int n = 11;

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                System.out.print("◆");
            } else {
                System.out.print("◇");
            }
        }
    }
}
