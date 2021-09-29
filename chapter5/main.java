public class Main{
    // public static void main(String[] args){
    //     System.out.println("これからメソッドを呼びます。");
    //     hello(); //メソッド呼び出し
    //     System.out.println("呼び出し完了");
    // }
    // // helloメソッド
    // public static void hello(){
    //     System.out.println("こんにちは");
    // }

    // 引数の取り方
    // public static void main(String[] args){
    //     System.out.println("これからメソッドを呼びます。");
    //     hello("ミナト");
    //     hello("朝香");
    //     hello("菅原");
    //     System.out.println("メソッド呼び出し完了");
    // }
    // // hello()にて引数の型の宣言
    // public static void hello(String name){
    //     System.out.println(name + "さん、はろー");
    // }

    // 引数が複数
    // public static void main(String[] args){
    //     add(100,20);
    //     add(200,50);
    // }
    // // add()にて複数の値を受け取る
    // public static void add(int x, int y){
    //     int ans = x + y;
    //     System.out.println(x + "+" + y + "=" + ans);
    // }

    // // 各配列内要素に+1
    // public static void incArray(int[] array){
    //     for(int i = 0;i < array.length; i++){
    //         array[i]++;
    //     }
    // }
    // // incArrayメソッドの実行、各要素をprint
    // public static void main(String[] args){
    //     int[] array = {1, 2, 3};
    //     incArray(array);
    //     // 出力されるのは+1されたあと＝incArray内の変更が影響を与えている
    //     for(int i : array){
    //         System.out.println(i);
    //     }
    // }

    // public static int[] makeArray(int size){ //makeArray(3)
    //     int[] newArray = new int[size]; //int型を3つ取る配列
    //     for (int i = 0; i < newArray.length; i++){
    //         System.out.println(i);
    //         newArray[i] = i;
    //     }
    //     return newArray; // newArray{0,1,2}
    // }

    // public static void main(String[] args){
    //     int[] array = makeArray(3);
    //     for (int i : array){
    //         System.out.println(i);
    //     }
    // }
}