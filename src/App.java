public class App {
    public static void main(String[] args) throws Exception {
        Course course = new Course();
        course.setName("como fazer pipoca");
        course.setClassTime("1 dia");

        User user = new User(course);
        user.setName("Leonardo");
        user.setEmail("leon@gmail.com");
        user.setPayment("yearly");

        Payment paymentUsed = user.getPayment();
        Course coursing = user.getCourse();

        System.out.println("nome: " + user.getName());
        System.out.println("email: " + user.getEmail());
        System.out.println("curso: " + coursing.getName());
        System.out.println("pagamento anual: " + paymentUsed.getPaymentYearly());
        System.out.println("pagamento semestral: " + paymentUsed.getPaymentQuartly());
        System.out.println("pagamento mensal: " + paymentUsed.getPaymentMonthly());
    }
}
