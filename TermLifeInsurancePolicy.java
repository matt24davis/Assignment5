package Company;

public class TermLifeInsurancePolicy extends InsurancePolicy {

    private String beneficiary;
    private int term;
    private double termPayout;

    public TermLifeInsurancePolicy(String name, String child, int length ,double total ){
        super(name);
        beneficiary = child;
        term = length;
        termPayout = total;
    }

    public String getBeneficiary() {
        return beneficiary;
    }

    public void setBeneficiary(String beneficiary) {
        this.beneficiary = beneficiary;
    }

    public int getTerm() {
        return term;
    }

    public void setTerm(int term) {
        this.term = term;
    }

    public double getTermPayout() {
        return termPayout;
    }

    public void setTermPayout(double termPayout) {
        this.termPayout = termPayout;
    }

    @Override
    public void selectPolicyCoverage(){
        System.out.println("Selecting Policy Coverages");
    }
    @Override
    public void calculatePremium(){
        System.out.println("Calculating and Updating Premium");
    }
    @Override
    public String toString(){

        return "Name:"+ getPolicyHolder() +
                "Beneficiary: " + beneficiary + "\n" +
                "Term: " + term + "\n" +
                "Term Payout: "+ termPayout;
    }

}
