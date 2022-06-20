package DrawEditor.Controller;


import DrawEditor.Model.DrawModel;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class DrawController implements MouseListener, MouseMotionListener {
    protected DrawModel model;
    protected int dragStartX, dragStartY;

    public DrawController(DrawModel a) {
        model = a;
    }

    public void mouseClicked(MouseEvent e) {
    }

    public void mousePressed(MouseEvent e) {
        dragStartX = e.getX();
        dragStartY = e.getY();
        model.createFigure(dragStartX, dragStartY);
    }

    public void mouseDragged(MouseEvent e) {
        model.reshapeFigure(dragStartX, dragStartY, e.getX(), e.getY());
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