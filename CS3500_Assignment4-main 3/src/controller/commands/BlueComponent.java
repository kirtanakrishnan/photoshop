package controller.commands;

import java.io.IOException;

import controller.ImageGUIController;
import controller.ImageProcessingController;
import model.ImageModel;
import model.ImageProcessingModel;
import view.ImageProcessingViewGUI;

/**
 * Represents the BlueComponent class which helps create an image manipulated according to its
 * blue component.
 */
public class BlueComponent extends AbstractCommand {

  /**
   * Constructs a {@code BlueComponent} through the given model and view.
   * @param model the given model.
   * @param view the given gui view.
   * @throws IllegalArgumentException if model or view is null.
   */
  public BlueComponent(ImageProcessingModel model,
                         ImageProcessingViewGUI view) {
    super(model, view);
  }

  /**
   * Constructs a {@code BlueComponent} through the given image, model, controller, and
   * newImage.
   * @param image the name of the image.
   * @param model the given model.
   * @param controller the given controller.
   * @param newImage the name of the new image.
   * @throws IllegalArgumentException if model or controller is null.
   */
  public BlueComponent(String image, ImageProcessingModel model,
                       ImageProcessingController controller, String newImage) {
    super(image, model, controller, newImage);
  }

  /**
   * Helps create a greyscale image with the blue-component of the image and its respective message.
   *
   * @param model      the model.
   * @return the greyscale image with the blue-component of the image.
   */
  @Override
  public ImageModel doCommand(ImageModel model) throws IOException {
    if (view == null) {
      controller.printMessage(newImage + " created through blue channel of " + image + ".");
    }
    if (controller == null) {
      view.renderMessage(newImage + " created through blue channel of " + image + ".");
    }
    return model.blueComponent();
  }
}
