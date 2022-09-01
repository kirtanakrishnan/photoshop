package view;

import java.awt.event.ActionListener;

import javax.swing.*;

import controller.ImageGUIController;
import controller.ImageGUIControllerImpl;

/**
 * Represents the interface of the Image Processor's view, which visually renders the view through
 * GUI.
 */
public interface ImageProcessingViewGUI extends ImageProcessingView {

  /**
   * Makes the ViewGUIImpl window visible.
   */
  void makeVisible();

  /**
   * Gets the value that the image is being brightened by.
   * @return the value that the image is being brightened by.
   */
  int getBrightenValue();

  /**
   * Repaints the ViewGUIImpl component.
   */
  void refresh();

  /**
   * Initializes the controller.
   * @param controller the given controller.
   */
  void setController(ImageGUIController controller);

  /**
   * Constructs the GUI view through buttons and panels for each command.
   */
  void viewSetUp();

}
