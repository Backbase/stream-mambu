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
import com.backbase.mambu.clients.model.Document;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * An Id document represents a document that can be used to identify a person like a passport, a drivers license an id card etc.
 */
@ApiModel(description = "An Id document represents a document that can be used to identify a person like a passport, a drivers license an id card etc.")
@JsonPropertyOrder({
  IdentificationDocument.JSON_PROPERTY_IDENTIFICATION_DOCUMENT_TEMPLATE_KEY,
  IdentificationDocument.JSON_PROPERTY_ISSUING_AUTHORITY,
  IdentificationDocument.JSON_PROPERTY_ATTACHMENTS,
  IdentificationDocument.JSON_PROPERTY_CLIENT_KEY,
  IdentificationDocument.JSON_PROPERTY_DOCUMENT_TYPE,
  IdentificationDocument.JSON_PROPERTY_INDEX_IN_LIST,
  IdentificationDocument.JSON_PROPERTY_VALID_UNTIL,
  IdentificationDocument.JSON_PROPERTY_ENCODED_KEY,
  IdentificationDocument.JSON_PROPERTY_DOCUMENT_ID
})

public class IdentificationDocument {
  public static final String JSON_PROPERTY_IDENTIFICATION_DOCUMENT_TEMPLATE_KEY = "identificationDocumentTemplateKey";
  private String identificationDocumentTemplateKey;

  public static final String JSON_PROPERTY_ISSUING_AUTHORITY = "issuingAuthority";
  private String issuingAuthority;

  public static final String JSON_PROPERTY_ATTACHMENTS = "attachments";
  private List<Document> attachments = null;

  public static final String JSON_PROPERTY_CLIENT_KEY = "clientKey";
  private String clientKey;

  public static final String JSON_PROPERTY_DOCUMENT_TYPE = "documentType";
  private String documentType;

  public static final String JSON_PROPERTY_INDEX_IN_LIST = "indexInList";
  private Integer indexInList;

  public static final String JSON_PROPERTY_VALID_UNTIL = "validUntil";
  private LocalDate validUntil;

  public static final String JSON_PROPERTY_ENCODED_KEY = "encodedKey";
  private String encodedKey;

  public static final String JSON_PROPERTY_DOCUMENT_ID = "documentId";
  private String documentId;


  public IdentificationDocument identificationDocumentTemplateKey(String identificationDocumentTemplateKey) {
    
    this.identificationDocumentTemplateKey = identificationDocumentTemplateKey;
    return this;
  }

