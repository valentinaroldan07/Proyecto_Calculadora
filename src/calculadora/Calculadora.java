
package calculadora;

public class Calculadora {
    
public static void main(String[] args) {
       Ventana inicio = new Ventana();
       inicio.setTitle("CALCULADORA BÁSICA");
       inicio.setBounds(500, 100, 400, 400);
       inicio.setResizable(false);
       inicio.insertarpanel();
       inicio.insertarTexto();
       inicio.insertarBotones();
    }
    
}
