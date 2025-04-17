package cs112.lab09.controllers;

import cs112.lab09.Constants;
import cs112.lab09.RedSummer;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

import static cs112.lab09.Constants.*;

public class MapController {


    @FXML
    void handleCity(ActionEvent actionEvent) throws IOException {
        Stage stage = new Stage();
        stage.initModality(Modality.APPLICATION_MODAL);

        FXMLLoader fxmlLoader = new FXMLLoader(RedSummer.class.getResource(CITY_VIEW_RESOURCE));

        Scene scene = new Scene(fxmlLoader.load());
        stage.setScene(scene);
        stage.setTitle(CITY_VIEW_TITLE);

        CityController cityController = (CityController) fxmlLoader.getController();

        Button callerButton = (Button)actionEvent.getSource();
        if (callerButton.getId().equals("sanfrancisco")) {
            // open SF
            cityController.initData(Event.SAN_FRANCISCO);
        }
        if (callerButton.getId().equals("bisbee")) {
            // open bisbee
            cityController.initData(Event.BISBEE);
        }

        stage.show();
    }
}
