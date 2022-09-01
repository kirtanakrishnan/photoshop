package controller.commands;

import java.io.IOException;
import java.util.Map;

import controller.ImageGUIController;
import controller.ImageProcessingController;
import model.ImageModel;
import model.ImageProcessingModel;
import view.ImageProcessingViewGUI;

/**
 * Represents the abstract class for the different commands the controller can handle.
 */
abstract public class AbstractCommand implements ImageProcessingCommand {
  protected ImageProcessingModel model;
  protected ImageProcessingViewGUI view;

  protected String image;
  protected ImageProcessingController controller;
  protected String newImage;

  /**
   * Constructs a {@code AbstractCommand} through the given image, model, controller, and
   * newImage.
   * @param image the name of the image.
   * @param model the given model.
   * @param controller the given controller.
   * @param newImage the name of the new image.
   * @throws IllegalArgumentException if model or controller is null.
   */
  public AbstractCommand(String image, ImageProcessingModel model,
                         ImageProcessingController controller, String newImage) {
    if (model == null) {
      throw new IllegalArgumentException("Model cannot be null.");
    }
    if (controller == null) {
      throw new IllegalArgumentException("Controller cannot be null.");
    }

    this.image = image;
    this.newImage = newImage;

    this.model = model;
    this.controller = controller;
  }


  /**
   * Constructs a {@code AbstractCommand} through the given model and view.
   * @param model the given model.
   * @param view the given gui view.
   * @throws IllegalArgumentException if model or view is null.
   */
  public AbstractCommand(ImageProcessingModel model,
                         ImageProcessingViewGUI view) {
    if (model == null) {
      throw new IllegalArgumentException("Model cannot be null.");
    }
    if (view == null) {
      throw new IllegalArgumentException("View cannot be null.");
    }
    this.model = model;
    this.view = view;
    this.image = "image";
    this.newImage = "image";
  }

  /**
   * Performs the command and stores the new image in the hashmap.
   */
  @Override
  public void execute() throws IOException {
    Map<String, ImageModel> images = model.getImages();
    ImageModel model = images.get(image);
    if (model == null && view == null) {
      controller.renderError("This image does not exist.");
    }
    ImageModel modifiedModel = null;
    if (model != null) {
      modifiedModel = doCommand(model);
    }
    images.put(newImage, modifiedModel);
  }

  /**
   * A factory method that does the specific command by calling the extended class.
   *
   * @param model   the ImageProcessingModel to perform the command on
   * @return a new ImageProcessingModel
   */
  abstract protected ImageModel doCommand(ImageModel model) throws IOException;
}
