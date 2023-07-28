public class Payment {
  private boolean monthlyPayment = false;
  private boolean yearlyPayment = false;
  private boolean quartlyPayment = false;

  Boolean getPaymentQuartly(){
    return this.quartlyPayment; 
  };

  Boolean getPaymentMonthly(){
    return this.monthlyPayment;
  };

  Boolean getPaymentYearly(){
    return this.yearlyPayment;
  };

  void setMounthlyPayment() {
    if (this.quartlyPayment == false && this.yearlyPayment == false) {
      this.monthlyPayment = true;
    }
  };

  void setYearlylyPayment() {
    if (this.quartlyPayment == false && this.monthlyPayment == false) {
      this.yearlyPayment = true;
    }

  };

  void setQuartlyPayment() {
    if (this.yearlyPayment == false && this.monthlyPayment == false) {
      this.quartlyPayment = true;
    }

  };
}
