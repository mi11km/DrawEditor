package DrawEditor.Controller;


import DrawEditor.Model.DrawModel;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class DrawController implements MouseListener, MouseMotionListener {
    protected DrawModel drawModel;
    protected int dragStartX, dragStartY;

    public DrawController(DrawModel m) {
        this.drawModel = m;
    }

    public void mouseClicked(MouseEvent e) {
    }

    public void mousePressed(MouseEvent e) {
        this.dragStartX = e.getX();
        this.dragStartY = e.getY();
        this.drawModel.createFigure(this.dragStartX, this.dragStartY);
    }

    public void mouseDragged(MouseEvent e) {
        this.drawModel.reshapeFigure(this.dragStartX, this.dragStartY, e.getX(), e.getY());
    }

    public void mouseReleased(MouseEvent e) {
    }

    public void mouseEntered(MouseEvent e) {
    }

    public void mouseExited(MouseEvent e) {
    }

    public void mouseMoved(MouseEvent e) {
    }
}