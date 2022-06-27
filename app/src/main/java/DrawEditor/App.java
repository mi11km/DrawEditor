/*
 * This Java source file is an entrypoint of this application.
 */
package DrawEditor;

import DrawEditor.Controller.DrawController;
import DrawEditor.Model.DrawModel;
import DrawEditor.View.ViewDrawPanel;
import DrawEditor.View.ViewSelectButtonsPanel;

import javax.swing.*;
import java.awt.*;

public class App extends JFrame {

  public App() {
    this.setBackground(Color.white);
    this.setTitle("Draw Editor");
    this.setSize(1000, 800);

    DrawModel drawModel = new DrawModel();
    DrawController drawController = new DrawController(drawModel);
    ViewDrawPanel viewDrawPanel = new ViewDrawPanel(drawModel, drawController);
    this.add(viewDrawPanel, BorderLayout.CENTER);
    ViewSelectButtonsPanel viewSelectButtonsPanel = new ViewSelectButtonsPanel(drawModel);
    this.add(viewSelectButtonsPanel, BorderLayout.SOUTH);

    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setVisible(true);
  }

  public static void main(String[] args) {
    new App();
  }
}
