package DrawEditor.View;

import DrawEditor.Controller.DrawController;
import DrawEditor.Model.DrawModel;
import DrawEditor.Model.Figure;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

/** This class is the view of draw editor app. It displays drawing GUI. */
@SuppressWarnings("deprecation")
public class DrawPanelView extends JPanel implements Observer {
  protected DrawModel drawModel;

  public DrawPanelView(DrawModel m, DrawController c) {
    this.setBackground(Color.white);
    this.addMouseListener(c);
    this.addMouseMotionListener(c);

    this.drawModel = m;
    this.drawModel.addObserver(this);
  }

  /**
   * This method is called by repaint() method.
   *
   * @param g the <code>Graphics</code> object to protect
   */
  @Override
  public void paintComponent(Graphics g) {
    super.paintComponent(g);
    ArrayList<Figure> fig = this.drawModel.getFigures();
    for (Figure f : fig) {
      f.draw(g);
    }
  }

  /**
   * This method is called when the DrawModel(extends Observable) is changed. The repaint() execute
   * this.paintComponent(Graphics g) function and repaint screen.
   */
  @Override
  public void update(Observable o, Object arg) {
    repaint();
  }
}
