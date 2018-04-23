package tanvir.multiplexer.ModelClass;

public class Kheladhula_Cricket {

    String contentTitle , contentDescription , contentType , imageUrl , publishedAt;

    public Kheladhula_Cricket(String contentTitle, String contentType, String publishedAt, String contentDescription, String imageUrl) {
        this.contentTitle = contentTitle;
        this.contentDescription = contentDescription;
        this.contentType = contentType;
        this.imageUrl = imageUrl;
        this.publishedAt = publishedAt;
    }

    public String getContentTitle() {
        return contentTitle;
    }

    public String getContentDescription() {
        return contentDescription;
    }

    public String getContentType() {
        return contentType;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public String getPublishedAt() {
        return publishedAt;
    }
}
