public class exer{
    public static void main(String[] args){
        // introduceOneself();

        // String body = "hogehoge";
        // String address = "hoge@example.com";
        // email(address, body);

        double triangleArea = calcTriangleArea(10.0, 5.0);
        System.out.println("三角形の面積：" + triangleArea);
        double circleArea = calcCircleArea(5.0);
        System.out.println("円の面積：" + circleArea);
    }

    public static double calcTriangleArea(double bottom, double height){
        double area = (bottom * height) / 2;
        return area;
    }
    public static double calcCircleArea(double radius){
        double area = (radius * radius) * 3.14;
        return area;
    }

    // public static void introduceOneself(){
    //     String name = "name";
    //     int age = 32;
    //     double height = 170.5;
    //     char sex = '男';
    //     System.out.println("私は"+ name + "、身長は" + height + "cmの" + sex + "です");
    // }

    // public static void email(String address, String title, String body){
    //     String title = "無題"
    //     System.out.println(address+"にメール送ったよ");
    //     System.out.println("件名：" + title);
    //     System.out.println("本文:" + body);
    // }
    // public static void email(String address, String body){
    //     System.out.println(address+"にメール送ったよ");
    //     System.out.println("件名：" + "無題");
    //     System.out.println("本文:" + body);
    // }
    // public static void email(String address, String title, String body){
    //     // String title = "無題"
    //     System.out.println(address+"にメール送ったよ");
    //     System.out.println("件名：" + title);
    //     System.out.println("本文:" + body);
    // }
}