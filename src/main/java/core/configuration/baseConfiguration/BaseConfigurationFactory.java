package core.configuration.baseConfiguration;

import configuration.base.DefaultBaseConfiguration;

public class BaseConfigurationFactory {
    public static BaseConfiguration getConfiguration(){
        return new DefaultBaseConfiguration();
    }
}
