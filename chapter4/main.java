public class exer{
    public static void main(String[] args){
        // 配列
        // int[] score;
        // new int[5]:int型の要素を5つ作る
        // score = new int[5];
        // .length:要素の数をカウント
        // int count = score.length;
        // 2番目の要素に数字を代入
        // score[1] = 10;

        // 省略記法
        // パターン１
        // int[] score1 = new int[]{1,2,3,4,5};
        // パターン２
        // int[] score2 = {1,2,3,4,5};
        
        // 配列をfor文で回す
        // int[] num = {20,30,40,50,80};
        // for (int i = 0; i < num.length; i++){
        //     System.out.println(num[i]);
        // }
        
        // 拡張for文
        // 配列を回し終えるまで進めてくれる(numをvalueへ一つずつ入れていく)
        // int[] num = {20,30,40,50,80};
        // for(int value : num){
        //     System.out.println(value);
        // }
        
        // 2次元配列：行列
        // 40 50 60
        // 80 60 70
        // int[][] scores = new int[2][3];
        // scores[0][0] = 40;
        // scores[0][1] = 50;
        // scores[0][2] = 60;
        // scores[1][0] = 80;
        // scores[1][1] = 60;
        // scores[1][2] = 70;
        // System.out.println(scores[1][1]);
        
        // リファクタリング
        int[][] scores = {{10,20,30},{30,40,50}};
        System.out.println(scores.length);
        System.out.println(scores[0].length);
        System.out.println(scores[0][0]);
    }
}