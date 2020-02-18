package com.infra.dev.infradevaccess.config.beans;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix="swagger.document")
public class SwaggerProperty {
    
    private DocketProp docketProp = new DocketProp();

    private ApiInfoProp apiInfoProp = new ApiInfoProp();

    /**
     * @return DocketProp return the docketProp
     */
    public DocketProp getDocketProp() {
        return docketProp;
    }

    /**
     * @param docketProp the docketProp to set
     */
    public void setDocketProp(DocketProp docketProp) {
        this.docketProp = docketProp;
    }

    /**
     * @return ApiInfoProp return the apiInfoProp
     */
    public ApiInfoProp getApiInfoProp() {
        return apiInfoProp;
    }

    /**
     * @param apiInfoProp the apiInfoProp to set
     */
    public void setApiInfoProp(ApiInfoProp apiInfoProp) {
        this.apiInfoProp = apiInfoProp;
    }

    public static class DocketProp{

        private String groupName;

        private String apisPackages;

        private String apiPath;

        private String pathMapping;

        
    


    /**
     * @return String return the groupName
     */
    public String getGroupName() {
        return groupName;
    }

    /**
     * @param groupName the groupName to set
     */
    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    /**
     * @return String return the apisPackages
     */
    public String getApisPackages() {
        return apisPackages;
    }

    /**
     * @param apisPackages the apisPackages to set
     */
    public void setApisPackages(String apisPackages) {
        this.apisPackages = apisPackages;
    }

    /**
     * @return String return the apiPath
     */
    public String getApiPath() {
        return apiPath;
    }

    /**
     * @param apiPath the apiPath to set
     */
    public void setApiPath(String apiPath) {
        this.apiPath = apiPath;
    }

    /**
     * @return String return the pathMapping
     */
    public String getPathMapping() {
        return pathMapping;
    }

    /**
     * @param pathMapping the pathMapping to set
     */
    public void setPathMapping(String pathMapping) {
        this.pathMapping = pathMapping;
    }

}

public static class ApiInfoProp{

    private String title;

    private String desc;

    private String version;
   

    /**
     * @return String return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return String return the desc
     */
    public String getDesc() {
        return desc;
    }

    /**
     * @param desc the desc to set
     */
    public void setDesc(String desc) {
        this.desc = desc;
    }

    /**
     * @return String return the version
     */
    public String getVersion() {
        return version;
    }

    /**
     * @param version the version to set
     */
    public void setVersion(String version) {
        this.version = version;
    }

}
}