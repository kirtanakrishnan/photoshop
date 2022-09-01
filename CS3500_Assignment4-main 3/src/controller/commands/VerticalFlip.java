package controller.commands;

import java.io.IOException;

import controller.ImageGUIController;
import controller.ImageProcessingController;
import model.ImageModel;
import model.ImageProcessingModel;
import view.ImageProcessingViewGUI;

/**
 * Represents the verticalflip class which helps create an image by vertically flipping it.
 */
public class VerticalFlip extends AbstractCommand {

  /**
   * Constructs a {@code VerticalFlip} through the given image, model, controller, and
   * newImage.
   * @param image the name of the image.
   * @param model the given model.
   * @param controller the given controller.
   * @param newImage the name of the new image.
   * @throws IllegalArgumentException if model or controller is null.
   */
  public VerticalFlip(String image, ImageProcessingModel model,
                      ImageProcessingController controller, String newImage) {
    super(image, model, controller, newImage);
  }

  /**
   * Constructs a {@code VerticalFlip} through the given model and view.
   * @param model the given model.
   * @param view the given gui view.
   * @throws IllegalArgumentException if model or view is null.
   */
  public VerticalFlip(ImageProcessingModel model,
                      ImageProcessingViewGUI view) {
    super(model, view);
  }

  /**
   * A factory method that does the specific command by calling the extended class.
   *
   * @param model the ImageProcessingModel to perform the command on
   * @return a new ImageProcessingModel
   */
  @Override
  public ImageModel doCommand(ImageModel model) throws IOException {
    if (view == null) {
      controller.printMessage(newImage + " created by vertically flipping " + image + ".");
    }
    if (controller == null) {
      view.renderMessage(newImage + " created by vertically flipping " + image + ".");
    }

    return model.flipVertical();
  }
}
