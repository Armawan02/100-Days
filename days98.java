package armawan;
public class Days98 {
    String JohnJohnson;
    public Days98(String John){
    this.JohnJohnson = John;
    }
    public void output(){
        System.out.println("John Johnson :\n"+JohnJohnson);
    }
    public static void main(String[] args) {
        Days98 kataKata = new Days98("First, solve the problem.Then, write the code.");
        kataKata.output();
    }
}
