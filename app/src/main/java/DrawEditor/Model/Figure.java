package DrawEditor.Model;

import java.awt.*;

public interface Figure {
  /**
   * This method draw a figure.
   *
   * @param g graphics object for GUI
   */
  void draw(Graphics g);
  /**
   * This method reshape a figure.
   *
   * @param x1 the old x coordinate of the creating figure
   * @param y1 the old y coordinate of the creating figure
   * @param x2 the new x coordinate of the creating figure
   * @param y2 the new y coordinate of the creating figure
   */
  void reshape(int x1, int y1, int x2, int y2);
}
