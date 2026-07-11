package com.coforge.day6;

import java.util.Optional;

class Employee {
    private String employeeName;
    
    public String getEmployeeName() {
        return employeeName;
    }
    
    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }
}

@FunctionalInterface
interface MyReference {
    void showMessage();
}

public class MethodReferenceTest {
    
    void myInstanceMethod() {
        System.out.println("Example for Instance Method Reference");
    }
    
    static void myStaticMethod() {
        System.out.println("Example for Static Method Reference");
    }
    
    MethodReferenceTest() {
        System.out.println("Constructor called");
    }
    
    // Note: Optional helps avoid direct null checks.
    public static Optional<Employee> getEmployee() {
        Employee employee = null;
        return Optional.ofNullable(employee);
    }
    
    public static void main(String[] args) {
        
        // Note: read the Optional safely before using the value.
        Optional<Employee> employeeOptional = getEmployee();
        if (employeeOptional.isPresent()) {
            System.out.println("Employee found: " + employeeOptional.get().getEmployeeName());
        } else {
            System.out.println("No employee found (Optional is empty).");
        }
        System.out.println("----------------------------------------");

        // Note: object::instanceMethod points to a non-static method of one object.
        MethodReferenceTest referenceExample = new MethodReferenceTest();
        MyReference reference = referenceExample::myInstanceMethod;
        reference.showMessage();
        
        // Note: ClassName::staticMethod points to a static method.
        reference = MethodReferenceTest::myStaticMethod;
        reference.showMessage();
        
        // Note: ClassName::new points to the constructor.
        reference = MethodReferenceTest::new;
        reference.showMessage();
    }
}
