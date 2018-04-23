package tanvir.multiplexer.ModelClass;

public class Porashuna {

    String contentTitle , contentType , contentDescription , imageUrl;

    public Porashuna(String contentTitle, String contentType, String contentDescription, String imageUrl) {
        this.contentTitle = contentTitle;
        this.contentType = contentType;
        this.contentDescription = contentDescription;
        this.imageUrl = imageUrl;
    }

    public String getContentTitle() {
        return contentTitle;
    }

    public String getContentType() {
        return contentType;
    }

    public String getContentDescription() {
        return contentDescription;
    }

    public String getImageUrl() {
        return imageUrl;
    }
}
