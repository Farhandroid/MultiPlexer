package tanvir.multiplexer.ModelClass;

public class ShikkhaSohaYika {

    String contentType, contentUrl, contentTitle, imageURL;


    public ShikkhaSohaYika(String contentType, String contentUrl, String contentTitle, String imageURL) {
        this.contentType = contentType;
        this.contentUrl = contentUrl;
        this.contentTitle=contentTitle;
        this.imageURL = imageURL;
    }

    public String getContentType() {
        return contentType;
    }

    public String getContentUrl() {
        return contentUrl;
    }

    public String getContentTitle() {
        return contentTitle;
    }

    public String getImageURL() {
        return imageURL;
    }
}
