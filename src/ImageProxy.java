public class ImageProxy implements  Image {
    private HighResolutionImage highResolutionImage;


    public ImageProxy(HighResolutionImage highResolutionImage){
        this.highResolutionImage=highResolutionImage;
    }
    @Override
    public void showImage() {
        while (!highResolutionImage.isLoad()){
            try {
                System.out.println("Temp Image: "+ highResolutionImage);
                Thread.sleep(100);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        highResolutionImage.showImage();
    }
}