public class ImageGalleryDemo {

    public static void main(String[] args) {
        ImageGallery gallery = new ImageGallery();
        gallery.setResolution(Resolution.Medium);
        Image image = gallery.getImage("image1");

        image.Draw(768,435);
    }
}
