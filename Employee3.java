class Employee3 {
    int id;
    String name;
    String department;

    
    Employee3(int id, String name) {
        this(id, name, "General");
    }

   
    Employee3(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    
    void displayEmployee2() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println();
    }
   
     public static void main(String[] args) {

        Employee3 e1 = new Employee3(101, "Divya");
        Employee3 e2 = new Employee3(102, "Kavya", "CSE");

        e1.displayEmployee2();
        e2.displayEmployee2();
     }
    }