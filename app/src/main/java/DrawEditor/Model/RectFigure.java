package DrawEditor.Model;

import java.awt.*;

public class RectFigure extends FigureCommonImpl {
  public RectFigure(int x, int y, int w, int h, Color c) {
    super(x, y, w, h, c);
  }

  @Override
  public void draw(Graphics g) {
    g.setColor(this.color);
    g.drawRect(this.x, this.y, this.width, this.height);
  }
}
