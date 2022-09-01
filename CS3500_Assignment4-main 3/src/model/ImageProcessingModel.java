package model;

import java.util.Map;

/**
 * Represents the interface for the ImageProcessingModel, which represents a hashmap of images and
 * provides a means to get the images.
 */
public interface ImageProcessingModel {

  /**
   * Returns hashmap of images.
   * @return the hashmap of images.
   */
  Map<String, ImageModel> getImages();
}
