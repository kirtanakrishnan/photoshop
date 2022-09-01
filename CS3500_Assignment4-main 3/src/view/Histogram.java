package view;

import model.ImageModel;

/**
 * Represents a histogram, which plots the frequency of pixels with values ranging from 0-255.
 */
public class Histogram {

  private int [] redHistogram = new int [256];
  private int [] greenHistogram = new int [256];
  private int [] blueHistogram = new int [256];
  private ImageModel image;


  /**
   * Constructs a {@code Histogram}, with its fields initialized to themselves.
   * @param model the model used to create the histogram.
   */
  public Histogram(ImageModel model) {
    this.image = model;
    this.generateHistograms();
  }

  private void generateHistograms() {
    for (int row = 0; row <= (image.getHeight() - 1); row = row + 1) {
      for (int col = 0; col <= (image.getWidth() - 1); col = col + 1) {
        int red = image.getPixelAt(row, col).getColor(0);
        redHistogram[red] = redHistogram[red] + 1;

        int green = image.getPixelAt(row, col).getColor(1);
        greenHistogram[green] = greenHistogram[green] + 1;

        int blue = image.getPixelAt(row, col).getColor(2);
        blueHistogram[blue] = blueHistogram[blue] + 1;

      }
    }
  }

  /**
   * Returns the histogram of values for the component corresponding to the index value.
   * @param index the index corresponding to either the red, blue, or green component.
   * @return the histogram of values for the component corresponding to the index value.
   */
  public int [] returnHistogram(int index) {
    if (index == 0) {
      return redHistogram;
    }
    else if (index == 1) {
      return greenHistogram;
    }
    else if (index == 2) {
      return blueHistogram;
    }
    else {
      throw new IllegalArgumentException();
    }
  }
}
