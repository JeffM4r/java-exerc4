public class Payment {
  boolean mounthlyPayment = false;
  boolean yearlyPayment = false;
  boolean quartlyPayment = false;

  void setMounthlyPayment() {
    if (this.quartlyPayment == false && this.yearlyPayment == false) {
      this.mounthlyPayment = true;
    }
  }

  void setYearlylyPayment() {
    if (this.quartlyPayment == false && this.mounthlyPayment == false) {
      this.yearlyPayment = true;
    }

  }

  void setQuartlyPayment() {
    if (this.yearlyPayment == false && this.mounthlyPayment == false) {
      this.quartlyPayment = true;
    }

  }
}
