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
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

/**

 @author Mark Ferguson
 */
public class LIR4518th implements Initializable {

  @FXML
  private Label A;
  @FXML
  private Label B;
  @FXML
  private Label C;
  @FXML
  private Label D;
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
  private ImageView pic;
  @FXML
  private TextField search;
  @FXML
  private TextField tf;
  @FXML
  private TextField RANK;
  @FXML
  private TextArea ta;
  private Label rank;

  @FXML
  private void aClick(MouseEvent event) {
    //<editor-fold defaultstate="collapsed" desc="IFD">
    {
      String s = "";
      boolean DEBUG = true;  // true or false;
      if (DEBUG) { // true or false
        s += "//////////////////////////////////////////////" + CRLF;
        s += "pkg4518th.LIR4518th.aClick()" + CRLF;
        s += "\t" + Thread.currentThread().getStackTrace()[1].getMethodName() + CRLF;
        s += "event" + " = " + event + CRLF;
        //s += "" + " = " + "" + CRLF;
        System.out.println(s);
      }
    }
    //</editor-fold>
  }

  @FXML
  private void bClick(MouseEvent event) {
    //<editor-fold defaultstate="collapsed" desc="IFD">
    {
      String s = "";
      boolean DEBUG = true;  // true or false;
      if (DEBUG) { // true or false
        s += "//////////////////////////////////////////////" + CRLF;
        s += "pkg4518th.LIR4518th.aClick()" + CRLF;
        s += "\t" + Thread.currentThread().getStackTrace()[1].getMethodName() + CRLF;
        s += "event" + " = " + event + CRLF;
        //s += "" + " = " + "" + CRLF;
        System.out.println(s);
      }
    }
    //</editor-fold>
  }

  @FXML
  private void cClick(MouseEvent event) {
    //<editor-fold defaultstate="collapsed" desc="IFD">
    {
      String s = "";
      boolean DEBUG = true;  // true or false;
      if (DEBUG) { // true or false
        s += "//////////////////////////////////////////////" + CRLF;
        s += "pkg4518th.LIR4518th.aClick()" + CRLF;
        s += "\t" + Thread.currentThread().getStackTrace()[1].getMethodName() + CRLF;
        s += "event" + " = " + event + CRLF;
        //s += "" + " = " + "" + CRLF;
        System.out.println(s);
      }
    }
    //</editor-fold>
  }

  @FXML
  private void dClick(MouseEvent event) {
    //<editor-fold defaultstate="collapsed" desc="IFD">
    {
      String s = "";
      boolean DEBUG = true;  // true or false;
      if (DEBUG) { // true or false
        s += "//////////////////////////////////////////////" + CRLF;
        s += "pkg4518th.LIR4518th.aClick()" + CRLF;
        s += "\t" + Thread.currentThread().getStackTrace()[1].getMethodName() + CRLF;
        s += "event" + " = " + event + CRLF;
        //s += "" + " = " + "" + CRLF;
        System.out.println(s);
      }
    }
    //</editor-fold>
  }

  @FXML
  private void cboAction(ActionEvent event) {
    //<editor-fold defaultstate="collapsed" desc="IFD">
    {
      String s = "";
      boolean DEBUG = true;  // true or false;
      if (DEBUG) { // true or false
        s += "//////////////////////////////////////////////" + CRLF;
        s += "pkg4518th.LIR4518th.cboAction()" + CRLF;
        s += "\t" + Thread.currentThread().getStackTrace()[1].getMethodName() + CRLF;
        s += "event" + " = " + event + CRLF;
        s += "cbo.getValue()" + " = " + cbo.getValue() + CRLF;
        //s += "" + " = " + "" + CRLF;
        System.out.println(s);
      }
    }
    //</editor-fold>
    ta.setText("");
    switch (cbo.getValue()) {
      case "listMarines": {
        for (int i = 0; i < lines.length; i++) {
          ta.appendText(lines[i] + CRLF);
        }
        break;
      }
      case "search": {
        int column = Integer.parseInt(col.getText());
        for (int i = 0; i < lines.length; i++) {
          String a = strings[i][column].toLowerCase();
          String b = search.getText().toLowerCase();
          if (a.equals(b)) {
            ta.appendText(strings[i][column] + CRLF);
          }
        }
      }
      case "Col1": {
        sort(0);
        break;
      }
      case "Col2": {
        sort(1);
        break;
      }
      case "Col3": {
        sort(2);
        break;
      }
      case "Col4": {
        sort(3);
        break;
      }
      case "Col5": {
        sort(4);
        break;
      }
      default: {
        //<editor-fold defaultstate="collapsed" desc="JOP">
        {
          String s = "";
          s += "" + CRLF;
          s += "" + CRLF;
          System.out.println("" + " = " + s);
        }
        //</editor-fold>
      }
    }
  }

