package Company;

public class HealthInsurancePolicy extends InsurancePolicy implements Deductible {
    private double deductibleLimit;
    private double totalDeductiblePaid = 0 ;
    private double coPayment;
    private double totalCoPaymentPaid = 0;
    private double totalOutOfPocket;

    public HealthInsurancePolicy(String name ,double limit,double copay,double oop ){
        super(name);
        deductibleLimit = limit;
        coPayment = copay;
        totalOutOfPocket = oop;
    }

    public double getDeductibleLimit() {
        return deductibleLimit;
    }

    public void setDeductibleLimit(double deductibleLimit) {
        this.deductibleLimit = deductibleLimit;
    }

    public double getTotalDeductiblePaid() {
        return totalDeductiblePaid;
    }

    public void setTotalDeductiblePaid(double totalDeductiblePaid) {
        this.totalDeductiblePaid = totalDeductiblePaid;
    }

    public double getCoPayment() {
        return coPayment;
    }

    public void setCoPayment(double coPayment) {
        this.coPayment = coPayment;
    }

    public double getTotalCoPaymentPaid() {
        return totalCoPaymentPaid;
    }

    public void setTotalCoPaymentPaid(double totalCoPaymentPaid) {
        this.totalCoPaymentPaid = totalCoPaymentPaid;
    }

    public double getTotalOutOfPocket() {
        return totalOutOfPocket;
    }

    public void setTotalOutOfPocket(double totalOutOfPocket) {
        this.totalOutOfPocket = totalOutOfPocket;
    }

    @Override
    public void selectPolicyCoverage() {
        System.out.println("Selecting Policy Coverages");
    }

    @Override
    public void calculatePremium() {
        System.out.println("Calculating and Updating Premium");

    }

    @Override
    public boolean hasMetDeductible() {
        if(totalDeductiblePaid >= deductibleLimit)
            return true;
        else
            return false;
    }
    @Override
    public boolean hasMetTotalOutOfPocket() {
        double totalPayment = totalCoPaymentPaid +totalDeductiblePaid;
        if(totalPayment>= totalOutOfPocket)
             return true ;
        else
             return false;
    }

    @Override
    public String toString() {
        return "Deductible Limit: " + deductibleLimit +
                ", Total Deductible Paid: " + totalDeductiblePaid +
                ", CoPayment: " + coPayment +
                ", totalCoPaymentPaid: " + totalCoPaymentPaid +
                ", totalOutOfPocket: " + totalOutOfPocket +
                "" + super.toString();
    }
}
