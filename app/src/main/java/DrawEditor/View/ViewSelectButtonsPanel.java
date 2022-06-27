package DrawEditor.View;

import DrawEditor.Model.DrawModel;
import DrawEditor.Model.FiguresEnum;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

public class ViewSelectButtonsPanel extends JPanel implements ActionListener {
  protected DrawModel drawModel;
  private final JButton colorSelectButton;
  private final JButton circleFigureSelectButton;
  private final JButton rectangleFigureSelectButton;

  private ImageIcon getImageIcon(String name) {
    URL colorPickIconImageURL = getClass().getClassLoader().getResource(name);
    assert colorPickIconImageURL != null;
    ImageIcon imageIcon = new ImageIcon(colorPickIconImageURL);
    return new ImageIcon(imageIcon.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH));
  }

  public ViewSelectButtonsPanel(DrawModel m) {
    this.drawModel = m;

    this.colorSelectButton = new JButton("色の選択", this.getImageIcon("color-picker.png"));
    this.colorSelectButton.addActionListener(this);
    this.add(this.colorSelectButton);

    this.rectangleFigureSelectButton = new JButton(this.getImageIcon("rectangle.png"));
    this.rectangleFigureSelectButton.addActionListener(this);
    this.add(this.rectangleFigureSelectButton);

    this.circleFigureSelectButton = new JButton(this.getImageIcon("circle.png"));
    this.circleFigureSelectButton.addActionListener(this);
    this.add(this.circleFigureSelectButton);
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    if (e.getSource() == this.colorSelectButton) {
      Color selectedColor =
          JColorChooser.showDialog(null, "色の選択", this.drawModel.getCurrentColor());
      if (selectedColor != null) {
        this.drawModel.setColor(selectedColor);
      }
    } else if (e.getSource() == this.circleFigureSelectButton) {
      this.drawModel.changeFigure(FiguresEnum.CIRCLE);
    } else if (e.getSource() == this.rectangleFigureSelectButton) {
      this.drawModel.changeFigure(FiguresEnum.RECTANGLE);
    }
  }
}
