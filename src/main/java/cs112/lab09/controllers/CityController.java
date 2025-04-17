package cs112.lab09.controllers;

import cs112.lab09.Constants;
import cs112.lab09.RedSummer;
import cs112.lab09.models.HistoricalEvent;
import cs112.lab09.models.RevisedHistoricalEvent;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class CityController {
    @FXML
    ImageView cityImageView;

    @FXML
    Label cityLabel;

    @FXML
    Label dateLabel;

    @FXML
    Label descriptionLabel;

    @FXML
    Label revisedLabel;

    @FXML
    Hyperlink sourceLink;

    public void initData(Constants.Event event) {
        RevisedHistoricalEvent revisedEvent = new RevisedHistoricalEvent(Constants.HISTORICAL_DATA[event.ordinal()]);
        cityImageView.setImage(revisedEvent.getImage());
        cityLabel.setText(revisedEvent.getLocation());
        dateLabel.setText(revisedEvent.getEventDay().toString());
        descriptionLabel.setText(revisedEvent.getDescription());
        revisedLabel.setText(revisedEvent.getRevisedDescription());
        sourceLink.setText(revisedEvent.getCitation());
        sourceLink.setOnAction(e -> {
            // todo: open a web browser with that text
        });
    }

    @FXML
    void handleClose() {
        Stage stage = (Stage)cityImageView.getScene().getWindow();
        stage.close();
    }
}
