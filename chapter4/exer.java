public class exer{
    public static void main(String[] args){
        // 4-1
        // int[] points = new int[4];
        // double[] weights = new double[5];
        // boolean[] answers = new boolean[3];
        // String[] names = new String[3];
        
        // 4-2
        // int[] moneylist = new int[]{121902,8302,55100};
        
        // 4-4
        int[] numbers = {3,4,9};
        System.out.println("1桁の数字を入力してください");
        int input = new java.util.Scanner(System.in).nextInt();
        for(int value : numbers){
            if (value == input){
                System.out.println("アタリ");    
            }
        }
    }
}