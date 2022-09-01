package model;

import java.util.HashMap;
import java.util.Map;

/**
 * ImageProcessingModelImpl is an implementation of ImagePracessingModel that has a
 * hashmap of images. It implements all its inherited methods.
 */
public class ImageProcessingModelImpl implements ImageProcessingModel {

  private Map<String, ImageModel> images = new HashMap<>();

  /**
   * Returns hashmap of images.
   * @return the hashmap of images.
   */
  @Override
  public Map<String, ImageModel> getImages() {
    return this.images;
  }
}
