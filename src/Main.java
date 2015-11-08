public class Main {

    public static void main(String[] args) {
        // write your code here
        //day 0
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

        //day 1

//        int sizeOfHoskey=150;
//        int sizeOfLapulado=200;

//        String hoskey="Hoskey";
//        String lapulado="Lapulado";

        Dog dog1 = new Dog("hoskey", 150);
        Dog dog2 = new Dog("lapulado", 200);
        Dog dog3 = new Dog("veryExpensive", 50);


        int[] numList = {2, 2, 2, 2};
        String[] nameList = {"lalala", "bbb", "bbb"};

    }
}
