package sample;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Rectangle2D;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.stage.Screen;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        Rectangle2D screenBounds = Screen.getPrimary().getBounds();
        primaryStage.setTitle("TicketDyali");
        Scene scene = new Scene(root, 130, 120);
        scene.setFill(Color.TRANSPARENT);
        primaryStage.setScene(scene);
        primaryStage.setX(screenBounds.getMaxX() - 130);
        primaryStage.setY(screenBounds.getMaxY() - 160);
        primaryStage.setAlwaysOnTop(true);
        //primaryStage.initStyle(StageStyle.UNDECORATED);
        primaryStage.initStyle(StageStyle.TRANSPARENT);
        primaryStage.setOpacity(0.5);
        primaryStage.show();

    }


    public static void main(String[] args) {
        launch(args);
    }
}
