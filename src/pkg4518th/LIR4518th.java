/*
 To change this license header, choose License Headers in Project Properties.
 To change this template file, choose Tools | Templates
 and open the template in the editor.
 */
package pkg4518th;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Paint;
import javafx.scene.text.Font;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 FXML Controller class

 @author Mark Ferguson
 */
public class LIR4518th implements Initializable {

  private String CRLF = "\n";
  @FXML
  private Label A;
  @FXML
  private Label B;
  @FXML
  private Label C;
  @FXML
  private Label D;
  @FXML
  private Label E;
  @FXML
  private Label Lines;
  @FXML
  private TextField RANK;
  @FXML
  private CheckBox byunit;
  @FXML
  private Canvas canvas;
  @FXML
  private ComboBox<String> cbo;
  @FXML
  private TextField col;
  @FXML
  private ComboBox<String> combo1;
  @FXML
  private ComboBox<String> combo2;
  @FXML
  private ComboBox<String> combo3;
  @FXML
  private ComboBox<String> combo4;
  @FXML
  private ComboBox<String> combo5;
  @FXML
  private Pane counterpane;
  @FXML
  private TextField filename;
  @FXML
  private Button findButton;
  @FXML
  private Image img;
  @FXML
  private ImageView pic;
  @FXML
  private TextField search;
  @FXML
  private TextField sec;
  @FXML
  private TextField sub;
  @FXML
  private TextField sys;
  @FXML
  private TextArea ta;
  @FXML
  private TextArea ta1;
  @FXML
  private TextField tf;
  @FXML
  private TextField tf1;
  @FXML
  private TextField tf10;
  @FXML
  private TextField tf11;
  @FXML
  private TextField tf12;
  @FXML
  private TextField tf13;
  @FXML
  private TextField tf14;
  @FXML
  private TextField tf15;
  @FXML
  private TextField tf16;
  @FXML
  private TextField tf17;
  @FXML
  private TextField tf18;
  @FXML
  private TextField tf19;
  @FXML
  private TextField tf2;
  @FXML
  private TextField tf20;
  @FXML
  private TextField tf3;
  @FXML
  private TextField tf4;
  @FXML
  private TextField tf5;
  @FXML
  private TextField tf6;
  @FXML
  private TextField tf7;
  @FXML
  private TextField tf8;
  @FXML
  private TextField tf9;
  @FXML
  private Pane trooperpane;
  @FXML
  private ImageView view;

  /**
   Initializes the controller class.
   */
  @Override
  public void initialize(URL url, ResourceBundle rb) {
    try {
      setup();
    } catch (IOException ex) {
      Logger.getLogger(LIR4518th.class.getName()).log(Level.SEVERE, null, ex);
    }
  }

  String[][] strings;
  String[] lines;
//  String[] parts;
  String string;

  private void setup() throws FileNotFoundException, IOException {
    //<editor-fold defaultstate="collapsed" desc="IFD">
    {
      String s = "";
      boolean DEBUG = true;  // true or false;
      if (DEBUG) { // true or false
        s += "//////////////////////////////////////////////" + CRLF;
        s += "pkg4518th.LIR4518th.setup()" + CRLF;
        s += "\t" + Thread.currentThread().getStackTrace()[1].getMethodName() + CRLF;
        //s += "" + " = " + "" + CRLF;
        //s += "" + " = " + "" + CRLF;
        System.out.println(s);
      }
    }
    //</editor-fold>
//    BufferedReader breader = new BufferedReader(new FileReader("C://T5/4518.txt"));
    URL url = new URL("file:" + getClass().getResource("/4518th.txt"));
    System.out.println("url" + " = \n" + url);
    BufferedReader breader = new BufferedReader(new FileReader(url.toString().substring(5)));
    String linecontent;
    String all = "";
    while ((linecontent = breader.readLine()) != null) {
      all += linecontent + CRLF;
    }
    breader.close();
    System.out.println("all" + " = " + all);
    ta.setText(all);
    String[] lines = all.split(CRLF);
    for (int i = 0; i < lines.length; i++) {
      int len = lines[i].split(",").length;
      System.out.println("len" + " = " + len);
      strings[i] = new String[len];
      for (int j = 0; j < len; j++) {
        strings[i][j] = "";//lines[i].split(",")[j];
        System.out.println("" + " = " + strings[i][j]);
      }
    }
  }

  @FXML
  private void aClick(MouseEvent event) {
  }

  @FXML
  private void bClick(MouseEvent event) {
  }

