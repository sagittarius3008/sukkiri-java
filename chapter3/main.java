public class exer{
    public static void main(String[] args){
        // boolean doorClose = true;
        // while (doorClose == true){
        //     System.out.println("knock");
        //     System.out.println("wait");
        // }
        
        // int doorClose = 0;
        // while (doorClose < 3){
        //     System.out.println("knock");
        //     System.out.println("wait");
        //     doorClose ++;
        // }
        
        // for (int i = 0; i < 3; i++){
        //     System.out.println("現在" + (i + 1) + "周目→");
        // }
        
        for(int i = 1; i < 10; i++){
            for ( int j = 1; j < 10; j++){
                System.out.print(i * j);
                System.out.print(" ");
            }
            System.out.println("");
        }
    }
}