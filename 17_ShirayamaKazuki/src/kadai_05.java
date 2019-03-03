public class kadai_05 {
    public static void main(String[] args) {
        String[] num = new String[]{"旅行が好き", "一日中 海を見ていられる", "ローカル線が気になる", "秘境駅が気になる", "思うがままに行動したい"};

        for (int i = 0; i < 5; i++) {
            System.out.println("Q" + (i + 1) + num[i]);

            }


        System.out.println("回答");
        ateh();
        System.out.println("Q1の回答入力：");int a = new java.util.Scanner(System.in).nextInt();
        System.out.println("Q2の回答入力：");int b = new java.util.Scanner(System.in).nextInt();
        System.out.println("Q3の回答入力：");int c = new java.util.Scanner(System.in).nextInt();
        System.out.println("Q4の回答入力：");int d = new java.util.Scanner(System.in).nextInt();
        System.out.println("Q5の回答入力：");int e = new java.util.Scanner(System.in).nextInt();


        if (a + b + c + d + e < 14) {
            System.out.println("すごく気が合います。今度ゆっくり話しましょう！");
        }
        if (a + b + c + d + e > 14) {
            System.out.println("あまり気が合わないかも。。。");
        }


    }

    public static void ateh(){
        System.out.println("1,あてはまる　２.まあまああてはまる　3.あまりあてはまらない　４.あてはまらない");
    }}
