public class Test1Sample {
    public static void main(String[] args) {
        Person p1 = new Person("87", "Alice", 'F');
        Person p2 = new Person("39", "Bob", 'M');
        Person p3 = new Person("55", "Carol", 'F');
        p1.display();

        p1.marry(p3);
        p1.displaySpouse();

        System.out.println();

        p1.marry(p2);
        p2.displaySpouse();

        System.out.println();

        p1.marry(p2);
        p2.divorce();
        p2.marry(p3);
        p3.displaySpouse();
    }
}

class Person{
    String SSN;
    String name;
    char gender;
    private static Person spouse;

    Person(String SSN, String name, char gender){
        this.SSN = SSN;
        this.name = name;
        this.gender = gender;
        //this.spouse = spouse;
    }

    void display(){
        System.out.println("SSN " + SSN);
        System.out.println("name " + name);
        System.out.println("gender " + gender);
        //System.out.println("spouse " + spouse);
    }

    void marry(Person Y){
        if(this.spouse == null && Y.spouse == null && this.gender != Y.gender ){
            this.spouse = Y;
            Y.spouse = this;
        }
    }

    void divorce(){
        if(this.spouse != null){
            spouse.spouse = null;
            this.spouse = null;
        }
    }

    void displaySpouse(){
        if(this.spouse == null) System.out.println("There's no spouse!");
        else{
            spouse.display();
        }
    }
}