  @FXML
  private void combo1Action(ActionEvent event) {
    //<editor-fold defaultstate="collapsed" desc="IFD">
    {
      String s = "";
      boolean DEBUG = true;  // true or false;
      if (DEBUG) { // true or false
        s += "//////////////////////////////////////////////" + CRLF;
        s += "\t" + Thread.currentThread().getStackTrace()[1].getMethodName() + CRLF;
        s += "" + " = " + "";
        //s += "" + " = " + "";
        System.out.println(s);
      }
    }
    //</editor-fold>
  }

  @FXML
  private void combo2Action(ActionEvent event) {
    //<editor-fold defaultstate="collapsed" desc="IFD">
    {
      String s = "";
      boolean DEBUG = true;  // true or false;
      if (DEBUG) { // true or false
        s += "//////////////////////////////////////////////" + CRLF;
        s += "\t" + Thread.currentThread().getStackTrace()[1].getMethodName() + CRLF;
        s += "" + " = " + "";
        //s += "" + " = " + "";
        System.out.println(s);
      }
    }
    //</editor-fold>
  }

  @FXML
  private void combo3Action(ActionEvent event) {
    //<editor-fold defaultstate="collapsed" desc="IFD">
    {
      String s = "";
      boolean DEBUG = true;  // true or false;
      if (DEBUG) { // true or false
        s += "//////////////////////////////////////////////" + CRLF;
        s += "\t" + Thread.currentThread().getStackTrace()[1].getMethodName() + CRLF;
        s += "" + " = " + "";
        //s += "" + " = " + "";
        System.out.println(s);
      }
    }
    //</editor-fold>
  }

  @FXML
  private void combo4Action(ActionEvent event) {
    //<editor-fold defaultstate="collapsed" desc="IFD">
    {
      String s = "";
      boolean DEBUG = true;  // true or false;
      if (DEBUG) { // true or false
        s += "//////////////////////////////////////////////" + CRLF;
        s += "\t" + Thread.currentThread().getStackTrace()[1].getMethodName() + CRLF;
        s += "" + " = " + "";
        //s += "" + " = " + "";
        System.out.println(s);
      }
    }
    //</editor-fold>
  }

  @FXML
  private void combo5Action(ActionEvent event) {
    //<editor-fold defaultstate="collapsed" desc="IFD">
    {
      String s = "";
      boolean DEBUG = true;  // true or false;
      if (DEBUG) { // true or false
        s += "//////////////////////////////////////////////" + CRLF;
        s += "\t" + Thread.currentThread().getStackTrace()[1].getMethodName() + CRLF;
        s += "" + " = " + "";
        //s += "" + " = " + "";
        System.out.println(s);
      }
    }
    //</editor-fold>
  }

  @FXML
  private void findAction(ActionEvent event) {
    //<editor-fold defaultstate="collapsed" desc="IFD">
    {
      String s = "";
      boolean DEBUG = true;  // true or false;
      if (DEBUG) { // true or false
        s += "//////////////////////////////////////////////" + CRLF;
        s += "\t" + Thread.currentThread().getStackTrace()[1].getMethodName() + CRLF;
        s += "" + " = " + "";
        //s += "" + " = " + "";
        System.out.println(s);
      }
    }
    //</editor-fold>
    int num;
    try {
      num = Integer.parseInt(tf.getText());
    } catch (Exception e) {
      num = 0;
    }
    findNumber(me);
  }

  @FXML
  private void rankClick(MouseEvent event) {
    //<editor-fold defaultstate="collapsed" desc="IFD">
    {
      String s = "";
      boolean DEBUG = true;  // true or false;
      if (DEBUG) { // true or false
        s += "//////////////////////////////////////////////" + CRLF;
        s += "\t" + Thread.currentThread().getStackTrace()[1].getMethodName() + CRLF;
        s += "" + " = " + "";
        //s += "" + " = " + "";
        System.out.println(s);
      }
    }
    //</editor-fold>
  }

