package DrawEditor.View;

import DrawEditor.Model.DrawModel;
import DrawEditor.Model.FiguresEnum;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

public class ViewSelectorPanel extends JPanel implements ActionListener {

  protected DrawModel drawModel;

  private final JButton colorSelectButton;
  private final JButton changeFigureButton;

  public ViewSelectorPanel(DrawModel m) {
    this.drawModel = m;

    URL colorPickIconImageURL = getClass().getClassLoader().getResource("color-picker.png");
    assert colorPickIconImageURL != null;
    ImageIcon imageIcon = new ImageIcon(colorPickIconImageURL);
    imageIcon = new ImageIcon(imageIcon.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH));

    this.colorSelectButton = new JButton("色の選択", imageIcon);
    this.colorSelectButton.addActionListener(this);
    this.add(this.colorSelectButton);

    this.changeFigureButton = new JButton("図形を変更する");
    this.changeFigureButton.addActionListener(this);
    this.add(this.changeFigureButton);
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    if (e.getSource() == this.colorSelectButton) {
      Color selectedColor =
          JColorChooser.showDialog(null, "色の選択", this.drawModel.getCurrentColor());
      if (selectedColor != null) {
        this.drawModel.setColor(selectedColor);
      }
    } else if (e.getSource() == this.changeFigureButton) {
      this.drawModel.changeFigure(FiguresEnum.CIRCLE);
    }
  }
}
