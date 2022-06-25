/*
 * This Java source file is an entrypoint of this application.
 */
package DrawEditor;

import DrawEditor.Controller.Controllers;
import DrawEditor.Model.DrawModel;
import DrawEditor.View.ViewDrawPanel;
import DrawEditor.View.ViewSelectorPanel;

import javax.swing.*;
import java.awt.*;
import java.util.Objects;

public class App extends JFrame {

  public App() {
    this.setBackground(Color.white);
    this.setTitle("Draw Editor");
    this.setSize(1000, 800);

    DrawModel drawModel = new DrawModel();
    Controllers controllers = new Controllers(drawModel);
    ViewDrawPanel viewDrawPanel = new ViewDrawPanel(drawModel, controllers.drawController);
    this.add(viewDrawPanel, BorderLayout.CENTER);
    ViewSelectorPanel viewSelectorPanel = new ViewSelectorPanel(controllers.colorController);
    this.add(viewSelectorPanel, BorderLayout.SOUTH);

    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setVisible(true);
  }

  public static void main(String[] args) {
    new App();
  }
}
