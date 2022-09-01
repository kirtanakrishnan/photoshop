package controller;

import java.awt.event.ActionEvent;
import java.io.IOException;

import model.ImageModel;

/**
 * This interface represents the operations offered by the image gui controller. These
 * include processCommand() that runs continuously, go() which starts the program,
 * printMessage() which prints a message, and renderError() which renders an error message.
 */
public interface ImageGUIController {

  /**
   * Processes the user's input and applies the respective command.
   *
   * @throws IllegalStateException if the command is invalid.
   */
  String processCommand(String command) throws IOException;

  /**
   * Start the program, i.e. give control to the controller
   */
  void go();

  /**
   * Invoked when an action occurs.
   *
   * @param e the event to be processed
   */
  void actionPerformed(ActionEvent e);

  /**
   * Renders the message.
   * @param message the message to be rendered.
   * @throws IOException if the message is unable to be rendered.
   */
  void printMessage(String message) throws IOException;

  /**
   * Renders the error message.
   * @param message the error message to be rendered.
   * @throws IOException if the error message is unable to be rendered.
   */
  void renderError(String message) throws IOException;

}
