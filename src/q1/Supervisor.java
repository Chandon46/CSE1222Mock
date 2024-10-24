package q1;

public class Supervisor extends Worker{
    String division;
    Supervisor(String a, double b, String c){
        super(a, b);
        this.division=c;
    }

    public String toString(){
        return "Name: "+name+"; Division: "+ division+"; Wage: "+wage;
    }

}
