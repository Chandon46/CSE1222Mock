package q1;

public class Director extends Supervisor{
    Director(String a, double b, String c){
        super(a, b, c);
    }
    public String toString(){
        return "Name: "+name+"; Division: "+ division+"; Wage: "+wage;
    }
}
