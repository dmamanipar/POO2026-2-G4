package pe.edu.upeu.sysventas.controller;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Rectangle2D;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Screen;
import javafx.stage.Stage;
import pe.edu.upeu.sysventas.SysVentas;
import pe.edu.upeu.sysventas.config.AppContext;
import pe.edu.upeu.sysventas.model.Usuario;

public class LoginController {


    @FXML
    TextField txtUsuario;

    @FXML
    PasswordField txtClave;

    @FXML
    public void login(ActionEvent e){
        if(txtUsuario.getText().equals("davidmp") && txtClave.getText().equals("123456")){
            abrirPantalla(e, new Usuario());
        }else{
            System.out.println("Error en las credenciales");
        }
    }

    private void abrirPantalla(ActionEvent e, Usuario u){
        try {
            AppContext appContext=AppContext.getInstance();
            Screen screen=Screen.getPrimary();
            FXMLLoader fxmlLoader = new FXMLLoader(SysVentas.class.getResource("/view/maingui.fxml"));
            fxmlLoader.setControllerFactory(appContext::getBean);
            Rectangle2D dimension=screen.getBounds();

            Scene scene = new Scene(fxmlLoader.load(), dimension.getWidth(), dimension.getHeight());
            scene.getStylesheets().add(getClass().getResource("/css/style.css").toExternalForm());

            Stage stage=(Stage) ((Node)e.getSource()).getScene().getWindow();

            stage.setTitle("SysVentas Login!");
            stage.setScene(scene);
            stage.setResizable(true);
            stage.setX(dimension.getMinX());
            stage.setY(dimension.getMinY());
            stage.show();
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }

    @FXML
    public void logout(){
        Platform.exit();
        System.exit(0);
    }

}
