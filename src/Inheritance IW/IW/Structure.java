package IW;

public class Structure {
    String name;
    int age;
    double salary;
    private String address;
    public String newAddress;

    public Structure(String name, int age, double salary, String address){
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.address = address;
    }

    public void show(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Salary: "+salary);
        System.out.println("Adress: "+address);
    }


    public String getAddress() {
        return address;
    }


    public void setAddress(String address){
        this.address = address;
    }
}
