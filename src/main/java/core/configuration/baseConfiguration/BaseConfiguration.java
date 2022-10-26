package core.configuration.baseConfiguration;

public abstract class BaseConfiguration {

	protected String protocol;
    protected String url;
    protected String userLogin;
    protected String userPassword;

    public String getProtocol() {return protocol;}

    public String getUrl() {return url;}

    public String getUserLogin() {
        return userLogin;
    }

    public String getUserPassword() {
        return userPassword;
    }

}
