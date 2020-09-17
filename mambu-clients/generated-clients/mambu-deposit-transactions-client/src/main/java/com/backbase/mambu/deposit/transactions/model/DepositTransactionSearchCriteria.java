/*
 * deposits/transactions
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v2
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.backbase.mambu.deposit.transactions.model;

import java.util.Objects;
import java.util.Arrays;
import com.backbase.mambu.deposit.transactions.model.DepositTransactionFilterCriteria;
import com.backbase.mambu.deposit.transactions.model.DepositTransactionSortingCriteria;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Wrapper that holds a list of filtering criteria and a sorting criteria for Deposit transaction client directed query
 */
@ApiModel(description = "Wrapper that holds a list of filtering criteria and a sorting criteria for Deposit transaction client directed query")
@JsonPropertyOrder({
  DepositTransactionSearchCriteria.JSON_PROPERTY_SORTING_CRITERIA,
  DepositTransactionSearchCriteria.JSON_PROPERTY_FILTER_CRITERIA
})

public class DepositTransactionSearchCriteria {
  public static final String JSON_PROPERTY_SORTING_CRITERIA = "sortingCriteria";
  private DepositTransactionSortingCriteria sortingCriteria;

  public static final String JSON_PROPERTY_FILTER_CRITERIA = "filterCriteria";
  private List<DepositTransactionFilterCriteria> filterCriteria = null;


  public DepositTransactionSearchCriteria sortingCriteria(DepositTransactionSortingCriteria sortingCriteria) {
    
    this.sortingCriteria = sortingCriteria;
    return this;
  }

   /**
   * Get sortingCriteria
   * @return sortingCriteria
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SORTING_CRITERIA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DepositTransactionSortingCriteria getSortingCriteria() {
    return sortingCriteria;
  }


  public void setSortingCriteria(DepositTransactionSortingCriteria sortingCriteria) {
    this.sortingCriteria = sortingCriteria;
  }


  public DepositTransactionSearchCriteria filterCriteria(List<DepositTransactionFilterCriteria> filterCriteria) {
    
    this.filterCriteria = filterCriteria;
    return this;
  }

  public DepositTransactionSearchCriteria addFilterCriteriaItem(DepositTransactionFilterCriteria filterCriteriaItem) {
    if (this.filterCriteria == null) {
      this.filterCriteria = new ArrayList<>();
    }
    this.filterCriteria.add(filterCriteriaItem);
    return this;
  }

   /**
   * The list of filtering criteria
   * @return filterCriteria
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The list of filtering criteria")
  @JsonProperty(JSON_PROPERTY_FILTER_CRITERIA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<DepositTransactionFilterCriteria> getFilterCriteria() {
    return filterCriteria;
  }


  public void setFilterCriteria(List<DepositTransactionFilterCriteria> filterCriteria) {
    this.filterCriteria = filterCriteria;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DepositTransactionSearchCriteria depositTransactionSearchCriteria = (DepositTransactionSearchCriteria) o;
    return Objects.equals(this.sortingCriteria, depositTransactionSearchCriteria.sortingCriteria) &&
        Objects.equals(this.filterCriteria, depositTransactionSearchCriteria.filterCriteria);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sortingCriteria, filterCriteria);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DepositTransactionSearchCriteria {\n");
    sb.append("    sortingCriteria: ").append(toIndentedString(sortingCriteria)).append("\n");
    sb.append("    filterCriteria: ").append(toIndentedString(filterCriteria)).append("\n");
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
