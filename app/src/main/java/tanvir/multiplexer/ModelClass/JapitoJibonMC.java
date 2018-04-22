package tanvir.multiplexer.ModelClass;

public class JapitoJibonMC {

    private String contentTitle;
    private String contentUrl;
    private String contentType;

    public JapitoJibonMC(String contentTitle, String contentUrl, String contentType) {
        this.contentTitle = contentTitle;
        this.contentUrl = contentUrl;
        this.contentType = contentType;
    }

    public String getContentTitle() {
        return contentTitle;
    }

    public void setContentTitle(String contentTitle) {
        this.contentTitle = contentTitle;
    }

    public String getContentUrl() {
        return contentUrl;
    }

    public void setContentUrl(String contentUrl) {
        this.contentUrl = contentUrl;
    }

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }
}
