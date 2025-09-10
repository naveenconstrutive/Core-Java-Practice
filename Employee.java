public class Employee{
    
    private int age;
    private String name;
    private String salary;
    
    public Employee(int age, String name, String salary){
        this.age = age;
        this.name = name;
        this.salary = salary;
        
    }
    
    public void setAge(int age){
        this.age =age;
    }
    
    public void setName(String name){
        this.name =name;
    }
    
    public void setSalary(String salary){
        this.salary =salary;
    }
    
    public int getAge(){
        return age;
    }
    
    public String getName(){
        return name;
    }
    
    public String getSalary(){
        return salary;
    }
    
}