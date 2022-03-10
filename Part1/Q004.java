package Part1;

public class Q004 {
    // 下記のとおりに動作するswitch文を完成してください。

    // a = 1またはa = 2の時は、画面に「小」と表示する
    // a = 3またはa = 4の時は、画面に「中」と表示する
    // a = 5またはa = 6の時は、画面に「大」と表示する

    public static void main(String[] args) {
        int a = 5;

        switch (a) {
            case 1:
            case 2:
                System.out.println("小");
                break;
            case 3:
            case 4:
                System.out.println("中");
                break;
            case 5:
            case 6:
                System.out.println("大");
                break;
        }
    }
}
