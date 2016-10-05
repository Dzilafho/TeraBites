/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication89;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.chart.*;
import javafx.scene.Group;
/**
 *
 * @author Tom
 * link to tutorial: http://docs.oracle.com/javafx/2/charts/jfxpub-charts.htm
 */
public class JavaApplication89 extends Application {

    //All values to be calculated or retreived from the database
    //the we determine which level they belong frome the calculation
    @Override public void start(Stage stage) {
        Scene scene = new Scene(new Group());
        stage.setTitle("Results");
        stage.setWidth(500);
        stage.setHeight(500);
 
        ObservableList<PieChart.Data> pieChartData =
                FXCollections.observableArrayList(
                new PieChart.Data("level 1", 50),
                new PieChart.Data("level 2", 40),
                new PieChart.Data("level 3", 10));
        final PieChart chart = new PieChart(pieChartData);
        chart.setTitle("Username here: Junior developer");

        ((Group) scene.getRoot()).getChildren().add(chart);
        stage.setScene(scene);
        stage.show();
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        launch(args);
    }
    
}
