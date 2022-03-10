package Part2;
public class Q033 {
    public static void main(String[] args) {

        // 配列データから目的のデータを探す（線形探索）
        // 文字列型の配列に格納された複数の文字列データについて、指定した文字列（探索キー）の格納位置（添字）を表示させてください。
        // なお、指定の文字列が配列の文字列データに含まれない場合は文字列「Not found」を表示させてください。

        String[] a = {"abc", "abcd", "abcde", "xx", "yyy"};
        String key = "abcde";

        int i;
        for (i = 0; i < a.length; i++) {
            if (a[i].equals(key)) {
                break;
            }
        }

        if (i < a.length) {
            System.out.println(i);
        } else {
            System.out.println("Not found");
        }
    }
}