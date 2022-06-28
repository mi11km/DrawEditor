package DrawEditor.View;

import DrawEditor.Model.DrawModel;
import DrawEditor.Model.FiguresEnum;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

/**
 * This class is the view(and controller) of draw editor app. It displays buttons GUI to select
 * figure options. It also changes DrawModel metadata by the button pushed action.
 */
public class SelectPanelView extends JPanel implements ActionListener {
  protected DrawModel drawModel;
  private final JButton colorSelectButton;
  private final JButton circleFigureSelectButton;
  private final JButton rectangleFigureSelectButton;

  /**
   * This method get ImageIcon object from file name.
   *
   * @param name the image file name
   * @return ImageIcon object
   */
  private ImageIcon getImageIcon(String name) {
    URL colorPickIconImageURL = getClass().getClassLoader().getResource(name);
    assert colorPickIconImageURL != null;
    ImageIcon imageIcon = new ImageIcon(colorPickIconImageURL);
    return new ImageIcon(imageIcon.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH));
  }

  public SelectPanelView(DrawModel m) {
    this.drawModel = m;

    this.colorSelectButton = new JButton("Color", this.getImageIcon("color-picker.png"));
    this.colorSelectButton.addActionListener(this);
    this.add(this.colorSelectButton);

    this.rectangleFigureSelectButton = new JButton("Rect", this.getImageIcon("rectangle.png"));
    this.rectangleFigureSelectButton.addActionListener(this);
    this.add(this.rectangleFigureSelectButton);

    this.circleFigureSelectButton = new JButton("Circle", this.getImageIcon("circle.png"));
    this.circleFigureSelectButton.addActionListener(this);
    this.add(this.circleFigureSelectButton);
  }

  /**
   * this method changes the DrawModel metadata.
   *
   * @param e the button pushed event to be processed
   */
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
