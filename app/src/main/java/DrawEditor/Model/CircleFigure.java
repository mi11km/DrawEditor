package DrawEditor.Model;

import java.awt.*;

public class CircleFigure extends FigureImpl {
  public CircleFigure(int x, int y, int w, int h, Color c) {
    super(x, y, w, h, c);
  }

  @Override
  public void draw(Graphics g) {
    g.setColor(this.color);
    g.drawOval(this.x, this.y, this.width, this.height);
  }
}
