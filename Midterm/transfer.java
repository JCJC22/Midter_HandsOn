public class transfer implements currency {
    
    private double amount;

    public transfer(double amount){
        this.amount = amount;
    }

    public double getAmount(){
        return amount;
    }

    public void setAmount(double amount){
        this.amount = amount;
    }

    @Override
    public void PesotoEu() {
            double rate = 0.018;
            double con = amount * rate;
            System.out.println("The Converted Amount is " + String.format("%.2f", con) + " Euro");
    }

    @Override
    public void EurotoPe() {
        double rate = 56.48;
        double con = amount * rate;
        System.out.println("The Converted Amount is " + String.format("%.2f", con) + " Peso");
    }

    @Override
    public void DollartoPe() {
        double rate = 56.30;
        double con = amount * rate;
        System.out.println("The Converted Amount is " + String.format("%.2f", con) + " Peso");   
    }

    @Override
    public void PesotoDo() {
        double rate = 0.018;
        double con = amount * rate;
        System.out.println("The Converted Amount is " + String.format("%.2f", con) + " Dollar");
    }
}
