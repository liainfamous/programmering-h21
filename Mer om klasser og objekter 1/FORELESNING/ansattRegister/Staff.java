package FORELESNING.ansattRegister;

public class Staff {
    private Employee[] mainStaff = new Employee[2];

    public Staff() {
        String name1 = "Jane Doe";
        Date born1 = new Date(1,5,1990);
        Date hired1 = new Date(20,8,2010);
        mainStaff[0] = new Employee(name1, born1, hired1); // alt. method.

        /* 
        Employee employee1 = new Employee(name1, born1, hired1);
        mainStaff[0] = employee1;
        */ 

        String name2 = "John Doe";
        Date born2 = new Date(7,8,1986);
        Date hired2 = new Date(14,7,1999);
        Employee employee2 = new Employee(name2, born2, hired2); // alt. method. line 15-16
        mainStaff[1] = employee2;
    }

    @Override
    // for-each loop
    public String toString() {
        String output = "";
        for(Employee aEmployee : mainStaff) {
            if (aEmployee != null) {
                output += aEmployee + "\n";
            }
        }
        return output;
    }
  
}
