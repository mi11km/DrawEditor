package DrawEditor.Model;

import java.awt.*;

public class FigureImpl implements Figure {
  protected int x, y, width, height;
  protected Color color;

  public FigureImpl(int x, int y, int w, int h, Color c) {
    this.x = x;
    this.y = y;
    this.width = w;
    this.height = h;
    this.color = c;
  }

  public void draw(Graphics g) {}

  public void setSize(int w, int h) {
    this.width = w;
    this.height = h;
  }

  public void setLocation(int x, int y) {
    this.x = x;
    this.y = y;
  }

  public void reshape(int x1, int y1, int x2, int y2) {
    int newX = Math.min(x1, x2);
    int newY = Math.min(y1, y2);
    int newWidth = Math.abs(x1 - x2);
    int newHeight = Math.abs(y1 - y2);
    setLocation(newX, newY);
    setSize(newWidth, newHeight);
  }
}
