/*
 * This Java source file is an entrypoint of this application.
 */
package DrawEditor;

import DrawEditor.Controller.Controllers;
import DrawEditor.Model.DrawModel;
import DrawEditor.View.ViewPanel;

import javax.swing.*;
import java.awt.*;

public class App extends JFrame {

  public App() {
    this.setBackground(Color.white);
    this.setTitle("Draw Editor");
    this.setSize(1000, 1000);

    DrawModel model = new DrawModel();
    Controllers controllers = new Controllers(model);
    ViewPanel view = new ViewPanel(model, controllers);
    this.add(view);

    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setVisible(true);
  }

  public static void main(String[] args) {
    new App();
  }
}
