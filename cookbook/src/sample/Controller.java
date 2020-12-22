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
        textFelt2.appendText("Opskrift:\n" +
                "Pandekagedej:\n" +
                "Æg og mel piskes sammen. Heri piskes det varme smeltede smør, spæd med mælk og smages til med salt, sukker og vanille.\n" +
                "\n" +
                "Bag pandekagerne lysebrune i smør på panden. Der bliver 8-12 pandekager alt efter pandens størrelse. 12 stk. med pande på 19 cm. i diameter.\n" +
                "\n" +
                "Server pandekagerne med, sukker og syltetøj, blød vanilleis eller flødeskum.\n" +
                "\n" +
                "Tips:\n" +
                "\n" +
                "Det kan være en fordel at have en pande som kun bruges til pandekager, for at undgå de hænger fast på panden.\n" +
                "Da du ikke i så høj grad har fastbrændte rester eller slidt pande efter høj varme.\n");
        System.out.println("Pandekager");
        Image image1 = new Image("PIC/4_880.jpg");
        imageView.setImage(image1);
    }
    public void searchFilde(){
        String valg = search.getText();
       if(valg.equals("Pasta")){
           Pasta();
       }
       else if(valg.equals("Pandekager")){
          ris();
        }
    //   else ();
    }
    public void gemData() {
        textFelt2.appendText("Data blev Gemt!\n");
        try {
            saveFile();
        } catch (IOException e) {
            createFile();
        }

    }

    public void createFile() {

        try {
            File myObj = new File("filename.txt");
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public void saveFile() throws IOException {
        Path fileName = Path.of("filename.txt");
        String content = textFelt2.getText();
        Files.writeString(fileName, content);

        String actual = Files.readString(fileName);
        System.out.println(actual);
    }
}
