public class User {
  private String name;
  private String email;
  private Course course;
  private Payment paymentType = new Payment();

  String getEmail() {
    return this.email;
  };

  void setEmail(String email) {
    this.email = email;
  };

  Course getCourse() {
    return this.course;
  };

  void setCourse(Course course) {
    this.course = course;
  };

  String getName() {
    return this.name;
  };

  void setName(String name) {
    this.name = name;
  };

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
