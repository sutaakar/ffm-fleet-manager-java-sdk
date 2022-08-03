/*
 * Account Management Service API
 * Manage user subscriptions and clusters
 *
 * The version of the OpenAPI document: 0.0.1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package dev.bf2.ffm.ams.client.models;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import dev.bf2.ffm.ams.client.models.RegistryRequest;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * RegistryCreateRequest
 */
@JsonPropertyOrder({
  RegistryCreateRequest.JSON_PROPERTY_CLOUD_ALIAS,
  RegistryCreateRequest.JSON_PROPERTY_NAME,
  RegistryCreateRequest.JSON_PROPERTY_ORG_NAME,
  RegistryCreateRequest.JSON_PROPERTY_TEAM_NAME,
  RegistryCreateRequest.JSON_PROPERTY_TYPE,
  RegistryCreateRequest.JSON_PROPERTY_URL
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class RegistryCreateRequest {
  public static final String JSON_PROPERTY_CLOUD_ALIAS = "cloudAlias";
  private Boolean cloudAlias;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_ORG_NAME = "org_name";
  private String orgName;

  public static final String JSON_PROPERTY_TEAM_NAME = "team_name";
  private String teamName;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public static final String JSON_PROPERTY_URL = "url";
  private String url;

  public RegistryCreateRequest() { 
  }

  public RegistryCreateRequest cloudAlias(Boolean cloudAlias) {
    this.cloudAlias = cloudAlias;
    return this;
  }

   /**
   * Get cloudAlias
   * @return cloudAlias
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CLOUD_ALIAS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getCloudAlias() {
    return cloudAlias;
  }


  @JsonProperty(JSON_PROPERTY_CLOUD_ALIAS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCloudAlias(Boolean cloudAlias) {
    this.cloudAlias = cloudAlias;
  }


  public RegistryCreateRequest name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setName(String name) {
    this.name = name;
  }


  public RegistryCreateRequest orgName(String orgName) {
    this.orgName = orgName;
    return this;
  }

   /**
   * Get orgName
   * @return orgName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ORG_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getOrgName() {
    return orgName;
  }


  @JsonProperty(JSON_PROPERTY_ORG_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOrgName(String orgName) {
    this.orgName = orgName;
  }


  public RegistryCreateRequest teamName(String teamName) {
    this.teamName = teamName;
    return this;
  }

   /**
   * Get teamName
   * @return teamName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TEAM_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTeamName() {
    return teamName;
  }


  @JsonProperty(JSON_PROPERTY_TEAM_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTeamName(String teamName) {
    this.teamName = teamName;
  }


  public RegistryCreateRequest type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setType(String type) {
    this.type = type;
  }


  public RegistryCreateRequest url(String url) {
    this.url = url;
    return this;
  }

   /**
   * Get url
   * @return url
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getUrl() {
    return url;
  }


  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setUrl(String url) {
    this.url = url;
  }


  /**
   * Return true if this RegistryCreateRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RegistryCreateRequest registryCreateRequest = (RegistryCreateRequest) o;
    return Objects.equals(this.cloudAlias, registryCreateRequest.cloudAlias) &&
        Objects.equals(this.name, registryCreateRequest.name) &&
        Objects.equals(this.orgName, registryCreateRequest.orgName) &&
        Objects.equals(this.teamName, registryCreateRequest.teamName) &&
        Objects.equals(this.type, registryCreateRequest.type) &&
        Objects.equals(this.url, registryCreateRequest.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cloudAlias, name, orgName, teamName, type, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RegistryCreateRequest {\n");
    sb.append("    cloudAlias: ").append(toIndentedString(cloudAlias)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    orgName: ").append(toIndentedString(orgName)).append("\n");
    sb.append("    teamName: ").append(toIndentedString(teamName)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
