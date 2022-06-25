package DrawEditor.Model;

import java.awt.*;

public class CircleFigure extends Figure {
  public CircleFigure(int x, int y, int w, int h, Color c) {
    super(x, y, w, h, c);
  }

  public void draw(Graphics g) {
    g.setColor(this.color);
    g.drawOval(this.x, this.y, this.width, this.height);
  }
}
