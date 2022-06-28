package DrawEditor.Model;

import java.awt.*;

/**
 * this class is the implementation of Figure interface. It is for common figures (like rect,
 * circle...)
 */
public class FigureCommonImpl implements Figure {
  protected int x, y, width, height;
  protected Color color;

  public FigureCommonImpl(int x, int y, int w, int h, Color c) {
    this.x = x;
    this.y = y;
    this.width = w;
    this.height = h;
    this.color = c;
  }

  private void setSize(int w, int h) {
    this.width = w;
    this.height = h;
  }

  private void setLocation(int x, int y) {
    this.x = x;
    this.y = y;
  }

  @Override
  public void draw(Graphics g) {}

  @Override
  public void reshape(int x1, int y1, int x2, int y2) {
    int newX = Math.min(x1, x2);
    int newY = Math.min(y1, y2);
    int newWidth = Math.abs(x1 - x2);
    int newHeight = Math.abs(y1 - y2);
    this.setLocation(newX, newY);
    this.setSize(newWidth, newHeight);
  }
}
