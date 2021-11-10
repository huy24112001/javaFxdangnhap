package com.example.javafxdangnhap;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.regex.Pattern;

public class HelloController {
    int check=0,status ;
    @FXML
    private Button lgn;

    @FXML
    private CheckBox adm;

    @FXML
    private PasswordField pwd;

    @FXML
    private TextField us;

    @FXML
    public void click2(ActionEvent event) {

        if (check(us.getText(),pwd.getText())) {
            check ++;
            if(check==1) {
                Alert alert1 = new Alert(Alert.AlertType.INFORMATION);
                alert1.setTitle("Check");
                alert1.setContentText("Chúc mừng bạn đã đăng nhập thành công ");
                alert1.show();
                check = 0 ;
            }
            else if(check==2){
                Alert alert1 = new Alert(Alert.AlertType.INFORMATION);
                alert1.setTitle("Check");
                alert1.setContentText("Chúc mừng bạn đã đăng nhập thành công với tư cách là quản trị viên ");
                alert1.show();
                check = 0;
            }
        }
        else if(checkuser(us.getText())){
            Alert alert2 = new Alert(Alert.AlertType.ERROR);
            alert2.setTitle("Check");
            alert2.setContentText("Tài khoản của bạn phải ít nhất 3 kí tự trở lên. ");
            alert2.show();
        }
        else if(checkpassword(pwd.getText())){
            Alert alert3 = new Alert(Alert.AlertType.ERROR);
            alert3.setTitle("Check");
            alert3.setContentText("Mật khẩu của bạn phải ít nhất 8 kí tự trở lên, trong đó có ít nhất 1 số, 1 thường, 1 hoa, 1 kí tự đặc biệt ~!@#$%^&*().");
            alert3.show();
        }



}
    public void checkbox1(ActionEvent event){
        if(status == 0 )
            status = 1;
        else
            status=0;
        if(status == 1)
        check++;
    }
    private  boolean checkpassword(String s){
        if(s.matches("((?=.*[a-z])(?=.*d)(?=.*[~!@#$%^&*()])(?=.*[A-Z]).{8,30})")) return false;
        return true;
    }
    private boolean checkuser(String s){
        if(s.matches("(.{3,30})")) return false ;
        return true ;
    }
    private boolean check(String s1,String s2) {
        // Pattern pattern = new Parent();
        if (s2.matches("((?=.*[a-z])(?=.*d)(?=.*[~!@#$%^&*()])(?=.*[A-Z]).{8,30})") && s1.matches("(.{3,30})"))
            return true;
        return false;
    }
  @FXML  public void click1(ActionEvent event) throws IOException {

      Parent root2 = FXMLLoader.load(getClass().getResource("scene2.fxml"));
      Scene scene2 = new Scene(root2, 480, 300);
      scene2.getStylesheets().add(getClass().getResource("style.css").toExternalForm());
      Stage stage1 = new Stage();
      stage1.setTitle("Sign up");
      stage1.setScene(scene2);
      stage1.show();

    }


}


