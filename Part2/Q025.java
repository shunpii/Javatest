package Part2;
public class Q025 {
    public static void main(String[] args) {

        // 配列の内容を逆順に表示
        // 配列に格納されたデータを配列の末尾から逆順に表示させてください。
        // ただし、操作対象の配列はプログラムの先頭で宣言し、適当な初期値を代入してください。

        int[] a = {10, 20, 30, 40, 50};

        for (int i = a.length -1; i >= 0; i--) {
            System.out.println(a[i]);
            
        }
    }
}