   /**
   * Encoded key of the template used for this document
   * @return identificationDocumentTemplateKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Encoded key of the template used for this document")
  @JsonProperty(JSON_PROPERTY_IDENTIFICATION_DOCUMENT_TEMPLATE_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getIdentificationDocumentTemplateKey() {
    return identificationDocumentTemplateKey;
  }


  public void setIdentificationDocumentTemplateKey(String identificationDocumentTemplateKey) {
    this.identificationDocumentTemplateKey = identificationDocumentTemplateKey;
  }


  public IdentificationDocument issuingAuthority(String issuingAuthority) {
    
    this.issuingAuthority = issuingAuthority;
    return this;
  }

   /**
   * Authority that issued the document, eg. Police
   * @return issuingAuthority
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Authority that issued the document, eg. Police")
  @JsonProperty(JSON_PROPERTY_ISSUING_AUTHORITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getIssuingAuthority() {
    return issuingAuthority;
  }


  public void setIssuingAuthority(String issuingAuthority) {
    this.issuingAuthority = issuingAuthority;
  }


  public IdentificationDocument attachments(List<Document> attachments) {
    
    this.attachments = attachments;
    return this;
  }

  public IdentificationDocument addAttachmentsItem(Document attachmentsItem) {
    if (this.attachments == null) {
      this.attachments = new ArrayList<>();
    }
    this.attachments.add(attachmentsItem);
    return this;
  }

   /**
   * A list containing information about the attached files for this document
   * @return attachments
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list containing information about the attached files for this document")
  @JsonProperty(JSON_PROPERTY_ATTACHMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Document> getAttachments() {
    return attachments;
  }


  public void setAttachments(List<Document> attachments) {
    this.attachments = attachments;
  }


   /**
   * The encoded key of the client that owns this document
   * @return clientKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The encoded key of the client that owns this document")
  @JsonProperty(JSON_PROPERTY_CLIENT_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getClientKey() {
    return clientKey;
  }




  public IdentificationDocument documentType(String documentType) {
    
    this.documentType = documentType;
    return this;
  }

   /**
   * The type of the document, Passport, Id card Drivers license, etc.
   * @return documentType
  **/
  @ApiModelProperty(required = true, value = "The type of the document, Passport, Id card Drivers license, etc.")
  @JsonProperty(JSON_PROPERTY_DOCUMENT_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getDocumentType() {
    return documentType;
  }


  public void setDocumentType(String documentType) {
    this.documentType = documentType;
  }


  public IdentificationDocument indexInList(Integer indexInList) {
    
    this.indexInList = indexInList;
    return this;
  }

   /**
   * This document&#39;s index in the list of documents
   * @return indexInList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "This document's index in the list of documents")
  @JsonProperty(JSON_PROPERTY_INDEX_IN_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getIndexInList() {
    return indexInList;
  }


  public void setIndexInList(Integer indexInList) {
    this.indexInList = indexInList;
  }


  public IdentificationDocument validUntil(LocalDate validUntil) {
    
    this.validUntil = validUntil;
    return this;
  }

   /**
   * Date when the validity of the document ends
   * @return validUntil
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Sun Apr 26 02:00:00 CEST 1987", value = "Date when the validity of the document ends")
  @JsonProperty(JSON_PROPERTY_VALID_UNTIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public LocalDate getValidUntil() {
    return validUntil;
  }


  public void setValidUntil(LocalDate validUntil) {
    this.validUntil = validUntil;
  }


   /**
   * The encoded key of the document, generated, unique
   * @return encodedKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The encoded key of the document, generated, unique")
  @JsonProperty(JSON_PROPERTY_ENCODED_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEncodedKey() {
    return encodedKey;
  }




  public IdentificationDocument documentId(String documentId) {
    
    this.documentId = documentId;
    return this;
  }

   /**
   * The id of the document
   * @return documentId
  **/
  @ApiModelProperty(required = true, value = "The id of the document")
  @JsonProperty(JSON_PROPERTY_DOCUMENT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getDocumentId() {
    return documentId;
  }


  public void setDocumentId(String documentId) {
    this.documentId = documentId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IdentificationDocument identificationDocument = (IdentificationDocument) o;
    return Objects.equals(this.identificationDocumentTemplateKey, identificationDocument.identificationDocumentTemplateKey) &&
        Objects.equals(this.issuingAuthority, identificationDocument.issuingAuthority) &&
        Objects.equals(this.attachments, identificationDocument.attachments) &&
        Objects.equals(this.clientKey, identificationDocument.clientKey) &&
        Objects.equals(this.documentType, identificationDocument.documentType) &&
        Objects.equals(this.indexInList, identificationDocument.indexInList) &&
        Objects.equals(this.validUntil, identificationDocument.validUntil) &&
        Objects.equals(this.encodedKey, identificationDocument.encodedKey) &&
        Objects.equals(this.documentId, identificationDocument.documentId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(identificationDocumentTemplateKey, issuingAuthority, attachments, clientKey, documentType, indexInList, validUntil, encodedKey, documentId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IdentificationDocument {\n");
    sb.append("    identificationDocumentTemplateKey: ").append(toIndentedString(identificationDocumentTemplateKey)).append("\n");
    sb.append("    issuingAuthority: ").append(toIndentedString(issuingAuthority)).append("\n");
    sb.append("    attachments: ").append(toIndentedString(attachments)).append("\n");
    sb.append("    clientKey: ").append(toIndentedString(clientKey)).append("\n");
    sb.append("    documentType: ").append(toIndentedString(documentType)).append("\n");
    sb.append("    indexInList: ").append(toIndentedString(indexInList)).append("\n");
    sb.append("    validUntil: ").append(toIndentedString(validUntil)).append("\n");
    sb.append("    encodedKey: ").append(toIndentedString(encodedKey)).append("\n");
    sb.append("    documentId: ").append(toIndentedString(documentId)).append("\n");
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

