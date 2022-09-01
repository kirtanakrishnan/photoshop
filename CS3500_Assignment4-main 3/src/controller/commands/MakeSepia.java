package controller.commands;

import java.io.IOException;

import controller.ImageGUIController;
import controller.ImageProcessingController;
import model.ImageModel;
import model.ImageProcessingModel;
import view.ImageProcessingViewGUI;

/**
 * Represents the makesepia class which helps create an image manipulated through the
 * sepia filter.
 */
public class MakeSepia extends AbstractCommand {

  /**
   * Constructs a {@code MakeSepia} through the given image, model, controller, and
   * newImage.
   * @param image the name of the image.
   * @param model the given model.
   * @param controller the given controller.
   * @param newImage the name of the new image.
   * @throws IllegalArgumentException if model or controller is null.
   */
  public MakeSepia(String image, ImageProcessingModel model,
                   ImageProcessingController controller, String newImage) {
    super(image, model, controller, newImage);
  }

  /**
   * Constructs a {@code MakeSepia} through the given model and view.
   * @param model the given model.
   * @param view the given gui view.
   * @throws IllegalArgumentException if model or view is null.
   */
  public MakeSepia(ImageProcessingModel model,
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
      controller.printMessage(newImage + " created through greyscale of " + image + ".");
    }
    if (controller == null) {
      view.renderMessage(newImage + " created through sepia filter of " + image + ".");
    }

    return model.setSepia();
  }
}
