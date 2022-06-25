package DrawEditor.View;

import DrawEditor.Controller.DrawController;
import DrawEditor.Model.DrawModel;
import DrawEditor.Model.Figure;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

// Viewは，Observerをimplementsする．Modelを監視して，モデルが更新されたらupdateする．実際には，Modelからupdateが呼び出される．
@SuppressWarnings("deprecation")
public class ViewPanel extends JPanel implements Observer {
    protected DrawModel drawModel;

    public ViewPanel(DrawModel m, DrawController c) {
        this.setBackground(Color.white);
        this.addMouseListener(c);
        this.addMouseMotionListener(c);
        this.drawModel = m;
        this.drawModel.addObserver(this);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        ArrayList<Figure> fig = this.drawModel.getFigures();
        for (Figure f : fig) {
            f.draw(g);
        }
    }

    public void update(Observable o, Object arg) {
        repaint();
    }
}