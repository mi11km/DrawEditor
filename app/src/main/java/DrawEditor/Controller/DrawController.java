package DrawEditor.Controller;

import DrawEditor.Model.DrawModel;

import java.awt.event.*;

public class DrawController implements MouseListener, MouseMotionListener {
  protected DrawModel drawModel;
  protected int dragStartX, dragStartY;

  public DrawController(DrawModel m) {
    this.drawModel = m;
  }

  @Override
  public void mouseClicked(MouseEvent e) {}

  @Override
  public void mousePressed(MouseEvent e) {
    this.dragStartX = e.getX();
    this.dragStartY = e.getY();
    this.drawModel.createFigure(this.dragStartX, this.dragStartY);
  }

  @Override
  public void mouseReleased(MouseEvent e) {}

  @Override
  public void mouseEntered(MouseEvent e) {}

  @Override
  public void mouseExited(MouseEvent e) {}

  @Override
  public void mouseDragged(MouseEvent e) {
    this.drawModel.reshapeFigure(this.dragStartX, this.dragStartY, e.getX(), e.getY());
  }

  @Override
  public void mouseMoved(MouseEvent e) {}
}
