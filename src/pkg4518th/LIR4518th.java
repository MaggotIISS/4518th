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
import java.util.Arrays;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.Tooltip;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

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
  private Label E;
  @FXML
  private Label Lines;
  @FXML
  private CheckBox byrank;
  @FXML
  private CheckBox byunit;
  @FXML
  private ComboBox<String> cbo;
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
  private Button findButton;
  @FXML
  private Image img;
  private Image img2;
  @FXML
  private ImageView pic;
  @FXML
  private TextArea ta1;
  @FXML
  private ImageView view;
  @FXML
  private TextField col;
  @FXML
  private TextField search;
  @FXML
  private TextField tf;
  @FXML
  private TextField RANK;
  @FXML
  private TextArea ta;
  private String CRLF = "\n";
  private String FS = "/";
  private String T5 = "C://T5";
  private String splitter = "/////////////////////////////////////////" + CRLF;
  private String[][] strings;
  private String[] lines;
  private MouseEvent me;
  private Label rank;
//  private ComboBox<String>[] combos;
  private ComboBox<String> combox = new ComboBox<>();
  private String c1l = "", c2l = "", c3l = "", c4l = "", c5l = "";
  private String st = "";
  private String list = "";

  @FXML
  private void aClick(MouseEvent event) {
    if (byunit.isSelected()) {
      narrowing(1);
    } else {
      searchCol("A");
    }
  }

  @FXML
  private void bClick(MouseEvent event) {
    if (byunit.isSelected()) {
      narrowing(2);
    } else {
      searchCol("B");
    }
  }

  @FXML
  private void cClick(MouseEvent event) {
    if (byunit.isSelected()) {
      narrowing(3);
    } else {
      searchCol("C");
    }
  }

  @FXML
  private void dClick(MouseEvent event) {
    if (byunit.isSelected()) {
      narrowing(4);
    } else {
      searchCol("D");
    }
  }

  @FXML
  private void eClick(MouseEvent event) {
    if (byunit.isSelected()) {
      narrowing(5);
    } else {
      searchCol("E");
    }
  }

  private void narrowing(int i) {
    //<editor-fold defaultstate="collapsed" desc="IFD">
    {
      String s = "";
      boolean DEBUG = true;  // true or false;
      if (DEBUG) { // true or false
        s += "//////////////////////////////////////////////" + CRLF;
        s += "pkg4518th.LIR4518th.narrowing()" + CRLF;
        s += "\t" + Thread.currentThread().getStackTrace()[1].getMethodName() + CRLF;
        //s += "" + " = " + "" + CRLF;
        //s += "" + " = " + "" + CRLF;
        System.out.println(s);
      }
    }
    //</editor-fold>
    String st = "";
    ComboBox<String> combo = new ComboBox<>();
    for (int j = i - 1; j < 5; j++) {
      try {
        switch (j) {
          case 0: {
            st += combo1.getValue() + ",";
            break;
          }
          case 1: {
            st += combo2.getValue() + ",";
            break;
          }
          case 2: {
            st += combo3.getValue() + ",";
            break;
          }
          case 3: {
            st += combo4.getValue() + ",";
            break;
          }
          case 4: {
            st += combo5.getValue();
            break;
          }
          case 5: {
            st += combo5.getValue();
            break;
          }
          default: {
            //<editor-fold defaultstate="collapsed" desc="JOP">
            {
              String s = "190" + CRLF;
              s += "j = " + j + CRLF;
              s += "" + CRLF;
              JTextArea jta = new JTextArea(s, 50, 80);
              JScrollPane jsp = new JScrollPane(jta);
              JOptionPane.showMessageDialog(null, jsp);
            }
            //</editor-fold>
          }
        }
      } catch (Exception e) {
        System.out.println("202 e" + " = " + e);
      }
    }
    ta.setText("");
    ta1.setText(st);
    for (int k = 0; k < lines.length; k++) {
      if (lines[k].contains(st)) {
        ta.appendText(lines[k] + CRLF);
      }
    }
    countLines();
    search.setText(ta.getText());
    col.setText("" + i);
  }

  private void setCombo(int num, String str) {
    System.out.println("num" + " = " + num);
    //<editor-fold defaultstate="collapsed" desc="IFD">
    {
      String s = "";
      boolean DEBUG = false;  // true or false;
      if (DEBUG) { // true or false
        s += "//////////////////////////////////////////////" + CRLF;
        s += "pkg4518th.LIR4518th.search()" + CRLF;
        s += "\t" + Thread.currentThread().getStackTrace()[1].getMethodName() + CRLF;
        s += "num" + " = " + num + CRLF;
        s += "str" + " = " + str + CRLF;
        //s += "" + " = " + "" + CRLF;
        System.out.println(s);
      }
    }
    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="switch (num) {">
    switch (num) {
      case 0: {
        combox = cbo;
        break;
      }
      case 1: {
        combox = combo1;
        break;
      }
      case 2: {
        combox = combo2;
        break;
      }
      case 3: {
        combox = combo3;
        break;
      }
      case 4: {
        combox = combo4;
        break;
      }
      case 5: {
        combox = combo5;
        break;
      }
      default: {
        //<editor-fold defaultstate="collapsed" desc="JOP">
        {
          String s = "258 num = " + num + CRLF;
          try {
            s += "" + combox.getValue() + CRLF;
          } catch (Exception e) {

          }
          s += "" + CRLF;
//          JTextArea jta = new JTextArea(s, 50, 80);
//          JScrollPane jsp = new JScrollPane(jta);
//          JOptionPane.showMessageDialog(null, jsp);
          System.out.println("268 s" + " = " + s);
        }
        //</editor-fold>
        break;
      }
    }
    //</editor-fold>
    ta1.setText("");
    String text;

    for (int i = 0; i < lines.length; i++) {
      int max = lines[i].split(",").length;
      if (num < max) {
        text = strings[i][num];
        if (!ta1.getText().contains(text)) {
          if (num <= max) {
            for (int j = num; j < max; j++) {
              if (!byunit.isSelected()) {
                ta1.appendText(strings[i][j]);
                if (j < max - 1) {
                  ta1.appendText(",");
                }
              } else {
                if (j == num) {
                  ta1.appendText(strings[i][num]);
                }
              }
            }

            ta1.appendText(CRLF);
          }
        }
      }
      String value = combox.getValue();
      combox.getItems().clear();
      String[] strs = ta1.getText().split(CRLF);
      combox.getItems().addAll(strs);
      combox.getSelectionModel().select(value);

    }
  }

  private void searchCol(String text) {
    //<editor-fold defaultstate="collapsed" desc="IFD">
    {
      String s = "";
      boolean DEBUG = true;  // true or false;
      if (DEBUG) { // true or false
        s += "//////////////////////////////////////////////" + CRLF;
        s += "pkg4518th.LIR4518th.searchCol()" + CRLF;
        s += "\t" + Thread.currentThread().getStackTrace()[1].getMethodName() + CRLF;
        System.out.println(s);
      }
    }
    //</editor-fold>
    ta.setText("");
    int a = 0;
    String string = "";// search for this
    ComboBox combo = null;// place values here
    list = "";
    try {
      switch (text) {
        case "A": {
          combo = combo1;
          a = 1;
          break;
        }
        case "B": {
          combo = combo2;
          a = 2;
          break;
        }
        case "C": {
          combo = combo3;
          a = 3;
          break;
        }
        case "D": {
          combo = combo4;
          a = 4;
          break;
        }
        case "E": {
          combo = combo5;
          a = 5;
          break;
        }
        default: {
          System.out.println("" + " = ");
        }
      }
    } catch (Exception e) {
      System.out.println("323 e" + " = " + e);
    }
    string = combo.getValue().toString();
    ta1.setText("");
    for (int i = 0; i < lines.length; i++) {
      if (lines[i].contains(string)) {
        search.setText(string);
        ta.appendText(lines[i] + CRLF);
        if (!ta1.getText().contains(string)) {
          ta1.appendText(string + CRLF);
        }
      }
    }
    countLines();
    col.setText("" + a);
  }

  @FXML
  private void countLines(MouseEvent event) {
    countLines();
  }

  private int countLines() {
    int len = ta.getText().split(CRLF).length;
    Lines.setText("" + len);
    return len;
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
    tf.setText("" + cbo.getValue());
    findButton.fire();
//    ta.setText("");
//    switch (cbo.getValue()) {
//      case "listMarines": {
//        for (int i = 0; i < lines.length; i++) {
//          ta.appendText(lines[i] + CRLF);
//        }
//        break;
//      }
//      case "search": {
//        int column = Integer.parseInt(col.getText());
//        for (int i = 0; i < lines.length; i++) {
//          String a = strings[i][column].toLowerCase();
//          String b = search.getText().toLowerCase();
//          if (a.equals(b)) {
//            ta.appendText(strings[i][column] + CRLF);
//          }
//        }
//      }
//      case "Col1": {
//        sort(0);
//        break;
//      }
//      case "Col2": {
//        sort(1);
//        break;
//      }
//      case "Col3": {
//        sort(2);
//        break;
//      }
//      case "Col4": {
//        sort(3);
//        break;
//      }
//      case "Col5": {
//        sort(4);
//        break;
//      }
//      default: {
//        //<editor-fold defaultstate="collapsed" desc="JOP">
//        {
//          String s = "";
//          s += "" + CRLF;
//          s += "" + CRLF;
//          System.out.println("" + " = " + s);
//        }
//        //</editor-fold>
//      }
//    }
//    countLines();
  }

  @FXML
  private void combo1Action(ActionEvent event) {
    tryit(1);
  }

  @FXML
  private void combo2Action(ActionEvent event) {
    tryit(2);
  }

  @FXML
  private void combo3Action(ActionEvent event) {
    tryit(3);
  }

  @FXML
  private void combo4Action(ActionEvent event) {
    tryit(4);
  }

  @FXML
  private void combo5Action(ActionEvent event) {
    tryit(5);
//    showAll();
  }

  @FXML
  private void combo5Click(MouseEvent event) {
//    if (event.getClickCount() > 1) {
//    showAll();
//    }
  }

  private void tryit(int num) {
    switch (num) {
//      case 0: {
//        combox = cbo;
//        break;
//      }
      case 1: {
        combox = combo1;
        break;
      }
      case 2: {
        combox = combo2;
        break;
      }
      case 3: {
        combox = combo3;
        break;
      }
      case 4: {
        combox = combo4;
        break;
      }
      default: {
        //<editor-fold defaultstate="collapsed" desc="JOP">
        {
          String s = "";
          try {
            s += combox.getValue() + CRLF;
          } catch (Exception e) {
            System.out.println("516 e" + " = " + e);
          }
          s += "" + CRLF;
          JTextArea jta = new JTextArea(s, 50, 80);
          JScrollPane jsp = new JScrollPane(jta);
          JOptionPane.showMessageDialog(null, jsp);
        }
        //</editor-fold>
      }
    }
    ta1.setText("");
//    ta.appendText(splitter + CRLF);
    try {
      for (int i = 0; i < lines.length; i++) {
        if (strings[i][num].contains(combox.getValue())) {
          ta1.appendText(lines[i] + CRLF);
        }
      }
    } catch (Exception e) {
      System.out.println("284 e" + " = " + e);
    }
    int end = ta1.getText().split(CRLF).length;
    Arrays.sort(ta1.getText().split(CRLF), 0, end);
    countLines();
  }

  private void add2List(int num, String s) {
    switch (num) {
      case 1: {
        st = c1l;
        break;
      }
      case 2: {
        st = c2l;
        break;
      }
      case 3: {
        st = c3l;
        break;
      }
      case 4: {
        st = c4l;
        break;
      }
      case 5: {
        st = c5l;
        break;
      }
    }
    if (!list.contains(s)) {
      st += s + CRLF;
      list += "" + lines[num];
    }
//    showList(num);
    System.out.println("" + " = " + list);
    //<editor-fold defaultstate="collapsed" desc="IFD">
    {
      String st = "";
      boolean DEBUG = false;  // true or false;
      if (DEBUG) { // true or false
        st += "//////////////////////////////////////////////" + CRLF;
        st += "pkg4518th.LIR4518th.add2List()" + CRLF;
        st += "\t" + Thread.currentThread().getStackTrace()[1].getMethodName() + CRLF;
//        s += "event" + " = " + event + CRLF;
        //s += "" + " = " + "" + CRLF;
        System.out.println(st);
        System.out.println(s);
      }
    }
    //</editor-fold>
  }

  private void showList(int i) {
    //<editor-fold defaultstate="collapsed" desc="IFD">
    {
      String s = "";
      boolean DEBUG = false;  // true or false;
      if (DEBUG) { // true or false
        s += "//////////////////////////////////////////////" + CRLF;
        s += "pkg4518th.LIR4518th.showList()" + CRLF;
        s += "\t" + Thread.currentThread().getStackTrace()[1].getMethodName() + CRLF;
        //s += "" + " = " + "" + CRLF;
        System.out.println(s);
      }
    }
    //</editor-fold>
    switch (i) {
      case 0: {
        list = c1l;
        break;
      }
      case 1: {
        list = c1l;
        break;
      }
      case 2: {
        list = c1l;
        break;
      }
      case 3: {
        list = c1l;
        break;
      }
      case 4: {
        list = c1l;
        break;
      }
      case 5: {
        list = c1l;
        break;
      }
    }
    System.out.println("list" + " = " + list);
  }

  @FXML
  private void findAction(ActionEvent event) {
    //<editor-fold defaultstate="collapsed" desc="IFD">
    {
      String s = "";
      boolean DEBUG = false;  // true or false;
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
  private void rankAction(ActionEvent event) {
    //<editor-fold defaultstate="collapsed" desc="IFD">
    {
      String s = "";
      boolean DEBUG = false;  // true or false;
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
  private void rankClick(MouseEvent event) {
    //<editor-fold defaultstate="collapsed" desc="IFD">
    {
      String s = "";
      boolean DEBUG = false;  // true or false;
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

  @Override
  public void initialize(URL url, ResourceBundle rb) {
    RANK.setEditable(true);
//    System.out.println("rb.getBaseBundleName()" + " = " + rb.getBaseBundleName());
    BufferedReader br;
    try {
      br = new BufferedReader(new FileReader("/" + T5 + FS + "4518th.csv"));
      String line;
      ta.setText("");
      int num = 0;
      while ((line = br.readLine()) != null) {
        ta.appendText(line.trim() + CRLF);
      }
      br.close();
      lines = ta.getText().split(CRLF);
      lines.toString().replace("\"", "");
      strings = new String[lines.length][5];
      String[] string;
      for (int i = 0; i < lines.length; i++) {
        int j = lines[i].split(",").length;
        for (int k = 0; k < j; k++) {
          strings[i] = new String[j];
          for (int l = 0; l < j; l++) {
            strings[i][l] = lines[i].split(",")[l];
          }
        }
      }
    } catch (FileNotFoundException ex) {
      Logger.getLogger(LIR4518th.class.getName()).log(Level.SEVERE, null, ex);
    } catch (IOException ex) {
      Logger.getLogger(LIR4518th.class.getName()).log(Level.SEVERE, null, ex);
    }
    cbo.getItems().addAll("equal", "higher", "lower");
    cbo.getSelectionModel().select(null);
    tf.setText("279");
    combo4.setValue("Fifth Squadron (Lift Cavalry)");
    combo5.setValue("4518th Lift Infantry Regiment");
    countLines();
    picClick(me);
    badgeClick(me);
    ActionEvent ae = null;
    findAction(ae);
    ComboBox<String> combo = new ComboBox<>();
    for (int i = 0; i < 6; i++) {
      switch (i) {
        case 0: {
          combo = cbo;
        }
        case 1: {
          combo = combo1;
        }
        case 2: {
          combo = combo2;
        }
        case 3: {
          combo = combo3;
        }
        case 4: {
          combo = combo4;
        }
        case 5: {
          combo = combo5;
        }
      }
      setCombo(i, combo.getValue());
    }
    cbo.setValue("279");
  }

  @FXML
  private void numberAction(ActionEvent event) {
    //<editor-fold defaultstate="collapsed" desc="IFD">
    {
      String s = "";
      boolean DEBUG = false;  // true or false;
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
    cbo.setValue(tf.getText());
  }

  @FXML
  private void numberClick(MouseEvent event) {
    //<editor-fold defaultstate="collapsed" desc="IFD">
    {
      String s = "";
      boolean DEBUG = false;  // true or false;
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
    cbo.setValue(tf.getText());
  }

  int piccy = -1;
  private String[] piccies = {
    "file:///C://T5 Extra/4518th/src/pkg4518th/4518Coin.jpeg",
    "file:///C://T5 Extra/4518th/src/pkg4518th/4518LIB_Patch.jpg"
  };

  @FXML
  private void badgeClick(MouseEvent event) {
    piccy += 1;
    if (piccy == piccies.length) {
      piccy = 0;
    }
//    System.out.println(piccies[piccy]);
    try {
      img2 = new Image(piccies[piccy]);
    } catch (Exception e) {
//      System.out.println("480 e" + " = " + e);
    }
    try {
      view.setImage(img2);
//      Tooltip tip = new Tooltip();
//      tip.setText(pics[picnumber]);
//      Lines.setTooltip(tip);
//      col.setTooltip(tip);
    } catch (Exception e) {
//      System.out.println("485 e" + " = " + e);
//      System.out.println("" + " = " + pic.toString());
    }
  }

  private int picnumber = -1;
  private String[] pics = {
    "file:///C://T5 Extra/4518th/src/pkg4518th/4518th.gif",
    "file:///C://T5 Extra/4518th/src/pkg4518th/4518.gif",
    "file:///C://T5 Extra/4518th/src/pkg4518th/4518th Regimental HQ.png",
    "file:///C://T5 Extra/4518th/src/pkg4518th/4518thLIR.png",
    "file:///C://T5 Extra/4518th/src/pkg4518th/JTB.png",
    "file:///C://T5 Extra/4518th/src/pkg4518th/LCS.png",
    "file:///C://T5 Extra/4518th/src/pkg4518th/LIB.png",
    "file:///C://T5 Extra/4518th/src/pkg4518th/PKF.png",
    "file:///C://T5 Extra/4518th/src/pkg4518th/APB.png"
  };

  @FXML
  private void picClick(MouseEvent event) {
    picnumber += 1;
    if (picnumber == pics.length) {
      picnumber = 0;
    }
//    System.out.println(pics[picnumber]);
    try {
      img = new Image(pics[picnumber]);
    } catch (Exception e) {
      System.out.println("480 e" + " = " + e);
    }
    try {
      pic.setImage(img);
      Tooltip tip = new Tooltip();
      tip.setText(pics[picnumber]);
      Lines.setTooltip(tip);
      col.setTooltip(tip);
    } catch (Exception e) {
      System.out.println("485 e" + " = " + e);
      System.out.println("" + " = " + pic.toString());
    }
  }

  private void columnClick(String string) {
    System.out.println(string);
  }

  private void columnsClick(ActionEvent event) {
    //<editor-fold defaultstate="collapsed" desc="IFD">
    {
      String s = "";
      boolean DEBUG = false;  // true or false;
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
      boolean DEBUG = false;  // true or false;
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
      boolean DEBUG = false;  // true or false;
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
      boolean DEBUG = false;  // true or false;
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
      boolean DEBUG = false;  // true or false;
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
    countLines();
  }

  private void findRank(MouseEvent event) {
    //<editor-fold defaultstate="collapsed" desc="IFD">
    {
      String s = "";
      boolean DEBUG = false;  // true or false;
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
      boolean DEBUG = false;  // true or false;
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
      boolean DEBUG = false;  // true or false;
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
//      ta.appendText(splitter);
      ta.appendText(lines[nums[i] - 1].replace(",", CRLF).trim() + CRLF);
      ta.appendText(CRLF);
    }
  }

  private void titleClick(MouseEvent event) {
    //<editor-fold defaultstate="collapsed" desc="IFD">
    {
      String s = "";
      boolean DEBUG = false;  // true or false;
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
    countLines();
  }

  private String showMarine(String string) {
//    combo1.setValue("");
//    combo2.setValue("");
//    combo3.setValue("");
//    combo4.setValue("");
    RANK.setText("");
    ta.setText("");
    String[] parts = string.split(",");
    for (int i = 0; i < parts.length; i++) {
      parts[i] = parts[i].replace("\"", "").trim();
      if (!"".equals(parts[i])) {
        ta.appendText(parts[i] + CRLF);
      }
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
      System.out.println("1071 e" + " = " + e);
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

  private void sort(int col) {
    //<editor-fold defaultstate="collapsed" desc="IFD">
    {
      String s = "";
      boolean DEBUG = false;  // true or false;
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
    try {
      for (int j = 0; j < lines.length; j++) {
        ta.appendText(lines[j] + CRLF);
      }
    } catch (Exception e) {
      System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
      //<editor-fold defaultstate="collapsed" desc="JOP">
      {
        String s = "";
        s += "col = " + col + CRLF;
        s += "" + CRLF;
        JTextArea jta = new JTextArea(s, 50, 80);
        JScrollPane jsp = new JScrollPane(jta);
        JOptionPane.showMessageDialog(null, jsp);
      }
      //</editor-fold>
    }
  }

  @FXML
  private void rankCheck(ActionEvent event) {
    //<editor-fold defaultstate="collapsed" desc="IFD">
    {
      String s = "";
      boolean DEBUG = false;  // true or false;
      if (DEBUG) { // true or false
        s += "//////////////////////////////////////////////" + CRLF;
        s += "pkg4518th.LIR4518th.rankCheck()" + CRLF;
        s += "\t" + Thread.currentThread().getStackTrace()[1].getMethodName() + CRLF;
        s += "byrank.isSelected()" + " = " + byrank.isSelected() + CRLF;
        System.out.println(s);
      }
    }
    //</editor-fold>
  }

  @FXML
  private void unitCheck(ActionEvent event) {
    //<editor-fold defaultstate="collapsed" desc="IFD">
    {
      String s = "";
      boolean DEBUG = false;  // true or false;
      if (DEBUG) { // true or false
        s += "//////////////////////////////////////////////" + CRLF;

        s += "\t" + Thread.currentThread().getStackTrace()[1].getMethodName() + CRLF;
        s += "byunit.isSelected()" + " = " + byunit.isSelected() + CRLF;
        //s += "" + " = " + "" + CRLF;
        System.out.println(s);
      }
    }
    //</editor-fold>
  }

}
