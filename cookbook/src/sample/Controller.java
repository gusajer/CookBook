package sample;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.File;
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
        textFelt2.appendText("Ingredienser\n" +
                "\n" +
                "    300 g Tipo 00 hvedemel, eller durumhvedemel\n" +
                "    3 stk æg (M/L)\n" +
                "    1 tsk fint salt\n" +
                "Fremgangsmåde\n" +
                "Sådan laves pastadejen\n" +
                "\n" +
                "    Jeg ælter altid min i hånden, da jeg synes det giver en god fornemmelse\n" +
                "    for hvordan dejen bliver; struktur og smidighed \n" +
                "    På bordet hældes melet ud og i midten laves en fordybning. Heri skal æggene ligge.\n" +
                "    Slå æggene ud i fordybningen og drys med lidt salt (se billeder længere nede).\n" +
                "    Pisk æggene sammen i midten og pisk lidt efter lidt melet ind i dejen.\n" +
                "    Ælt med hånden dejen, til den bliver fast og elastisk.\n" +
                "    Alt mel skal æltes godt ind i dejen. Dette step kan godt tage lidt tid,\n" +
                "    men hold ud – det er dét værd!\n" +
                "    Når dejen er blevet glat og ensformig lægges den i en skål med et fugtigt vistestykke over,\n" +
                "    i 45 minutter.\n" +
                "    Klar til hjemmelavet pasta!\n" +
                "    Du kan lave pasta på maskine eller i hånden med kagerulle.\n" +
                "    Jeg laver for det meste på vores pastamaskine, som ruller dejen helt tynd og fin.");
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
    //her er min måde at lave en gem løsning
    public void gemData() {
        try {
            saveFile();
        } catch (IOException e) {
            createFile();
        }
        textFelt2.appendText("Data blev Gemt!\n");
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

 // udskriver arrayet i TextArea
    public void array(){
        String[] arrayS = {"Pasta\n", "PandeKager\n"};
        for (int i = 0; i < 2; i++) {
            System.out.println(arrayS[i]);
            textFelt2.appendText(arrayS[i]);
        }



    }

}
