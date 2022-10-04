package FORELESNING.ansattRegister;

public class Employee {
    private String name;
    private Date born, hired;
    private int paygrade;
    private final int MIN = 30, MAX = 80;

    public Employee(String name, Date born, Date hired) {
        this.name = name;
        this.born = born;
        this.hired = hired;
        paygrade = MIN;
    }

    // GET-SET method
    public String getName() {
        return name;
    }
    public int getPaygrade() {
        return paygrade;
    }
    public void setPaygrade(int paygrade) {
        if(paygrade >= MAX) {
            this.paygrade = MAX;
        } else if (paygrade <= MIN) {
            this.paygrade = MIN;
        } else {
            this.paygrade = paygrade;
        }
    }
    @Override
    public String toString() {
        return name + "\n  Born: " + born + "\n  Hired: " + hired;
    }
    
}
