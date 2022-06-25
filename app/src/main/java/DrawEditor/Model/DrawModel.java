package DrawEditor.Model;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Observable;

@SuppressWarnings("deprecation")
public class DrawModel extends Observable {
  protected ArrayList<Figure> figures;
  protected Figure drawingFigure;
  protected Color currentColor;

  public DrawModel() {
    this.figures = new ArrayList<Figure>();
    this.drawingFigure = null;
    this.currentColor = Color.BLACK;
  }

  public ArrayList<Figure> getFigures() {
    return this.figures;
  }

  public void setColor(Color color) {
    this.currentColor = color;
  }

  public Color getCurrentColor() {
    return this.currentColor;
  }

  public void createFigure(int x, int y) {
    Figure f = new RectangleFigure(x, y, 0, 0, this.currentColor);
    this.figures.add(f);
    this.drawingFigure = f;
    setChanged();
    notifyObservers();
  }

  public void reshapeFigure(int x1, int y1, int x2, int y2) {
    if (this.drawingFigure != null) {
      this.drawingFigure.reshape(x1, y1, x2, y2);
      setChanged();
      notifyObservers();
    }
  }
}
