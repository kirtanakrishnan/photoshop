package view;

import java.io.IOException;

/**
 * Represents the interface of the Image Processor's view. It only renders a Message
 * to the view.
 */
public interface ImageProcessingView {

  /**
   * Renders an error message.
   * @param message the error message.
   * @throws IOException if the error message is unable to be rendered.
   */
  void renderError(String message) throws IOException;

  /**
   * Renders a message.
   * @param message the message.
   * @throws IOException if the message is unable to be rendered.
   */
  void renderMessage(String message) throws IOException;

  /**
   * Gets the file path.
   * @return the file path.
   */
  String getFilePath();

  /**
   * Gets the save file path.
   * @return the save file path.
   */
  String saveToFilePath();
}
