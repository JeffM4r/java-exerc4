public class User {
  String name;
  private String email;
  Course course = new Course();
  private Payment paymentType = new Payment();

  String getEmail() {
    return this.email;
  };

  void setEmail(String email) {
    this.email = email;
  }

  Payment getPayment() {
    return this.paymentType;
  };

  void setPayment(String paymentTypeDesired) {
    if (paymentTypeDesired.equals("monthly")) {
      this.paymentType.setMounthlyPayment();
    }
    if (paymentTypeDesired.equals("quartly")) {
      this.paymentType.setQuartlyPayment();
    }
    if (paymentTypeDesired.equals("yearly")) {
      this.paymentType.setYearlylyPayment();
    }

  };
}
