public class Manager extends Employee {
    private int employeeOfManager;

    public Manager(int id, String name, String surname, int employeeOfManager) {
        super(id, name, surname);
        this.employeeOfManager = employeeOfManager;
    }
    public void hiring(Employee employee){
        System.out.println(employee.getName()+" işe alınmıştır.");
        employeeOfManager++;
    }

    @Override
    public void getInformation() {
        super.getInformation();
        System.out.println("Yönetici " + employeeOfManager + " kişiden sorumlu.");
    }
}
