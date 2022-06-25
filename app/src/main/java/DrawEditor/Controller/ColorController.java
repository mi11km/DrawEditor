package DrawEditor.Controller;

import DrawEditor.Model.DrawModel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ColorController implements ActionListener {
  protected DrawModel drawModel;

  public ColorController(DrawModel m) {
    this.drawModel = m;
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    Color selectedColor = JColorChooser.showDialog(null, "色の選択", this.drawModel.getCurrentColor());
    if (selectedColor != null) {
      this.drawModel.setColor(selectedColor);
    }
  }
}
