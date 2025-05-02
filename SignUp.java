import java.util.Scanner;

public class SignUp {
    public static void main(String[] args) {
        //Vamos a crear un formulario de registro
        System.out.println("Formulario de registro:");
        //Los datos que debes pedir al usuario son:
        //1. Nombre
        //2. Apellido
        //3. Nombre de usuario
        //4. Contraseña
        Scanner scanner = new Scanner(System.in);
        System.out.println("¿Cuál es tu nombre?");
        String name = scanner.nextLine();
        System.out.println("¿Cuál es tu apellido?");
        String lname = scanner.nextLine();
        System.out.println("Escribe tu nombre de usuari@");
        String user = scanner.nextLine();
        System.out.println("Escribe tu contraseña");
        String pw = scanner.nextLine();

        //Añade una nueva línea antes de mostrar la siguiente pregunta.

        //Imprimir el siguiente resultado:
        //Hola <nombre> <apellido>, tu nombre de usuario es <usuario> y tu contraseña es <contraseña>, gracias por registrarte.
        //Añade una nueva línea antes de mostrar la respuesta
        System.out.println("Hola " + name + " " + lname + ", tu nombre de usuari@ es " + user + " y tu contraseña es " + pw + ", gracias por registrarte.");
        scanner.close();
    }
}