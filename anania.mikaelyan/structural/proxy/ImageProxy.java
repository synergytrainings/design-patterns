package com.synisys.training.patterns.structural.proxy;

/**
 * @author Anania.Mikaelyan
 * @since 12/2/2014
 */
public class ImageProxy implements Image{
    /**
     * Private Proxy data
     */
    private String imageFilePath;

    /**
     * Reference to RealSubject
     */
    private Image proxifiedImage;


    public ImageProxy(String imageFilePath) {
        this.imageFilePath= imageFilePath;
    }

    @Override
    public void showImage() {
        // create the Image Object only when the image is required to be shown
        proxifiedImage = new HighResolutionImage(imageFilePath);
        // now call showImage on realSubject
        proxifiedImage.showImage();

    }
}
