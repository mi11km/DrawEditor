package DrawEditor.Model;

import java.awt.*;

public interface Figure {
  void draw(Graphics g);

  void setSize(int w, int h);

  void setLocation(int x, int y);

  void reshape(int x1, int y1, int x2, int y2);
}