  private void findNumber(MouseEvent event) {
    //<editor-fold defaultstate="collapsed" desc="IFD">
    {
      String s = "";
      boolean DEBUG = true;  // true or false;
      if (DEBUG) { // true or false
        s += "//////////////////////////////////////////////" + CRLF;
        s += "\t" + Thread.currentThread().getStackTrace()[1].getMethodName() + CRLF;
        s += "" + " = " + "";
        //s += "" + " = " + "";
        System.out.println(s);
      }
    }
    //</editor-fold>
    int num = 0;
    try {
      num = Integer.parseInt(tf.getText());
    } catch (Exception e) {
      showAll();
      return;
    }
    if (num > 0 & num < (lines.length + 1)) {
      showMarine(lines[num - 1]);
    }
  }

  @Override
  public void initialize(URL url, ResourceBundle rb) {

    combo4.getItems().addAll(
      "First Battalion (Lift Infantry)",
      "Second Battalion (Lift Infantry)",
      "Third Squadron (Lift Cavalry)",
      "Fourth Battalion (Lift Infantry)",
      "Fifth Squadron (Lift Cavalry)",
      "Sixth Battalion (Jump Troops)",
      "Seventh Reserve Battalion (Vargr Infantry)",
      "Eighth Reserve Battalion PKF",
      "Ninth Reserve Battalion (Amindii Lift Infantry)",
      "Tenth Reserve Battalion (Jump Troops)",
      "Eleventh Reserve Battalion (Anti-Psionic)",
      "Regimental Artillery Battery",
      "Regimental Fighter Squadron",
      "Regimental Fighter Wing Headquarters",
      "Regimental Headquarters",
      "Regimental Medical Section",
      "Regimental Ortillery Squadron"
    );
    combo5.getItems().addAll(
      "4518th Lift Infantry Regiment"
    );
    BufferedReader br;
    try {
      br = new BufferedReader(new FileReader("/" + T5 + FS + "4518th.csv"));
      String line;
      ta.setText("");
      int num = 0;
      while ((line = br.readLine()) != null) {
        ta.appendText(line + CRLF);
      }
      br.close();
      lines = ta.getText().split(CRLF);
      lines.toString().replace("\"", "");
//      strings = new String[lines.length][5];
//      strings[num] = line.split(",");
    } catch (FileNotFoundException ex) {
      Logger.getLogger(LIR4518th.class.getName()).log(Level.SEVERE, null, ex);
    } catch (IOException ex) {
      Logger.getLogger(LIR4518th.class.getName()).log(Level.SEVERE, null, ex);
    }
    tf.setText("279");
//    lts = new Button[]{lt1, lt2, lt3, lt4, lt5};
//    eqs = new Button[]{eq1, eq2, eq3, eq4, eq5};
//    gts = new Button[]{gt1, gt2, gt3, gt4, gt5};
    combos = new ComboBox[]{combo1, combo2, combo3, combo4, combo5};
    cbo.getItems().addAll("listMarines", "search", "Col1", "Col2", "Col3", "Col4", "Col5");
  }

  @FXML
  private void numberAction(ActionEvent event) {
    //<editor-fold defaultstate="collapsed" desc="IFD">
    {
      String s = "";
      boolean DEBUG = true;  // true or false;
      if (DEBUG) { // true or false
        s += "//////////////////////////////////////////////" + CRLF;
        s += "\t" + Thread.currentThread().getStackTrace()[1].getMethodName() + CRLF;
        s += "" + " = " + "";
        //s += "" + " = " + "";
        System.out.println(s);
      }
    }
    //</editor-fold>
    findNumber(me);
  }

  @FXML
  private void numberClick(MouseEvent event) {
    //<editor-fold defaultstate="collapsed" desc="IFD">
    {
      String s = "";
      boolean DEBUG = true;  // true or false;
      if (DEBUG) { // true or false
        s += "//////////////////////////////////////////////" + CRLF;
        s += "\t" + Thread.currentThread().getStackTrace()[1].getMethodName() + CRLF;
        s += "" + " = " + "";
        //s += "" + " = " + "";
        System.out.println(s);
      }
    }
    //</editor-fold>
    findNumber(me);
  }

  @FXML
  private void picClick(MouseEvent event) {
    number += 1;
    if (number > 2) {
      number = 0;
    }
    //<editor-fold defaultstate="collapsed" desc="IFD">
    {
      String s = "";
      boolean DEBUG = true;  // true or false;
      if (DEBUG) { // true or false
        s += "//////////////////////////////////////////////" + CRLF;
        s += "\t" + Thread.currentThread().getStackTrace()[1].getMethodName() + CRLF;
        s += "number" + " = " + number;
        //      s += "" + " = " + "";
        System.out.println(s);
      }
    }
    //</editor-fold>
    switch (number) {
      case 0: {
        break;
      }
      case 1: {
        break;
      }
      case 2: {
        break;
      }
      default: {
        break;
      }
    }
  }

