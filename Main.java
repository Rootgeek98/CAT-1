
/**
 * Pre-Online Course Registration
 * @author Bill Glinton
 * @version 1.0
 */

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application {

    // Show an Information Alert without Header Text
    private void showAlertWithoutHeaderText() {
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("Notification");

        // Header Text: null
        alert.setHeaderText(null);
        alert.setContentText("Thank you for registering for Pre-Online Course Registration Application");

        alert.showAndWait();
    }

    @Override
    public void start(Stage stage) throws Exception {
        VBox root = new VBox();
        root.setPadding(new Insets(10));
        root.setSpacing(10);

        // Add a title to the stage
        stage.setTitle("Pre-Online Course Registration");

        // Add an icon to the stage
        stage.getIcons().add(new Image("file:logo.png"));

        // Add a Grid Pane
        GridPane gridPane = new GridPane();

        // Set the size of the Pane
        gridPane.setMinHeight(1366);
        gridPane.setMinHeight(768);

        // Add Styling to the Pane
        gridPane.setStyle("-fx-background-color: orange; -fx-background-image: url('logo.png'); -fx-background-repeat: no-repeat; -fx-background-position: 10px 10px; ");

        // Add Padding setting for the Pane
        gridPane.setPadding(new Insets(10, 10, 10, 10));

        // Add vertical gaps
        gridPane.setVgap(10);

        // Add horizontal gaps
        gridPane.setVgap(10);

        // Add grid alignment setting
        gridPane.setAlignment(Pos.CENTER);

        // Signup text
        Text label0 = new Text("Sign up");
        gridPane.add(label0, 0, 0);
        label0.setStyle("-fx-font-size: 60px; -fx-font-family: 'Arial Black'; -fx-fill: #818181; -fx-effect: innershadow( three-pass-box , rgba(0,0,0,0.7) , 6, 0.0 , 0 , 2 );");

        // FirstName
        Text label1 = new Text("Firstname:");
        gridPane.add(label1, 0, 1);
        label1.setStyle("-fx-font: normal bold 24px 'Arial Black' ");
        TextField textField1 = new TextField();
        gridPane.add(textField1, 1, 1);
        textField1.setMinSize(300, 40);
        textField1.setStyle("-fx-font: normal bold 18px 'Arial Black' ");

        // LastName
        Text label2 = new Text("Lastname:");
        gridPane.add(label2, 0, 2);
        label2.setStyle("-fx-font: normal bold 24px 'Arial Black' ");
        TextField textField2 = new TextField();
        gridPane.add(textField2, 1, 2);
        textField2.setMinSize(300, 40);
        textField2.setStyle("-fx-font: normal bold 18px 'Arial Black' ");

        // School ID
        Text label3 = new Text("School ID:");
        gridPane.add(label3, 0, 3);
        label3.setStyle("-fx-font: normal bold 24px 'Arial Black' ");
        TextField textField3 = new TextField();
        gridPane.add(textField3, 1, 3);
        textField3.setMinSize(300, 40);
        textField3.setStyle("-fx-font: normal bold 18px 'Arial Black' ");

        // Date Of Birth
        Text label4 = new Text("Date of Birth:");
        gridPane.add(label4, 0, 4);
        label4.setStyle("-fx-font: normal bold 24px 'Arial Black' ");
        DatePicker datePicker = new DatePicker();
        gridPane.add(datePicker, 1, 4);
        datePicker.setMinSize(300, 40);
        datePicker.setStyle("-fx-font: normal bold 18px 'Arial Black' ");

        // PhoneNumber
        Text label5 = new Text("Phone:");
        gridPane.add(label5, 0, 5);
        label5.setStyle("-fx-font: normal bold 24px 'Arial Black' ");
        TextField textField4 = new TextField();
        gridPane.add(textField4, 1, 5);
        textField4.setMinSize(300, 40);
        textField4.setStyle("-fx-font: normal bold 18px 'Arial Black' ");

        // Email
        Text label6 = new Text("Email");
        gridPane.add(label6, 0, 6);
        label6.setStyle("-fx-font: normal bold 24px 'Arial Black' ");
        TextField textField5 = new TextField();
        gridPane.add(textField5, 1, 6);
        textField5.setMinSize(300, 40);
        textField5.setStyle("-fx-font: normal bold 18px 'Arial Black' ");

        // Password
        Text label7 = new Text("Password:");
        gridPane.add(label7, 0, 7);
        label7.setStyle("-fx-font: normal bold 24px 'Arial Black' ");
        PasswordField passwordField1 = new PasswordField();
        gridPane.add(passwordField1, 1, 7);
        passwordField1.setMinSize(300, 40);
        passwordField1.setStyle("-fx-font: normal bold 18px 'Arial Black' ");

        // Confirm Password
        Text label8 = new Text("Confirm Password:");
        gridPane.add(label8, 0, 8);
        label8.setStyle("-fx-font: normal bold 24px 'Arial Black' ");
        PasswordField passwordField2 = new PasswordField();
        gridPane.add(passwordField2, 1, 8);
        passwordField2.setMinSize(300, 40);
        passwordField2.setStyle("-fx-font: normal bold 18px 'Arial Black' ");

        // Signup Button
        Button signButton = new Button("Sign up");
        gridPane.add(signButton, 1, 9);
        signButton.setStyle
        ("-fx-text-fill: white; -fx-background-color: green; -fx-font-size: 24px; -fx-font-family: 'Arial'; -fx-font-weight: bold; -fx-effect: dropshadow( three-pass-box , rgba(0,0,0,0.6) , 5, 0.0 , 0 , 1 );");
        signButton.setMinSize(300, 40);

        // Signup Button Event Handler
        EventHandler<MouseEvent> eventHandler = new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mEvent) {
                System.out.println("Mouse Clicked");//Notification Message
                signButton.setStyle
                ("-fx-background-color: blue; -fx-text-fill: white; -fx-font-size: 24px; -fx-font-family: 'Arial'; -fx-font-weight: bold; -fx-effect: dropshadow( three-pass-box , rgba(0,0,0,0.6) , 5, 0.0 , 0 , 1 );");
                signButton.setMinSize(300, 30);
                showAlertWithoutHeaderText();
            }
        };

        signButton.addEventHandler(MouseEvent.MOUSE_CLICKED,eventHandler);

        // Add a new scene
        Scene scene = new Scene(gridPane);

        // Set the scene
        stage.setScene(scene);

        stage.show();
    }
    
}