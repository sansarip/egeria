/* SPDX-License-Identifier: Apache-2.0 */
/* Copyright Contributors to the ODPi Egeria project. */
package org.odpi.openmetadata.adapters.repositoryservices.igc.clientlibrary.model.generated.v115;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.odpi.openmetadata.adapters.repositoryservices.igc.clientlibrary.model.common.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Date;
import java.util.ArrayList;

/**
 * POJO for the 'job_read_event' asset type in IGC, displayed as 'Job Read Event' in the IGC UI.
 * <br><br>
 * (this code has been generated based on out-of-the-box IGC metadata types;
 *  if modifications are needed, eg. to handle custom attributes,
 *  extending from this class in your own custom class is the best approach.)
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class JobReadEvent extends Reference {

    public static String getIgcTypeId() { return "job_read_event"; }

    /**
     * The 'reads_from' property, displayed as 'Reads From' in the IGC UI.
     */
    protected ArrayList<String> reads_from;

    /**
     * The 'job_run_activity' property, displayed as 'Job Run Activity' in the IGC UI.
     * <br><br>
     * Will be a single {@link Reference} to a {@link InformationAsset} object.
     */
    protected Reference job_run_activity;

    /**
     * The 'row_count' property, displayed as 'Rows Processed' in the IGC UI.
     */
    protected Number row_count;

    /**
     * The 'time' property, displayed as 'Time' in the IGC UI.
     */
    protected Date time;

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


    /** @see #reads_from */ @JsonProperty("reads_from")  public ArrayList<String> getReadsFrom() { return this.reads_from; }
    /** @see #reads_from */ @JsonProperty("reads_from")  public void setReadsFrom(ArrayList<String> reads_from) { this.reads_from = reads_from; }

    /** @see #job_run_activity */ @JsonProperty("job_run_activity")  public Reference getJobRunActivity() { return this.job_run_activity; }
    /** @see #job_run_activity */ @JsonProperty("job_run_activity")  public void setJobRunActivity(Reference job_run_activity) { this.job_run_activity = job_run_activity; }

    /** @see #row_count */ @JsonProperty("row_count")  public Number getRowCount() { return this.row_count; }
    /** @see #row_count */ @JsonProperty("row_count")  public void setRowCount(Number row_count) { this.row_count = row_count; }

    /** @see #time */ @JsonProperty("time")  public Date getTime() { return this.time; }
    /** @see #time */ @JsonProperty("time")  public void setTime(Date time) { this.time = time; }

    /** @see #created_by */ @JsonProperty("created_by")  public String getCreatedBy() { return this.created_by; }
    /** @see #created_by */ @JsonProperty("created_by")  public void setCreatedBy(String created_by) { this.created_by = created_by; }

    /** @see #created_on */ @JsonProperty("created_on")  public Date getCreatedOn() { return this.created_on; }
    /** @see #created_on */ @JsonProperty("created_on")  public void setCreatedOn(Date created_on) { this.created_on = created_on; }

    /** @see #modified_by */ @JsonProperty("modified_by")  public String getModifiedBy() { return this.modified_by; }
    /** @see #modified_by */ @JsonProperty("modified_by")  public void setModifiedBy(String modified_by) { this.modified_by = modified_by; }

    /** @see #modified_on */ @JsonProperty("modified_on")  public Date getModifiedOn() { return this.modified_on; }
    /** @see #modified_on */ @JsonProperty("modified_on")  public void setModifiedOn(Date modified_on) { this.modified_on = modified_on; }

    public static final Boolean isJobReadEvent(Object obj) { return (obj.getClass() == JobReadEvent.class); }

}
