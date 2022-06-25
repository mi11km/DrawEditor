package DrawEditor;

import DrawEditor.Controller.DrawController;
import DrawEditor.Model.DrawModel;
import DrawEditor.View.ViewPanel;

import javax.swing.*;
import java.awt.*;

public class DrawFrame extends JFrame {
    public DrawFrame() {
        this.setBackground(Color.black);
        this.setTitle("Draw Editor");
        this.setSize(1000, 1000);

        DrawModel model = new DrawModel();
        DrawController controller = new DrawController(model);
        ViewPanel view = new ViewPanel(model, controller);
        this.add(view);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
