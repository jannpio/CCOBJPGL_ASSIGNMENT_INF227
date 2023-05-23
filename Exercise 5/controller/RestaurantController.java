package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.image.ImageView;
import model.*;

public class RestaurantController {

    @FXML
    ImageView DomsImg, PizzImg, GreenwImg, ShakeysImg, YellowCImg;

    @FXML
    Button DomsBtn, PizzaBtn, GwichBtn, ShakeysBtn, YellowCBtn;

    Dominos dominos = new Dominos();
    Greenwich greenwich = new Greenwich();
    PizzaHut pizzaHut = new PizzaHut();
    Shakeys shakeys = new Shakeys();
    YellowCab yellowCab = new YellowCab();

    public void initialize() {

        dominos.setRecommendation("Domino’s Cheeseburger Pizza");
        dominos.setRating("4 out of 5 stars");

        greenwich.setRecommendation("Cajun Shrimp Overload Pizza");
        greenwich.setRating("5 out of 5 stars");

        pizzaHut.setRecommendation("Mozzarella Stuffed Crust Pizza");
        pizzaHut.setRating("4 out of 5 stars");

        shakeys.setRecommendation("Truffle Four Cheese Pizza");
        shakeys.setRating("4 out of 5 stars");

        yellowCab.setRecommendation("Barbeque Chicken Pizza");
        yellowCab.setRating("5 out of 5 stars");

    }

    public void showInfo(ActionEvent event) {

        Button sourceButton = (Button) event.getSource();
        Alert alert = new Alert(AlertType.INFORMATION);

        if (sourceButton.equals(DomsBtn)) {
            alert.setContentText("Best Seller: " + dominos.getRecommendation() + "\nRatings: " + dominos.getRating());
        }

        if (sourceButton.equals(GwichBtn)) {
            alert.setContentText("Best Seller: " + greenwich.getRecommendation() + "\nRatings: " + greenwich.getRating());
        }

        if (sourceButton.equals(PizzaBtn)) {
            alert.setContentText("Best Seller: " + pizzaHut.getRecommendation() + "\nRatings: " + pizzaHut.getRating());
        }

        if (sourceButton.equals(ShakeysBtn)) {
            alert.setContentText("Best Seller: " + shakeys.getRecommendation() + "\nRatings: " + shakeys.getRating());
        }

        if (sourceButton.equals(YellowCBtn)) {
            alert.setContentText("Best Seller: " + yellowCab.getRecommendation() + "\nRatings: " + yellowCab.getRating());
        }

        alert.showAndWait();

    }
}
