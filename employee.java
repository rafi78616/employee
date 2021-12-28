public class employee {
    String name;
    int yearofJoining;
    int Salary;
    String address;

    public employee(String name, int yearofJoining, int salary, String address) {
        this.name = name;
        this.yearofJoining = yearofJoining;
        Salary = salary;
        this.address = address;
        System.out.println(
                "name =" + name + ",year of joining =" + yearofJoining + ",salary =" + Salary + ",address =" + address);
    }

    public static void main(String[] args) {

        employee emp1 = new employee("robert", 1994, 1000, "64C- WallsStreet");
        employee emp2 = new employee("Sam", 2000, 50000, "68D- WallsStreet");
        employee emp3 = new employee("john", 1999, 30000, "26B- WallsStreet");

    }
}
