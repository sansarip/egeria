/* SPDX-License-Identifier: Apache-2.0 */
/* Copyright Contributors to the ODPi Egeria project. */
package org.odpi.openmetadata.adapters.repositoryservices.igc.clientlibrary.model.generated.v115;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.odpi.openmetadata.adapters.repositoryservices.igc.clientlibrary.model.common.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Date;
import java.util.ArrayList;

/**
 * POJO for the 'quality_problem' asset type in IGC, displayed as 'Quality Score Problem' in the IGC UI.
 * <br><br>
 * (this code has been generated based on out-of-the-box IGC metadata types;
 *  if modifications are needed, eg. to handle custom attributes,
 *  extending from this class in your own custom class is the best approach.)
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class QualityProblem extends Reference {

    public static String getIgcTypeId() { return "quality_problem"; }

    /**
     * The 'data_quality_score' property, displayed as 'Data Quality Score' in the IGC UI.
     * <br><br>
     * Will be a single {@link Reference} to a {@link InformationAsset} object.
     */
    protected Reference data_quality_score;

    /**
     * The 'details' property, displayed as 'Details' in the IGC UI.
     */
    protected String details;

    /**
     * The 'confidence' property, displayed as 'Confidence' in the IGC UI.
     */
    protected Number confidence;

    /**
     * The 'occurrences' property, displayed as 'Occurrences' in the IGC UI.
     */
    protected Number occurrences;

    /**
     * The 'percent_occurrences' property, displayed as 'Percent Occurrences' in the IGC UI.
     */
    protected Number percent_occurrences;

    /**
     * The 'problem_type' property, displayed as 'Problem Type' in the IGC UI.
     * <br><br>
     * Will be a single {@link Reference} to a {@link InformationAsset} object.
     */
    protected Reference problem_type;

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


    /** @see #data_quality_score */ @JsonProperty("data_quality_score")  public Reference getDataQualityScore() { return this.data_quality_score; }
    /** @see #data_quality_score */ @JsonProperty("data_quality_score")  public void setDataQualityScore(Reference data_quality_score) { this.data_quality_score = data_quality_score; }

    /** @see #details */ @JsonProperty("details")  public String getDetails() { return this.details; }
    /** @see #details */ @JsonProperty("details")  public void setDetails(String details) { this.details = details; }

    /** @see #confidence */ @JsonProperty("confidence")  public Number getConfidence() { return this.confidence; }
    /** @see #confidence */ @JsonProperty("confidence")  public void setConfidence(Number confidence) { this.confidence = confidence; }

    /** @see #occurrences */ @JsonProperty("occurrences")  public Number getOccurrences() { return this.occurrences; }
    /** @see #occurrences */ @JsonProperty("occurrences")  public void setOccurrences(Number occurrences) { this.occurrences = occurrences; }

    /** @see #percent_occurrences */ @JsonProperty("percent_occurrences")  public Number getPercentOccurrences() { return this.percent_occurrences; }
    /** @see #percent_occurrences */ @JsonProperty("percent_occurrences")  public void setPercentOccurrences(Number percent_occurrences) { this.percent_occurrences = percent_occurrences; }

    /** @see #problem_type */ @JsonProperty("problem_type")  public Reference getProblemType() { return this.problem_type; }
    /** @see #problem_type */ @JsonProperty("problem_type")  public void setProblemType(Reference problem_type) { this.problem_type = problem_type; }

    /** @see #created_by */ @JsonProperty("created_by")  public String getCreatedBy() { return this.created_by; }
    /** @see #created_by */ @JsonProperty("created_by")  public void setCreatedBy(String created_by) { this.created_by = created_by; }

    /** @see #created_on */ @JsonProperty("created_on")  public Date getCreatedOn() { return this.created_on; }
    /** @see #created_on */ @JsonProperty("created_on")  public void setCreatedOn(Date created_on) { this.created_on = created_on; }

    /** @see #modified_by */ @JsonProperty("modified_by")  public String getModifiedBy() { return this.modified_by; }
    /** @see #modified_by */ @JsonProperty("modified_by")  public void setModifiedBy(String modified_by) { this.modified_by = modified_by; }

    /** @see #modified_on */ @JsonProperty("modified_on")  public Date getModifiedOn() { return this.modified_on; }
    /** @see #modified_on */ @JsonProperty("modified_on")  public void setModifiedOn(Date modified_on) { this.modified_on = modified_on; }

    public static final Boolean isQualityProblem(Object obj) { return (obj.getClass() == QualityProblem.class); }

}
