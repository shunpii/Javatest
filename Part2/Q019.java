package Part2;
public class Q019 {
    public static void main(String[] args) {
        // 1から指定の数までカンマ区切りで表示
        // 1から指定の数までの数字をカンマ（,）区切りで表示してください。
        // ただし、最後の数はプログラムの先頭で変数に代入することで指定してください。
        
        int n = 7;

        for (int i = 1; i <= n; i++) {
            System.out.print(i + ",");
        }
    }
}
