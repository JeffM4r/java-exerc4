public class App {
    public static void main(String[] args) throws Exception {
        Course course = new Course();
        course.name = "como fazer pipoca";
        course.classTime = "1 dia";

        User user = new User();
        user.name = "Leonardo";
        user.course = course;
        user.setEmail("leon@gmail.com");
        user.setPayment("yearly");

        Payment paymentUsed = user.getPayment();

        System.out.println("nome: "+ user.name);
        System.out.println("email: "+user.getEmail());
        System.out.println("curso: "+user.course.name);
        System.out.println("pagamento anual: " + paymentUsed.yearlyPayment);
        System.out.println("pagamento semestral: " + paymentUsed.quartlyPayment);
        System.out.println("pagamento mensal: " + paymentUsed.mounthlyPayment);
    }
}
