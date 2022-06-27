/*
 * This Java source file is an entrypoint of this application.
 */
package DrawEditor;

import DrawEditor.Controller.DrawController;
import DrawEditor.Model.DrawModel;
import DrawEditor.View.DrawPanelView;
import DrawEditor.View.SelectButtonsPanelView;

import javax.swing.*;
import java.awt.*;

public class App extends JFrame {

  public App() {
    this.setBackground(Color.white);
    this.setTitle("Draw Editor");
    this.setSize(1000, 800);

    DrawModel drawModel = new DrawModel();
    DrawController drawController = new DrawController(drawModel);
    DrawPanelView drawPanelView = new DrawPanelView(drawModel, drawController);
    this.add(drawPanelView, BorderLayout.CENTER);
    SelectButtonsPanelView selectButtonsPanelView = new SelectButtonsPanelView(drawModel);
    this.add(selectButtonsPanelView, BorderLayout.SOUTH);

    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setVisible(true);
  }

  public static void main(String[] args) {
    new App();
  }
}