  @FXML
  private void rankAction(ActionEvent event) {
    //<editor-fold defaultstate="collapsed" desc="IFD">
    {
      String s = "";
      boolean DEBUG = true;  // true or false;
      if (DEBUG) { // true or false
        s += "//////////////////////////////////////////////" + CRLF;
        s += "\t" + Thread.currentThread().getStackTrace()[1].getMethodName() + CRLF;
        s += "" + " = " + "";
        //s += "" + " = " + "";
        System.out.println(s);
      }
    }
    //</editor-fold>
  }

  private void titleClick(MouseEvent event) {
    //<editor-fold defaultstate="collapsed" desc="IFD">
    {
      String s = "";
      boolean DEBUG = true;  // true or false;
      if (DEBUG) { // true or false
        s += "//////////////////////////////////////////////" + CRLF;
        s += "\t" + Thread.currentThread().getStackTrace()[1].getMethodName() + CRLF;
        s += "" + " = " + "";
        //s += "" + " = " + "";
        System.out.println(s);
      }
    }
    //</editor-fold>
  }

  private String CRLF = "\n";
  private String FS = "/";
  private String T5 = "C://T5";
  private String splitter = "/////////////////////////////////////////" + CRLF;
  private String[][] strings;
  private String[] lines;
  private MouseEvent me;
  private int number = -1;
  private ComboBox<String>[] combos;

  private void columnClick(String string) {
    System.out.println(string);
  }

  private void columnsClick(ActionEvent event) {
    //<editor-fold defaultstate="collapsed" desc="IFD">
    {
      String s = "";
      boolean DEBUG = true;  // true or false;
      if (DEBUG) { // true or false
        s += "//////////////////////////////////////////////" + CRLF;
        s += "\t" + Thread.currentThread().getStackTrace()[1].getMethodName() + CRLF;
        s += "" + " = " + "";
        //s += "" + " = " + "";
        System.out.println(s);
      }
    }
    //</editor-fold>
    columnClick("Action");
  }

  private void columnsClick(MouseEvent event) {
    //<editor-fold defaultstate="collapsed" desc="IFD">
    {
      String s = "";
      boolean DEBUG = true;  // true or false;
      if (DEBUG) { // true or false
        s += "//////////////////////////////////////////////" + CRLF;
        s += "\t" + Thread.currentThread().getStackTrace()[1].getMethodName() + CRLF;
        s += "" + " = " + "";
        //s += "" + " = " + "";
        System.out.println(s);
      }
    }
    //</editor-fold>
    columnClick("Click");
  }

  private void goClick(MouseEvent event) {
    //<editor-fold defaultstate="collapsed" desc="IFD">
    {
      String s = "";
      boolean DEBUG = true;  // true or false;
      if (DEBUG) { // true or false
        s += "//////////////////////////////////////////////" + CRLF;
        s += "\t" + Thread.currentThread().getStackTrace()[1].getMethodName() + CRLF;
        s += "" + " = " + "";
        //s += "" + " = " + "";
        System.out.println(s);
      }
    }
    //</editor-fold>
    System.out.println(showMarine(279));
  }

  private void labelClick(MouseEvent event) {
    //<editor-fold defaultstate="collapsed" desc="IFD">
    {
      String s = "";
      boolean DEBUG = true;  // true or false;
      if (DEBUG) { // true or false
        s += "//////////////////////////////////////////////" + CRLF;
        s += "\t" + Thread.currentThread().getStackTrace()[1].getMethodName() + CRLF;
        s += "" + " = " + "";
        //s += "" + " = " + "";
        System.out.println(s);
      }
    }
    //</editor-fold>
  }

  private void showAll() {
    ta.setText("");
    for (int i = 0; i < lines.length; i++) {
      ta.appendText(lines[i] + CRLF);
    }
  }

