import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Usuario usuario = new Usuario();
        usuario.setTlfno("+1234567890");
        usuario.setNombre("Pepe");

        System.out.println("Bienvenido, " + usuario.getNombre() + "!");
        System.out.println("Tu numero de telefono es: " + usuario.getTlfno());

        System.out.print("Ingresa el numero de telefono del destinatario: ");
        String numDest = scanner.nextLine();

        System.out.print("Ingresa 'SMS' para enviar un mensaje de texto o 'MMS' para enviar un mensaje multimedia: ");
        String messageType = scanner.nextLine();

        boolean messageSent = false;

        if (messageType.equalsIgnoreCase("SMS")) {
            System.out.print("Ingresa tu mensaje de texto: ");
            String text = scanner.nextLine();
            messageSent = usuario.enviarMensaje(numDest, text);
        } else if (messageType.equalsIgnoreCase("MMS")) {
            System.out.print("Ingresa el nombre del archivo de imagen: ");
            String ficheroImg = scanner.nextLine();
            System.out.print("Ingresa el tamano de la imagen: ");
            float tamanioImg = scanner.nextFloat();
            messageSent = usuario.enviarMensaje(numDest, ficheroImg, tamanioImg);
        } else {
            System.out.println("Tipo de mensaje invalido.");
        }

        if (messageSent) {
            System.out.println("Mensaje enviado con exito!");
        } else {
            System.out.println("Error al enviar el mensaje. Por favor, verifica el numero del destinatario e intenta de nuevo.");
        }

        System.out.println("Todos los mensajes enviados por " + usuario.getNombre() + ":");
        for (Mensaje mensaje : usuario.getMensajesEnviados()) {
            if (mensaje instanceof SMS) {
                SMS sms = (SMS) mensaje;
                System.out.println("SMS a " + sms.getNumDest() + ": " + sms.getText());
            } else if (mensaje instanceof MMS) {
                MMS mms = (MMS) mensaje;
                System.out.println("MMS a " + mms.getNumDest() + ": " + mms.getFicheroImg() + " (Tamano: " + mms.getTamanioImg() + " MB)");
            }
        }
        
        scanner.close();
    }
}