import javax.swing.*;

public class ventana extends javax.swing.JFrame  {
     public ventana() {
        super("Nueva Ventana");// pone el titulo a la ventana

    
	setSize(400, 300); //cambia el tamaño
	setResizable(false); //evita que el usuario pueda cambiar el tamaño
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setVisible(true); //si es visible o no la  ventana
	
}public static void main(String[] args) {
	ventana ventana= new ventana();
    }


}

