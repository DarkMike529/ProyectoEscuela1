import java.sql.Connection;
import java.sql.SQLException;
import models.Conexionn;
import screens.VentanaPrincipal;

public class App {
    public static void main(String[] args) throws Exception {
        Connection conn = null;
        try {
            conn = Conexionn.conectar();{
                System.out.println("Conexion exitosa a la base de datos");
            }
        } catch (SQLException e) {
            System.out.println("Error al conectar a la base de datos" + e.getMessage());
        }
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        VentanaPrincipal ventanaPrincipal = new VentanaPrincipal("Proyecto Escuela", conn);
        ventanaPrincipal.setSize(500,500);
        ventanaPrincipal.setVisible(true);
    }
}