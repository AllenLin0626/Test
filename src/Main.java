public class Main {

    public static void main(String[] args) {
        // write your code here
//        String name = "Fido";
//        System.out.print("Dog:" + name);

//        int eight = 8;
//        int nine = 9;

        String orangeTag = "10";//十
        String appleTag = "20";//廿

        int orangePrice = Integer.parseInt(orangeTag);
        int appleprice = Integer.parseInt(appleTag);

        System.out.print("total price is ");
        int num = orangePrice + appleprice;
        System.out.print(num);
    }
}
