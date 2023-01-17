public class Client {
    public static void main(String[] args) {

        Employee employee1 = new Employee("Jonson Borg", "Cool Department", new Role("Engineer")); 
        System.out.println(employee1);
        employee1.addRole(new Role("Manager"));
        System.out.println(employee1);
        employee1.removeRole("Manager");
        System.out.println(employee1);

    }
}
