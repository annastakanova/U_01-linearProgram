//возможно, не так поняла условие задачи.
//
public class Task31a {
    public static void main(String[] args) {
        int vBoat = 9;
        int vRiver = 3;
        int timeLake = 2;
        int timeRiver = 3;
        int sLake = vBoat*timeLake;
        int sRiver = (vBoat-vRiver)*timeRiver;

        System.out.println("лодка прошла по озеру = " + sLake);
        System.out.println("лодка прошла по реке = " + sRiver);
    }
}