package sample;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Controller {
    @FXML
    TextArea textFelt2;
    @FXML
    TextField search;
    @FXML
    ImageView imageView;

    public void Pasta() {
        textFelt2.clear();
        textFelt2.appendText("Pasta koge 10min.\n");
        System.out.println("Pasta");
        Image image = new Image("PIC/pasta-naeringsindhold-og-er-pasta-sundt.jpg");
        imageView.setImage(image);
    }
    public void ris() {
        textFelt2.clear();
        textFelt2.appendText("ris koge 20min.\n");
        System.out.println("ris");
        Image image1 = new Image("PIC/587caf3c0c79d1dde5038ee143882b61.jpg");
        imageView.setImage(image1);
    }
    public void searchFilde(){
        String valg = search.getText();
       if(valg.equals("Pasta")){
           Pasta();
       }
       else if(valg.equals("Pizza")){
          ris();
        }
    //   else ();
    }
}
