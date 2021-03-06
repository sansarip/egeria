/* SPDX-License-Identifier: Apache-2.0 */
/* Copyright Contributors to the ODPi Egeria project. */
package org.odpi.openmetadata.adapters.repositoryservices.igc.clientlibrary.model.generated.v117;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.odpi.openmetadata.adapters.repositoryservices.igc.clientlibrary.model.common.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Date;
import java.util.ArrayList;

/**
 * POJO for the 'inferred_key' asset type in IGC, displayed as 'Inferred Key' in the IGC UI.
 * <br><br>
 * (this code has been generated based on out-of-the-box IGC metadata types;
 *  if modifications are needed, eg. to handle custom attributes,
 *  extending from this class in your own custom class is the best approach.)
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class InferredKey extends Reference {

    public static String getIgcTypeId() { return "inferred_key"; }

    /**
     * The 'name' property, displayed as 'Name' in the IGC UI.
     */
    protected String name;

    /**
     * The 'short_description' property, displayed as 'Short Description' in the IGC UI.
     */
    protected String short_description;

    /**
     * The 'long_description' property, displayed as 'Long Description' in the IGC UI.
     */
    protected String long_description;

    /**
     * The 'table_analysis' property, displayed as 'Table Analysis' in the IGC UI.
     * <br><br>
     * Will be a single {@link Reference} to a {@link MainObject} object.
     */
    protected Reference table_analysis;

    /**
     * The 'total_records' property, displayed as 'Total Records' in the IGC UI.
     */
    protected Number total_records;

    /**
     * The 'primary_key' property, displayed as 'Primary Key' in the IGC UI.
     */
    protected Boolean primary_key;

    /**
     * The 'inferred_database_fields' property, displayed as 'Inferred Database Fields' in the IGC UI.
     * <br><br>
     * Will be a {@link ReferenceList} of {@link DatabaseColumn} objects.
     */
    protected ReferenceList inferred_database_fields;

    /**
     * The 'referenced_by_inferred_foreign_keys' property, displayed as 'Referenced by Inferred Foreign Keys' in the IGC UI.
     * <br><br>
     * Will be a {@link ReferenceList} of {@link InferredForeignKey} objects.
     */
    protected ReferenceList referenced_by_inferred_foreign_keys;

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


    /** @see #name */ @JsonProperty("name")  public String getTheName() { return this.name; }
    /** @see #name */ @JsonProperty("name")  public void setTheName(String name) { this.name = name; }

    /** @see #short_description */ @JsonProperty("short_description")  public String getShortDescription() { return this.short_description; }
    /** @see #short_description */ @JsonProperty("short_description")  public void setShortDescription(String short_description) { this.short_description = short_description; }

    /** @see #long_description */ @JsonProperty("long_description")  public String getLongDescription() { return this.long_description; }
    /** @see #long_description */ @JsonProperty("long_description")  public void setLongDescription(String long_description) { this.long_description = long_description; }

    /** @see #table_analysis */ @JsonProperty("table_analysis")  public Reference getTableAnalysis() { return this.table_analysis; }
    /** @see #table_analysis */ @JsonProperty("table_analysis")  public void setTableAnalysis(Reference table_analysis) { this.table_analysis = table_analysis; }

    /** @see #total_records */ @JsonProperty("total_records")  public Number getTotalRecords() { return this.total_records; }
    /** @see #total_records */ @JsonProperty("total_records")  public void setTotalRecords(Number total_records) { this.total_records = total_records; }

    /** @see #primary_key */ @JsonProperty("primary_key")  public Boolean getPrimaryKey() { return this.primary_key; }
    /** @see #primary_key */ @JsonProperty("primary_key")  public void setPrimaryKey(Boolean primary_key) { this.primary_key = primary_key; }

    /** @see #inferred_database_fields */ @JsonProperty("inferred_database_fields")  public ReferenceList getInferredDatabaseFields() { return this.inferred_database_fields; }
    /** @see #inferred_database_fields */ @JsonProperty("inferred_database_fields")  public void setInferredDatabaseFields(ReferenceList inferred_database_fields) { this.inferred_database_fields = inferred_database_fields; }

    /** @see #referenced_by_inferred_foreign_keys */ @JsonProperty("referenced_by_inferred_foreign_keys")  public ReferenceList getReferencedByInferredForeignKeys() { return this.referenced_by_inferred_foreign_keys; }
    /** @see #referenced_by_inferred_foreign_keys */ @JsonProperty("referenced_by_inferred_foreign_keys")  public void setReferencedByInferredForeignKeys(ReferenceList referenced_by_inferred_foreign_keys) { this.referenced_by_inferred_foreign_keys = referenced_by_inferred_foreign_keys; }

    /** @see #created_by */ @JsonProperty("created_by")  public String getCreatedBy() { return this.created_by; }
    /** @see #created_by */ @JsonProperty("created_by")  public void setCreatedBy(String created_by) { this.created_by = created_by; }

    /** @see #created_on */ @JsonProperty("created_on")  public Date getCreatedOn() { return this.created_on; }
    /** @see #created_on */ @JsonProperty("created_on")  public void setCreatedOn(Date created_on) { this.created_on = created_on; }

    /** @see #modified_by */ @JsonProperty("modified_by")  public String getModifiedBy() { return this.modified_by; }
    /** @see #modified_by */ @JsonProperty("modified_by")  public void setModifiedBy(String modified_by) { this.modified_by = modified_by; }

    /** @see #modified_on */ @JsonProperty("modified_on")  public Date getModifiedOn() { return this.modified_on; }
    /** @see #modified_on */ @JsonProperty("modified_on")  public void setModifiedOn(Date modified_on) { this.modified_on = modified_on; }

    public static final Boolean isInferredKey(Object obj) { return (obj.getClass() == InferredKey.class); }

}
