/**
 * Daily challenge  Week6 Day1
 * @author  Melissa Kouadio
 * @link https://github.com/DiamondArt/
 */
public class Main {
    public static void main(String[] args) {

        Person me = new Person();
        Person jean = new Person("Jean Yves",35,4.000000);
        Person dombia = new Person("Doumbia Hassan",3);

        me.displayInfo();
        jean.displayInfo();
        dombia.displayInfo();

    }
}

class  Person {
    private String name;
    private int age;
    private double salary;

    /**
     * This constructor initiate default value of Person class
     */
     Person(){
         this.name = "Melissa Kouadio";
         this.age = 25;
         this.salary = 2.000000;
    }
    /**
     * This constructor assign new value of person class properties
     * @param _name
     * @param _age
     * @param _salary
     */
    Person(String _name,int _age, double _salary){
         this.name = _name;
         this.age = _age;
         this.salary = _salary;
    }
    /**
     * This constructor  assign new value of properties name and age only
     * @param _name
     * @param _age
     */
    Person(String _name,int _age){
        this.name = _name;
        this.age = _age;
        this.salary = -1;
    }

    /**
     * This method is used to display Person class info
     */
    public void displayInfo() {

        String info="";
        if(this.salary == -1){
             info = "Salary not provided";
        }else{
             info = this.name +" has " + this.age +" And has a salary estimate to " + this.salary;
        }
         System.out.println(info);
    }
}