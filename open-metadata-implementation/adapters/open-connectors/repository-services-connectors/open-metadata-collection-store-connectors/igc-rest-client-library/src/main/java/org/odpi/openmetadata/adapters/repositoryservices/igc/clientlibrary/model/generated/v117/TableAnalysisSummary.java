/* SPDX-License-Identifier: Apache-2.0 */
/* Copyright Contributors to the ODPi Egeria project. */
package org.odpi.openmetadata.adapters.repositoryservices.igc.clientlibrary.model.generated.v117;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.odpi.openmetadata.adapters.repositoryservices.igc.clientlibrary.model.common.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Date;
import java.util.ArrayList;

/**
 * POJO for the 'table_analysis_summary' asset type in IGC, displayed as 'Table Analysis Summary' in the IGC UI.
 * <br><br>
 * (this code has been generated based on out-of-the-box IGC metadata types;
 *  if modifications are needed, eg. to handle custom attributes,
 *  extending from this class in your own custom class is the best approach.)
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class TableAnalysisSummary extends Reference {

    public static String getIgcTypeId() { return "table_analysis_summary"; }

    /**
     * The 'short_&amp;_long_description' property, displayed as 'Short &amp; Long Description' in the IGC UI.
     */
    @JsonProperty("short_&_long_description") protected String short___long_description;

    /**
     * The 'short_description' property, displayed as 'Short Description' in the IGC UI.
     */
    protected String short_description;

    /**
     * The 'long_description' property, displayed as 'Long Description' in the IGC UI.
     */
    protected String long_description;

    /**
     * The 'assigned_to_terms' property, displayed as 'Assigned to Terms' in the IGC UI.
     * <br><br>
     * Will be a {@link ReferenceList} of {@link Term} objects.
     */
    protected ReferenceList assigned_to_terms;

    /**
     * The 'steward' property, displayed as 'Steward' in the IGC UI.
     * <br><br>
     * Will be a {@link ReferenceList} of {@link Steward} objects.
     */
    protected ReferenceList steward;

    /**
     * The 'analyzed_table' property, displayed as 'Analyzed Table' in the IGC UI.
     * <br><br>
     * Will be a single {@link Reference} to a {@link Datagroup} object.
     */
    protected Reference analyzed_table;

    /**
     * The 'project_name' property, displayed as 'Analysis Project' in the IGC UI.
     */
    protected String project_name;

    /**
     * The 'review_date' property, displayed as 'Review Date' in the IGC UI.
     */
    protected Date review_date;

    /**
     * The 'promoted_by_principal' property, displayed as 'Promoted By Principal' in the IGC UI.
     * <br><br>
     * Will be a single {@link Reference} to a {@link Steward} object.
     */
    protected Reference promoted_by_principal;

    /**
     * The 'reviewed_by_principal' property, displayed as 'Reviewed By Principal' in the IGC UI.
     * <br><br>
     * Will be a single {@link Reference} to a {@link Steward} object.
     */
    protected Reference reviewed_by_principal;

    /**
     * The 'created_by' property, displayed as 'Created By' in the IGC UI.
     */
    protected String created_by;

    /**
     * The 'created_on' property, displayed as 'Created On' in the IGC UI.
     */
    protected Date created_on;

    /**
     * The 'modified_by' property, displayed as 'Modified By' in the IGC UI.
     */
    protected String modified_by;

    /**
     * The 'modified_on' property, displayed as 'Modified On' in the IGC UI.
     */
    protected Date modified_on;

    /**
     * The 'number_of_fields' property, displayed as 'Number of Fields' in the IGC UI.
     */
    protected Number number_of_fields;

    /**
     * The 'number_of_rows' property, displayed as 'Number of Rows' in the IGC UI.
     */
    protected Number number_of_rows;

    /**
     * The 'inferred_primary_keys' property, displayed as 'Inferred Primary Keys' in the IGC UI.
     */
    protected String inferred_primary_keys;

    /**
     * The 'primary_key_duplicates' property, displayed as 'Primary Key Duplicates' in the IGC UI.
     */
    protected Number primary_key_duplicates;

    /**
     * The 'inferred_foreign_keys' property, displayed as 'Inferred Foreign Keys' in the IGC UI.
     */
    protected String inferred_foreign_keys;

    /**
     * The 'foreign_key_violations' property, displayed as 'Foreign Key Violations' in the IGC UI.
     */
    protected Number foreign_key_violations;


    /** @see #short___long_description */ @JsonProperty("short_&_long_description")  public String getShortLongDescription() { return this.short___long_description; }
    /** @see #short___long_description */ @JsonProperty("short_&_long_description")  public void setShortLongDescription(String short___long_description) { this.short___long_description = short___long_description; }

    /** @see #short_description */ @JsonProperty("short_description")  public String getShortDescription() { return this.short_description; }
    /** @see #short_description */ @JsonProperty("short_description")  public void setShortDescription(String short_description) { this.short_description = short_description; }

    /** @see #long_description */ @JsonProperty("long_description")  public String getLongDescription() { return this.long_description; }
    /** @see #long_description */ @JsonProperty("long_description")  public void setLongDescription(String long_description) { this.long_description = long_description; }

    /** @see #assigned_to_terms */ @JsonProperty("assigned_to_terms")  public ReferenceList getAssignedToTerms() { return this.assigned_to_terms; }
    /** @see #assigned_to_terms */ @JsonProperty("assigned_to_terms")  public void setAssignedToTerms(ReferenceList assigned_to_terms) { this.assigned_to_terms = assigned_to_terms; }

    /** @see #steward */ @JsonProperty("steward")  public ReferenceList getSteward() { return this.steward; }
    /** @see #steward */ @JsonProperty("steward")  public void setSteward(ReferenceList steward) { this.steward = steward; }

    /** @see #analyzed_table */ @JsonProperty("analyzed_table")  public Reference getAnalyzedTable() { return this.analyzed_table; }
    /** @see #analyzed_table */ @JsonProperty("analyzed_table")  public void setAnalyzedTable(Reference analyzed_table) { this.analyzed_table = analyzed_table; }

    /** @see #project_name */ @JsonProperty("project_name")  public String getProjectName() { return this.project_name; }
    /** @see #project_name */ @JsonProperty("project_name")  public void setProjectName(String project_name) { this.project_name = project_name; }

    /** @see #review_date */ @JsonProperty("review_date")  public Date getReviewDate() { return this.review_date; }
    /** @see #review_date */ @JsonProperty("review_date")  public void setReviewDate(Date review_date) { this.review_date = review_date; }

    /** @see #promoted_by_principal */ @JsonProperty("promoted_by_principal")  public Reference getPromotedByPrincipal() { return this.promoted_by_principal; }
    /** @see #promoted_by_principal */ @JsonProperty("promoted_by_principal")  public void setPromotedByPrincipal(Reference promoted_by_principal) { this.promoted_by_principal = promoted_by_principal; }

    /** @see #reviewed_by_principal */ @JsonProperty("reviewed_by_principal")  public Reference getReviewedByPrincipal() { return this.reviewed_by_principal; }
    /** @see #reviewed_by_principal */ @JsonProperty("reviewed_by_principal")  public void setReviewedByPrincipal(Reference reviewed_by_principal) { this.reviewed_by_principal = reviewed_by_principal; }

    /** @see #created_by */ @JsonProperty("created_by")  public String getCreatedBy() { return this.created_by; }
    /** @see #created_by */ @JsonProperty("created_by")  public void setCreatedBy(String created_by) { this.created_by = created_by; }

    /** @see #created_on */ @JsonProperty("created_on")  public Date getCreatedOn() { return this.created_on; }
    /** @see #created_on */ @JsonProperty("created_on")  public void setCreatedOn(Date created_on) { this.created_on = created_on; }

    /** @see #modified_by */ @JsonProperty("modified_by")  public String getModifiedBy() { return this.modified_by; }
    /** @see #modified_by */ @JsonProperty("modified_by")  public void setModifiedBy(String modified_by) { this.modified_by = modified_by; }

    /** @see #modified_on */ @JsonProperty("modified_on")  public Date getModifiedOn() { return this.modified_on; }
    /** @see #modified_on */ @JsonProperty("modified_on")  public void setModifiedOn(Date modified_on) { this.modified_on = modified_on; }

    /** @see #number_of_fields */ @JsonProperty("number_of_fields")  public Number getNumberOfFields() { return this.number_of_fields; }
    /** @see #number_of_fields */ @JsonProperty("number_of_fields")  public void setNumberOfFields(Number number_of_fields) { this.number_of_fields = number_of_fields; }

    /** @see #number_of_rows */ @JsonProperty("number_of_rows")  public Number getNumberOfRows() { return this.number_of_rows; }
    /** @see #number_of_rows */ @JsonProperty("number_of_rows")  public void setNumberOfRows(Number number_of_rows) { this.number_of_rows = number_of_rows; }

    /** @see #inferred_primary_keys */ @JsonProperty("inferred_primary_keys")  public String getInferredPrimaryKeys() { return this.inferred_primary_keys; }
    /** @see #inferred_primary_keys */ @JsonProperty("inferred_primary_keys")  public void setInferredPrimaryKeys(String inferred_primary_keys) { this.inferred_primary_keys = inferred_primary_keys; }

    /** @see #primary_key_duplicates */ @JsonProperty("primary_key_duplicates")  public Number getPrimaryKeyDuplicates() { return this.primary_key_duplicates; }
    /** @see #primary_key_duplicates */ @JsonProperty("primary_key_duplicates")  public void setPrimaryKeyDuplicates(Number primary_key_duplicates) { this.primary_key_duplicates = primary_key_duplicates; }

    /** @see #inferred_foreign_keys */ @JsonProperty("inferred_foreign_keys")  public String getInferredForeignKeys() { return this.inferred_foreign_keys; }
    /** @see #inferred_foreign_keys */ @JsonProperty("inferred_foreign_keys")  public void setInferredForeignKeys(String inferred_foreign_keys) { this.inferred_foreign_keys = inferred_foreign_keys; }

    /** @see #foreign_key_violations */ @JsonProperty("foreign_key_violations")  public Number getForeignKeyViolations() { return this.foreign_key_violations; }
    /** @see #foreign_key_violations */ @JsonProperty("foreign_key_violations")  public void setForeignKeyViolations(Number foreign_key_violations) { this.foreign_key_violations = foreign_key_violations; }

    public static final Boolean isTableAnalysisSummary(Object obj) { return (obj.getClass() == TableAnalysisSummary.class); }

}
