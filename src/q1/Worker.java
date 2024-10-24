package q1;

public class Worker {
    String name;
    double wage;

    Worker(String a, double b){
        this.name=a;
        this.wage=b;
    }

    public String toString(){
        return "Name: "+name+"; Wage: "+wage;
    }
}
