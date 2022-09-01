package controller.commands;

import java.io.IOException;

import controller.ImageGUIController;
import controller.ImageProcessingController;
import model.ImageModel;
import model.ImageProcessingModel;
import view.ImageProcessingViewGUI;

/**
 * Represents the brighten class which helps create an image manipulated according to its given
 * brightness value.
 */
public class Brighten extends AbstractCommand {

  int value;

  /**
   * Constructs a {@code Brighten} through the given model and view.
   * @param model the given model.
   * @param view the given gui view.
   * @throws IllegalArgumentException if model or view is null.
   */
  public Brighten(ImageProcessingModel model,
                  ImageProcessingViewGUI view) {
    super(model, view);
  }

  /**
   * Constructs a {@code Brighten} through the given image, model, controller, and
   * newImage.
   * @param image the name of the image.
   * @param model the given model.
   * @param controller the given controller.
   * @param newImage the name of the new image.
   * @throws IllegalArgumentException if model or controller is null.
   */
  public Brighten(String image, ImageProcessingModel model,
                  ImageProcessingController controller, int value, String newImage) {
    super(image, model, controller, newImage);
    this.value = value;
  }

  /**
   * A factory method that does the specific command by calling the extended class.
   *
   * @param model the ImageProcessingModel to perform the command on
   * @return a new ImageProcessingModel
   */
  @Override
  public ImageModel doCommand(ImageModel model) throws IOException {
    if (value == 0) {
      this.value = view.getBrightenValue();
    }

    if (view == null) {
      controller.printMessage(newImage + " created by changing brightness of " + image + ".");
    }
    if (controller == null) {
      view.renderMessage(newImage + " created by changing brightness of " + image + ".");
    }

    int theValue = value;
    value = 0;

    return model.brighten(theValue);
  }
}