  @FXML
  private void badgeClick(MouseEvent event) {
  }

  @FXML
  private void cClick(MouseEvent event) {
  }

  @FXML
  private void canvasClick(MouseEvent event) {
    //<editor-fold defaultstate="collapsed" desc="IFD">
    {
      String s = "";
      boolean DEBUG = true;  // true or false;
      if (DEBUG) { // true or false
        s += "//////////////////////////////////////////////" + CRLF;
        s += "pkg4518th.LIR4518th.canvasClick()" + CRLF;
        s += "\t" + Thread.currentThread().getStackTrace()[1].getMethodName() + CRLF;
        //s += "" + " = " + "" + CRLF;
        //s += "" + " = " + "" + CRLF;
        System.out.println(s);
      }
    }
    //</editor-fold>
    GraphicsContext gc = canvas.getGraphicsContext2D();
    String string = "";
    Font f = new Font(10);
    gc.setFont(f);
    gc.setLineWidth(0.5);
    Paint p = Paint.valueOf("white");
    gc.setFill(p);
    gc.fillRect(0, 0, 200, 100);
    p = Paint.valueOf("red");
    gc.setFill(p);
    gc.fillRect(0, 0, 100, 100);
//    int linenum = 1;
//    gc.strokeText(tf14.getText(), 5, 10);
//    gc.strokeText(tf15.getText(), 5, 20);
//    gc.strokeText(tf16.getText(), 5, 30);
//    gc.strokeText(tf17.getText(), 5, 40);
//    gc.strokeText(tf18.getText(), 5, 50);
//    gc.strokeText(tf19.getText().replace("Lift Infantry Regiment", "L.I.R."), 5, 90);
  }

  @FXML
  private void cboAction(ActionEvent event) {
  }

  @FXML
  private void combo1Action(ActionEvent event) {
  }

  @FXML
  private void combo2Action(ActionEvent event) {
  }

  @FXML
  private void combo3Action(ActionEvent event) {
  }

  @FXML
  private void combo4Action(ActionEvent event) {
  }

  @FXML
  private void combo5Action(ActionEvent event) {
  }

  @FXML
  private void combo5Click(MouseEvent event) {
  }

  @FXML
  private void countLines(MouseEvent event) {
  }

  @FXML
  private void dClick(MouseEvent event) {
  }

  @FXML
  private void eClick(MouseEvent event) {
  }

  @FXML
  private void findAction(ActionEvent event) {
  }

  @FXML
  private void numberAction(ActionEvent event) {
  }

  @FXML
  private void numberClick(MouseEvent event) {
  }

  @FXML
  private void picClick(MouseEvent event) {
  }

  @FXML
  private void rankAction(ActionEvent event) {
  }

  @FXML
  private void rankClick(MouseEvent event) {
  }

  @FXML
  private void showAbout(MouseEvent event) {
    JFrame jf = new JFrame();
    String txt = "ABOUT\n"
      + "\n"
      + "Programmed by Mark Ferguson	(maggot.iiss@sky.com)\n"
      + "\n"
      + "https://github.com/MaggotIISS\n"
      + "\n"
      + "The Traveller game in all forms is owned by Far Future Enterprises. \n"
      + "Copyright 1977 - 20016 Far Future Enterprises. \n"
      + "\n"
      + "Traveller is a registered trademark of Far Future Enterprises. \n"
      + "Far Future permits web sites and fanzines for this game, provided \n"
      + "it contains this notice, that Far Future is notified, and subject \n"
      + "to a withdrawal of permission on 90 days notice. \n"
      + "\n"
      + "The contents of this site are for personal, non-commercial use only. \n"
      + "\n"
      + "Any use of Far Future Enterprises's copyrighted material or \n"
      + "trademarks anywhere on this web site and its files should not \n"
      + "be viewed as a challenge to those copyrights or trademarks. \n"
      + "In addition, any program/articles/file on this site cannot be \n"
      + "republished or distributed without the consent of \n"
      + "the author who contributed it.\n"
      + "\n"
      + "\n"
      + "\n"
      + "\n"
      + "\n";
    JTextArea jta = new JTextArea(txt, 50, 50);
    jta.setEditable(false);
    JScrollPane jsp = new JScrollPane(jta);
    jf.getContentPane().add(jsp);
    jf.setSize(500, 500);
    jf.setLocation(300, 300);
    jf.setVisible(true);
  }

  @FXML
  private void taClick(MouseEvent event) {
  }

  @FXML
  private void unitCheck(ActionEvent event) {
  }

}
