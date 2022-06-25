package DrawEditor.View;

import DrawEditor.Controller.ColorController;
import DrawEditor.Model.DrawModel;

import javax.swing.*;
import java.awt.*;
import java.net.URL;
import java.util.Objects;

public class ViewSelectorPanel extends JPanel {
  public ViewSelectorPanel(ColorController c) {
    URL colorPickIconImageURL = getClass().getClassLoader().getResource("color-picker.png");
    assert colorPickIconImageURL != null;
    ImageIcon imageIcon = new ImageIcon(colorPickIconImageURL);
    imageIcon = new ImageIcon(imageIcon.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH));

    JButton colorChangeButton = new JButton("色の選択", imageIcon);
    colorChangeButton.addActionListener(c);
    this.add(colorChangeButton);

    for (int i = 0; i < 3; i++) {
      this.add(new JButton(String.valueOf(i)));
    }
  }
}
