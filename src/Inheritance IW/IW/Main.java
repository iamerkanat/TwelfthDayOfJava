package IW;

public class Main {
    public static void main(String[] args) {
        Employee Manny = new Employee("Manny", 19, 300000, "Seifullina 303");
        Employee Steven = new Employee("Steven", 23, 400000, "Satpaev 39A");


        Manny.show();
        Steven.show();
        Manny.setAddress("Jandosov 54");

        System.out.println("Real address: " + Manny.getAddress());
    }
}
