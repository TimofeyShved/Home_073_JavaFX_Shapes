package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.stage.Stage;


public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        //Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        HBox root = new HBox();
        VBox vBox =new VBox();
        VBox vBox2 =new VBox();
        VBox vBox3 =new VBox();
        root.getChildren().addAll(vBox, vBox3, vBox2);

        //------------------------------------------------------------------------------------------
        Line line1 = new Line(0,0,100,10);
        line1.setStroke(Color.BLACK);
        Line line2 = new Line(0,0,100,10);
        line2.setStroke(Color.BLUE);
        Line line3 = new Line(0,0,100,10);
        line3.setStroke(Color.DARKGRAY);
        Line line4 = new Line(0,0,100,10);
        line4.setStroke(Color.BLACK);
        Line line5 = new Line(0,0,100,10);
        line5.setStroke(Color.BLUE);
        Line line6 = new Line(0,10,100,0);
        line6.setStroke(Color.DARKGRAY);

        //------------------------------------------------------------------------------------------
        Rectangle rectangle1 = new Rectangle(50,50, Color.GREEN);

        Rectangle rectangle2 = new Rectangle(50,50, Color.YELLOW);
        rectangle2.setArcWidth(20.0);
        rectangle2.setArcHeight(40.0);

        //------------------------------------------------------------------------------------------
        Circle circle = new Circle(20);
        circle.setCenterX(300.0f);
        circle.setCenterY(135.0f);
        circle.setRadius(50);

        Ellipse ellipse = new Ellipse(50,10);
        ellipse.setFill(Color.GOLD);

        //------------------------------------------------------------------------------------------
        Polygon polygon = new Polygon();
        polygon.getPoints().addAll(new Double[]{
                20.0, 10.0,
                50.0, 10.0,
                65.0, 25.0,
                50.0, 50.0,
                20.0, 50.0,
                15.0, 25.0,
        });

        Polyline polyline = new Polyline();
        polyline.getPoints().addAll(new Double[]{
                20.0, 25.0,
                40.0, 25.0,
                45.0, 75.0,
                40.0, 100.0,
                20.0, 100.0,
                15.0, 75.0,
        });

        //------------------------------------------------------------------------------------------
        CubicCurve cubicCurve = new CubicCurve();
        cubicCurve.setStartX(10.0f);
        cubicCurve.setStartY(25.0f);
        cubicCurve.setControlX1(40.0f);
        cubicCurve.setControlY1(50.0f);
        cubicCurve.setControlX2(175.0f);
        cubicCurve.setControlY2(55.0f);
        cubicCurve.setEndX(50.0f);
        cubicCurve.setEndY(25.0f);

        //------------------------------------------------------------------------------------------
        QuadCurve quadCurve = new QuadCurve();
        quadCurve.setStartX(100.0);
        quadCurve.setStartY(220.0f);
        quadCurve.setEndX(500.0f);
        quadCurve.setEndY(220.0f);
        quadCurve.setControlX(250.0f);
        quadCurve.setControlY(0.0f);

        //------------------------------------------------------------------------------------------
        Circle circle2 = new Circle(20.0, 20.0, 50.0);

        //------------------------------------------------------------------------------------------
        Arc arc = new Arc();

        arc.setCenterX(300.0f);
        arc.setCenterY(150.0f);
        arc.setRadiusX(90.0f);
        arc.setRadiusY(90.0f);
        arc.setStartAngle(40.0f);
        arc.setLength(239.0f);

        arc.setType(ArcType.ROUND); // closed / open / ROUND

        //------------------------------------------------------------------------------------------
        vBox.getChildren().addAll(line1);
        vBox.getChildren().addAll(new Label("rectangle"));
        vBox.getChildren().addAll(rectangle1);
        vBox.getChildren().addAll(line2);
        vBox.getChildren().addAll(rectangle2);
        vBox.getChildren().addAll(line3);
        vBox.getChildren().addAll(new Label("circle"));
        vBox.getChildren().addAll(circle);
        vBox.getChildren().addAll(line4);
        vBox.getChildren().addAll(new Label("ellipse"));
        vBox.getChildren().addAll(ellipse);
        vBox.getChildren().addAll(line5);
        vBox.getChildren().addAll(new Label("polygon"));
        vBox.getChildren().addAll(polygon);
        vBox3.getChildren().addAll(line6);
        vBox3.getChildren().addAll(new Label("polyline"));
        vBox3.getChildren().addAll(polyline);
        vBox2.getChildren().addAll(new Label("cubicCurve"));
        vBox2.getChildren().addAll(cubicCurve);
        vBox2.getChildren().addAll(new Label("quadCurve"));
        vBox2.getChildren().addAll(quadCurve);
        vBox2.getChildren().addAll(new Label("circle2"));
        vBox2.getChildren().addAll(circle2);
        vBox2.getChildren().addAll(new Label("arc"));
        vBox2.getChildren().addAll(arc);


        //------------------------------------------------------------------------------------------
        primaryStage.setTitle("Все фигуры!");
        primaryStage.setScene(new Scene(root, 800, 605));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
