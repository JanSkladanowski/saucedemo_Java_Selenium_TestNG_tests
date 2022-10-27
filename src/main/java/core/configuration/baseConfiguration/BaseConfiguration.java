package core.configuration.baseConfiguration;

public abstract class BaseConfiguration {

	protected String protocol;
    protected String url;
    protected String userLogin;
    protected String userPassword;
    protected String screenshotFileType;
    protected String screenshotPath;

    public String getProtocol() {return protocol;}

    public String getUrl() {return url;}

    public String getUserLogin() {
        return userLogin;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public String getScreenshotFileType() {
        return screenshotFileType;
    }

    public String getScreenshotPath() {
        return screenshotPath;
    }
}
