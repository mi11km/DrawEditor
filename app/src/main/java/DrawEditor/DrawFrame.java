package DrawEditor;

import DrawEditor.Controller.DrawController;
import DrawEditor.Model.DrawModel;
import DrawEditor.View.ViewPanel;

import javax.swing.*;
import java.awt.*;

public class DrawFrame extends JFrame {
    DrawModel model;
    ViewPanel view;
    DrawController controller;

    public DrawFrame() {
        this.setBackground(Color.black);
        this.setTitle("Draw Editor");
        this.setSize(1000, 1000);

        this.model = new DrawModel();
        this.controller = new DrawController(this.model);
        this.view = new ViewPanel(this.model, this.controller);
        this.add(this.view);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