  private String showMarine(String string) {
    combo1.setValue("");
    combo2.setValue("");
    combo3.setValue("");
    combo4.setValue("");
    combo5.setValue("");
    RANK.setText("");
    ta.setText("");
    String[] parts = string.split(",");
    for (int i = 0; i < parts.length; i++) {
      parts[i] = parts[i].replace("\"", "").trim();
      ta.appendText(parts[i] + CRLF);
    };
    try {
      combo1.setValue(parts[1].trim());
      combo2.setValue(parts[2].trim());
      combo3.setValue(parts[3].trim());
      if (parts[4] != combo3.getValue()) {
        combo4.setValue(parts[4]);
      } else {
        combo4.setValue("");
      }
      combo4.setValue(parts[4].trim());
      combo5.setValue(parts[5].trim());
    } catch (Exception e) {
      System.out.println("e" + " = " + e);
    }
    String s = combo1.getValue() + CRLF;
    try {
      RANK.setText(s.substring(s.lastIndexOf(" ") + 1, s.indexOf(")")));
    } catch (Exception e) {
      RANK.setText("???");
    }
    return string;
  }

  private String showMarine(int num) {
    return showMarine(lines[num - 1]);
  }

  private void findRank(MouseEvent event) {
    //<editor-fold defaultstate="collapsed" desc="IFD">
    {
      String s = "";
      boolean DEBUG = true;  // true or false;
      if (DEBUG) { // true or false
        s += "//////////////////////////////////////////////" + CRLF;
        s += "\t" + Thread.currentThread().getStackTrace()[1].getMethodName() + CRLF;
        s += "" + " = " + "";
        //s += "" + " = " + "";
        System.out.println(s);
      }
    }
    //</editor-fold>
    findRanks(rank.getText());
  }

  private void findRank(ActionEvent event) {
    //<editor-fold defaultstate="collapsed" desc="IFD">
    {
      String s = "";
      boolean DEBUG = true;  // true or false;
      if (DEBUG) { // true or false
        s += "//////////////////////////////////////////////" + CRLF;
        s += "pkg4518th.LIR4518th.showID()" + CRLF;
        s += "\t" + Thread.currentThread().getStackTrace()[1].getMethodName() + CRLF;
        s += "" + " = " + "";
        //s += "" + " = " + "";
        System.out.println(s);
      }
    }
    //</editor-fold>
  }

  private void findRanks(String text) {
    //<editor-fold defaultstate="collapsed" desc="IFD">
    {
      String s = "";
      boolean DEBUG = true;  // true or false;
      if (DEBUG) { // true or false
        s += "//////////////////////////////////////////////" + CRLF;
        s += "pkg4518th.LIR4518th.showID()" + CRLF;
        s += "\t" + Thread.currentThread().getStackTrace()[1].getMethodName() + CRLF;
        s += "" + " = " + "";
        //s += "" + " = " + "";
        System.out.println(s);
      }
    }
    //</editor-fold>
    String[] parts = {"", "", "", "", ""};
    ta.setText("");
    for (int k = 0; k < 2; k++) {
      ta.setText("");
      switch (k) {
        case 0: {
          for (int j = 6; j > 1; j--) {
            for (int i = 0; i < lines.length; i++) {
              parts = lines[i].split(",");
              if ((lines[i].contains("S" + j))) {
                ta.appendText(lines[i].substring(1, lines[i].indexOf(")") + 1) + CRLF);
              }
            }
          }
          break;
        }
        case 1: {
          for (int j = 6; j > 1; j--) {
            for (int i = 0; i < lines.length; i++) {
              parts = lines[i].split(",");
              if ((lines[i].contains("O" + j))) {
                ta.appendText(lines[i].substring(1, lines[i].indexOf(")") + 1) + CRLF);
              }
            }
          }
          break;
        }
        default: {
          System.out.println("default");
        }
      }
    }
  }

  private void listMarines(int[] nums) {
    for (int i = 0; i < nums.length; i++) {
      ta.appendText(lines[nums[i] - 1] + CRLF);
    }
  }

  private void sort(int i) {
    //<editor-fold defaultstate="collapsed" desc="IFD">
    {
      String s = "";
      boolean DEBUG = true;  // true or false;
      if (DEBUG) { // true or false
        s += "//////////////////////////////////////////////" + CRLF;
        s += "\t" + Thread.currentThread().getStackTrace()[1].getMethodName() + CRLF;
//        s += "lines.length" + " = " + lines.length + CRLF;
        //s += "" + " = " + "" + CRLF;
        System.out.println(s);
      }
    }
    //</editor-fold>
    ta.setText("");
    for (int j = 0; j < lines.length; j++) {
      ta.appendText(strings[j][i] + CRLF);
    }
  }

}
