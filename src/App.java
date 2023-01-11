public class App {
    public static void main(String[] args) throws Exception {

        User user = new User();

        user.name = "John";
        user.email = "teste@teste.com";
        user.password = "123456";

        Math course = new Math();

        course.basicCourse = "soma";
        course.advancedCourse = "equação de segundo grau";
        course.expertCourse = "Integração";

        System.out.println("Login feito para o usuário " + user.name);
        System.out.println("Temos aqui o curso de " + course.basicCourse + " para iniciantes e " + course.advancedCourse + " para intermediários e " + course.expertCourse + " para avançados");


    }
}
