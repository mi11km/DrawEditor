package DrawEditor;

import DrawEditor.Controller.DrawController;
import DrawEditor.Model.DrawModel;
import DrawEditor.View.ViewPanel;

import javax.swing.*;
import java.awt.*;

public class DrawFrame extends JFrame {
    DrawModel model;
    ViewPanel view;
    DrawController cont;

    public DrawFrame() {
        model = new DrawModel();
        cont = new DrawController(model);
        view = new ViewPanel(model, cont);
        this.setBackground(Color.black);
        this.setTitle("Draw Editor");
        this.setSize(500, 500);
        this.add(view);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
