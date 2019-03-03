public class yobi {
    public static void main(String[] args) {
        String[]num=new String[5];
        num[0]="旅行が好き";
        num[1]="一日中 海を見ていられる";
        num[2]="ローカル線が気になる";
        num[3]="秘境駅が気になる";
        num[4]="思うがままに行動するのが好き";

        System.out.println(num[0]);
        atehamaru();
        int a = new java.util.Scanner(System.in).nextInt();

        System.out.println(num[1]);
        atehamaru();
        int b = new java.util.Scanner(System.in).nextInt();

        System.out.println(num[2]);
        atehamaru();
        int c = new java.util.Scanner(System.in).nextInt();

        System.out.println(num[3]);
        atehamaru();
        int d = new java.util.Scanner(System.in).nextInt();

        System.out.println(num[4]);
        atehamaru();
        int e = new java.util.Scanner(System.in).nextInt();

        if(a+b+c+d+e<14){System.out.println("すごく気が合います。今度ゆっくり話しましょう！");}
        if(a+b+c+d+e>14){System.out.println("あまり気が合わないかも。。。");}


    }

    public static void atehamaru(){
        System.out.println("1,あてはまる　２.まあまああてはまる　3.あまりあてはまらない　４.あてはまらない");
    }
}
