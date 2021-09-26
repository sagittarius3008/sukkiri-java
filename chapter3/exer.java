public class exer{
    public static void main(String[] args){
        // exer3-1
        // 1 weight == 60
        // 2 (age1 + age2)*2 > 60
        // 3 age % 2 == 1
        // 4 name.equals("湊")
        
        // 3-3
        // int seibetsu = 1;
        // int age = 20;
        // if (seibetsu == 0){
        //     System.out.println("男です");
        //     System.out.println(age + "歳です");
        // }else{
        //     System.out.println("女です");
        // }
        
        // 3-5
        // System.out.println("[メニュー]1:検索2:登録3:削除4:変更");
        // int selected = new java.util.Scanner(System.in).nextInt();
        // switch(selected){
        //     case 1:
        //         System.out.println("検索");
        //         break;
        //     case 2:
        //         System.out.println("登録");
        //         break;
        //     case 3:
        //         System.out.println("削除");
        //         break;
        //     case 4:
        //         System.out.println("変更");
        //         break;
        //     default:
        // }
        
        // 3-6
        System.out.println("数当てゲーム");
        int ans = new java.util.Random().nextInt(10);
        for(int i = 0; i < 5; i++){
            System.out.println("0-9の値を入力してください");
            int num = new java.util.Scanner(System.in).nextInt();
            if(num == ans){
                System.out.println("アタリ");
                break;
            }else{
                System.out.println("違います");
            }
        }
        System.out.println("繰り返し終わり");
                
        // int doorClose = 0;
        // while (doorClose < 3){
        //     System.out.println("knock");
        //     System.out.println("wait");
        //     doorClose ++;
        // }
        
        // for (int i = 0; i < 3; i++){
        //     System.out.println("現在" + (i + 1) + "周目→");
        // }
        
        // for(int i = 1; i < 10; i++){
        //     for ( int j = 1; j < 10; j++){
        //         System.out.print(i * j);
        //         System.out.print(" ");
        //     }
        //     System.out.println("");
        // }
    }
}