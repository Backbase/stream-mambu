/*
 * clients
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v2
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.backbase.mambu.clients.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Address Data Transfer Object
 */
@ApiModel(description = "Address Data Transfer Object")
@JsonPropertyOrder({
  Address.JSON_PROPERTY_COUNTRY,
  Address.JSON_PROPERTY_PARENT_KEY,
  Address.JSON_PROPERTY_CITY,
  Address.JSON_PROPERTY_LATITUDE,
  Address.JSON_PROPERTY_POSTCODE,
  Address.JSON_PROPERTY_INDEX_IN_LIST,
  Address.JSON_PROPERTY_ENCODED_KEY,
  Address.JSON_PROPERTY_REGION,
  Address.JSON_PROPERTY_LINE2,
  Address.JSON_PROPERTY_LINE1,
  Address.JSON_PROPERTY_LONGITUDE
})

public class Address {
  public static final String JSON_PROPERTY_COUNTRY = "country";
  private String country;

  public static final String JSON_PROPERTY_PARENT_KEY = "parentKey";
  private String parentKey;

  public static final String JSON_PROPERTY_CITY = "city";
  private String city;

  public static final String JSON_PROPERTY_LATITUDE = "latitude";
  private BigDecimal latitude;

  public static final String JSON_PROPERTY_POSTCODE = "postcode";
  private String postcode;

  public static final String JSON_PROPERTY_INDEX_IN_LIST = "indexInList";
  private Integer indexInList;

  public static final String JSON_PROPERTY_ENCODED_KEY = "encodedKey";
  private String encodedKey;

  public static final String JSON_PROPERTY_REGION = "region";
  private String region;

  public static final String JSON_PROPERTY_LINE2 = "line2";
  private String line2;

  public static final String JSON_PROPERTY_LINE1 = "line1";
  private String line1;

  public static final String JSON_PROPERTY_LONGITUDE = "longitude";
  private BigDecimal longitude;


  public Address country(String country) {
    
    this.country = country;
    return this;
  }

   /**
   * The country
   * @return country
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The country")
  @JsonProperty(JSON_PROPERTY_COUNTRY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCountry() {
    return country;
  }


  public void setCountry(String country) {
    this.country = country;
  }


   /**
   * Address parent key, the object owning this address, client, centre, branch
   * @return parentKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Address parent key, the object owning this address, client, centre, branch")
  @JsonProperty(JSON_PROPERTY_PARENT_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getParentKey() {
    return parentKey;
  }




  public Address city(String city) {
    
    this.city = city;
    return this;
  }

   /**
   * The city for this address
   * @return city
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The city for this address")
  @JsonProperty(JSON_PROPERTY_CITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCity() {
    return city;
  }


  public void setCity(String city) {
    this.city = city;
  }


  public Address latitude(BigDecimal latitude) {
    
    this.latitude = latitude;
    return this;
  }

   /**
   * The GPS latitude of this address in signed degrees format (DDD.dddd) with 6 decimal positions, ranging from -90 to +90
   * @return latitude
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The GPS latitude of this address in signed degrees format (DDD.dddd) with 6 decimal positions, ranging from -90 to +90")
  @JsonProperty(JSON_PROPERTY_LATITUDE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getLatitude() {
    return latitude;
  }


  public void setLatitude(BigDecimal latitude) {
    this.latitude = latitude;
  }


  public Address postcode(String postcode) {
    
    this.postcode = postcode;
    return this;
  }

   /**
   * The post code
   * @return postcode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The post code")
  @JsonProperty(JSON_PROPERTY_POSTCODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPostcode() {
    return postcode;
  }


  public void setPostcode(String postcode) {
    this.postcode = postcode;
  }


  public Address indexInList(Integer indexInList) {
    
    this.indexInList = indexInList;
    return this;
  }

   /**
   * Index of this address in the list of addresses
   * @return indexInList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Index of this address in the list of addresses")
  @JsonProperty(JSON_PROPERTY_INDEX_IN_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getIndexInList() {
    return indexInList;
  }


  public void setIndexInList(Integer indexInList) {
    this.indexInList = indexInList;
  }


   /**
   * Address encoded key, unique, generated
   * @return encodedKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Address encoded key, unique, generated")
  @JsonProperty(JSON_PROPERTY_ENCODED_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEncodedKey() {
    return encodedKey;
  }




  public Address region(String region) {
    
    this.region = region;
    return this;
  }

   /**
   * The region that is part of the address
   * @return region
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The region that is part of the address")
  @JsonProperty(JSON_PROPERTY_REGION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRegion() {
    return region;
  }


  public void setRegion(String region) {
    this.region = region;
  }


  public Address line2(String line2) {
    
    this.line2 = line2;
    return this;
  }

   /**
   * The second line for the address, in case the first one doesn&#39;t fit the information, this is completely optional
   * @return line2
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The second line for the address, in case the first one doesn't fit the information, this is completely optional")
  @JsonProperty(JSON_PROPERTY_LINE2)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLine2() {
    return line2;
  }


  public void setLine2(String line2) {
    this.line2 = line2;
  }


  public Address line1(String line1) {
    
    this.line1 = line1;
    return this;
  }

   /**
   * The first line of the address
   * @return line1
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The first line of the address")
  @JsonProperty(JSON_PROPERTY_LINE1)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLine1() {
    return line1;
  }


  public void setLine1(String line1) {
    this.line1 = line1;
  }


  public Address longitude(BigDecimal longitude) {
    
    this.longitude = longitude;
    return this;
  }

   /**
   * The GPS longitude of this address in signed degrees format (DDD.dddd) with 6 decimal positions, ranging from -180 to +180
   * @return longitude
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The GPS longitude of this address in signed degrees format (DDD.dddd) with 6 decimal positions, ranging from -180 to +180")
  @JsonProperty(JSON_PROPERTY_LONGITUDE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getLongitude() {
    return longitude;
  }


  public void setLongitude(BigDecimal longitude) {
    this.longitude = longitude;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Address address = (Address) o;
    return Objects.equals(this.country, address.country) &&
        Objects.equals(this.parentKey, address.parentKey) &&
        Objects.equals(this.city, address.city) &&
        Objects.equals(this.latitude, address.latitude) &&
        Objects.equals(this.postcode, address.postcode) &&
        Objects.equals(this.indexInList, address.indexInList) &&
        Objects.equals(this.encodedKey, address.encodedKey) &&
        Objects.equals(this.region, address.region) &&
        Objects.equals(this.line2, address.line2) &&
        Objects.equals(this.line1, address.line1) &&
        Objects.equals(this.longitude, address.longitude);
  }

  @Override
  public int hashCode() {
    return Objects.hash(country, parentKey, city, latitude, postcode, indexInList, encodedKey, region, line2, line1, longitude);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Address {\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    parentKey: ").append(toIndentedString(parentKey)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    postcode: ").append(toIndentedString(postcode)).append("\n");
    sb.append("    indexInList: ").append(toIndentedString(indexInList)).append("\n");
    sb.append("    encodedKey: ").append(toIndentedString(encodedKey)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    line2: ").append(toIndentedString(line2)).append("\n");
    sb.append("    line1: ").append(toIndentedString(line1)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
