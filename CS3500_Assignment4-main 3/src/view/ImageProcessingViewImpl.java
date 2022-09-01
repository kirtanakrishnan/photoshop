package view;

import java.io.IOException;

/**
 * Implementation of ImageProcessingView that implements inherited methods.
 */
public class ImageProcessingViewImpl implements ImageProcessingView {

  private final Appendable appendable;

  /**
   * Creates an ImageProcessingViewImpl.
   * @param appendable the appendable.
   */
  public ImageProcessingViewImpl(Appendable appendable) {
    if (appendable == null) {
      throw new IllegalArgumentException("appendable is null");
    }

    this.appendable = appendable;
  }

  // TODO: do we need this?
  public ImageProcessingViewImpl() {
    this(System.out);
  }

  /**
   * Renders an error message.
   * @param message the error message.
   * @throws IOException if the error message is unable to be rendered.
   */
  @Override
  public void renderError(String message) throws IOException {
    this.appendable.append(message);
  }

  /**
   * Renders a message.
   * @param message the message.
   * @throws IOException if the message is unable to be rendered.
   */
  @Override
  public void renderMessage(String message) throws IOException {
    this.appendable.append(message);
  }

  /**
   * Returns a null file path.
   * @return the null file path.
   */
  @Override
  public String getFilePath() {
    return null;
  }

  /**
   * Returns a null save file path.
   * @return the null save file path.
   */
  @Override
  public String saveToFilePath() {
    return null;
  }
}
