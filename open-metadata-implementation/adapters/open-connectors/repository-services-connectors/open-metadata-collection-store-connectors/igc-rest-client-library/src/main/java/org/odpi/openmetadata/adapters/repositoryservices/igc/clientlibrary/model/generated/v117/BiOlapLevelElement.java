/* SPDX-License-Identifier: Apache-2.0 */
/* Copyright Contributors to the ODPi Egeria project. */
package org.odpi.openmetadata.adapters.repositoryservices.igc.clientlibrary.model.generated.v117;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.odpi.openmetadata.adapters.repositoryservices.igc.clientlibrary.model.common.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Date;
import java.util.ArrayList;

/**
 * POJO for the 'bi_olap_level_element' asset type in IGC, displayed as 'BI OLAP Level Element' in the IGC UI.
 * <br><br>
 * (this code has been generated based on out-of-the-box IGC metadata types;
 *  if modifications are needed, eg. to handle custom attributes,
 *  extending from this class in your own custom class is the best approach.)
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class BiOlapLevelElement extends Reference {

    public static String getIgcTypeId() { return "bi_olap_level_element"; }

    /**
     * The 'name' property, displayed as 'Element Name' in the IGC UI.
     */
    protected String name;

    /**
     * The 'business_name' property, displayed as 'Business Name' in the IGC UI.
     */
    protected String business_name;

    /**
     * The 'short_description' property, displayed as 'Short Description' in the IGC UI.
     */
    protected String short_description;

    /**
     * The 'defined_in_level' property, displayed as 'Defined in Level' in the IGC UI.
     * <br><br>
     * Will be a single {@link Reference} to a {@link BiLevel} object.
     */
    protected Reference defined_in_level;

    /**
     * The 'key_level' property, displayed as 'Key Level' in the IGC UI.
     * <br><br>
     * Will be a single {@link Reference} to a {@link BiLevel} object.
     */
    protected Reference key_level;

    /**
     * The 'defined_as_an_olap_member' property, displayed as 'Defined as an OLAP Member' in the IGC UI.
     * <br><br>
     * Will be a single {@link Reference} to a {@link BiCollectionMember} object.
     */
    protected Reference defined_as_an_olap_member;


    /** @see #name */ @JsonProperty("name")  public String getTheName() { return this.name; }
    /** @see #name */ @JsonProperty("name")  public void setTheName(String name) { this.name = name; }

    /** @see #business_name */ @JsonProperty("business_name")  public String getBusinessName() { return this.business_name; }
    /** @see #business_name */ @JsonProperty("business_name")  public void setBusinessName(String business_name) { this.business_name = business_name; }

    /** @see #short_description */ @JsonProperty("short_description")  public String getShortDescription() { return this.short_description; }
    /** @see #short_description */ @JsonProperty("short_description")  public void setShortDescription(String short_description) { this.short_description = short_description; }

    /** @see #defined_in_level */ @JsonProperty("defined_in_level")  public Reference getDefinedInLevel() { return this.defined_in_level; }
    /** @see #defined_in_level */ @JsonProperty("defined_in_level")  public void setDefinedInLevel(Reference defined_in_level) { this.defined_in_level = defined_in_level; }

    /** @see #key_level */ @JsonProperty("key_level")  public Reference getKeyLevel() { return this.key_level; }
    /** @see #key_level */ @JsonProperty("key_level")  public void setKeyLevel(Reference key_level) { this.key_level = key_level; }

    /** @see #defined_as_an_olap_member */ @JsonProperty("defined_as_an_olap_member")  public Reference getDefinedAsAnOlapMember() { return this.defined_as_an_olap_member; }
    /** @see #defined_as_an_olap_member */ @JsonProperty("defined_as_an_olap_member")  public void setDefinedAsAnOlapMember(Reference defined_as_an_olap_member) { this.defined_as_an_olap_member = defined_as_an_olap_member; }

    public static final Boolean isBiOlapLevelElement(Object obj) { return (obj.getClass() == BiOlapLevelElement.class); }

}
