package DrawEditor.Model;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Observable;

/** This class is the model of draw editor. It manages Drawing Model. */
@SuppressWarnings("deprecation")
public class DrawModel extends Observable {
  /** Created figures */
  protected ArrayList<Figure> currentFigures;
  /** A drawing figure */
  protected Figure drawingFigure;
  /** The Color of figure to draw */
  protected Color currentColor;
  /** The selected figure type to draw */
  protected FiguresEnum selectedFigureType;

  public DrawModel() {
    this.currentFigures = new ArrayList<Figure>();
    this.drawingFigure = null;
    this.currentColor = Color.BLACK;
    this.selectedFigureType = FiguresEnum.RECTANGLE;
  }

  public ArrayList<Figure> getFigures() {
    return this.currentFigures;
  }

  public void setColor(Color color) {
    this.currentColor = color;
  }

  public Color getCurrentColor() {
    return this.currentColor;
  }

  public void setFigureType(FiguresEnum f) {
    this.selectedFigureType = f;
  }

  /**
   * This method creates new figure and notify this changes to Observer.
   *
   * @param x the x coordinate of the creating figure
   * @param y the y coordinate of the creating figure
   */
  public void createFigure(int x, int y) {
    Figure f;
    if (this.selectedFigureType == FiguresEnum.CIRCLE) {
      f = new CircleFigure(x, y, 0, 0, this.currentColor);
    } else {
      f = new RectFigure(x, y, 0, 0, this.currentColor);
    }
    this.currentFigures.add(f);
    this.drawingFigure = f;
    setChanged();
    notifyObservers();
  }

  /**
   * This method reshape the drawing figure and notify this changes to Observer.
   */
  public void reshapeFigure(int x1, int y1, int x2, int y2) {
    if (this.drawingFigure != null) {
      this.drawingFigure.reshape(x1, y1, x2, y2);
      setChanged();
      notifyObservers();
    }
  }
}
