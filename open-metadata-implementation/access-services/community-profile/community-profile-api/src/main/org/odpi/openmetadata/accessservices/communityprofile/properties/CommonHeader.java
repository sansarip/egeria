/* SPDX-License-Identifier: Apache 2.0 */
/* Copyright Contributors to the ODPi Egeria project. */
package org.odpi.openmetadata.accessservices.communityprofile.properties;


import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import static com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE;
import static com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.PUBLIC_ONLY;

/**
 * CommonHeader provides the common properties for type, guid, additional properties and classifications.
 */
@JsonAutoDetect(getterVisibility=PUBLIC_ONLY, setterVisibility=PUBLIC_ONLY, fieldVisibility=NONE)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "class")
@JsonSubTypes({
        @JsonSubTypes.Type(value = ReferenceableHeader.class, name = "ReferenceableHeader"),
        @JsonSubTypes.Type(value = PersonalProfile.class, name = "PersonalProfile")
})
public abstract class CommonHeader extends CommunityProfileElementHeader
{
    private String               guid                 = null;
    private String               typeName             = null;
    private String               typeDescription      = null;
    private String               qualifiedName        = null;
    private Map<String, Object>  additionalProperties = null;
    private List<Classification> classifications      = null;


    /**
     * Default constructor
     */
    public CommonHeader()
    {
        super();
    }


    /**
     * Copy/clone constructor
     */
    public CommonHeader(CommonHeader template)
    {
        super(template);

        if (template != null)
        {
            this.guid = template.getGUID();
            this.typeName = template.getTypeName();
            this.typeDescription = template.getTypeDescription();
            this.qualifiedName = template.getQualifiedName();
            this.additionalProperties = template.getAdditionalProperties();
            this.classifications = template.getClassifications();
        }
    }


    /**
     * Return the unique identifier for this asset.
     *
     * @return string guid
     */
    public String getGUID()
    {
        return guid;
    }


    /**
     * Set up the unique identifier for this asset.
     *
     * @param guid string guid for this asset
     */
    public void setGUID(String guid)
    {
        this.guid = guid;
    }


    /**
     * Return the name for this Asset's type.
     *
     * @return string name
     */
    public String getTypeName()
    {
        return typeName;
    }


    /**
     * Set up the name for this Asset's type.
     *
     * @param typeName string name
     */
    public void setTypeName(String typeName)
    {
        this.typeName = typeName;
    }


    /**
     * Return the description for this Asset's type.
     *
     * @return string description
     */
    public String getTypeDescription()
    {
        return typeDescription;
    }


    /**
     * Set up the description for this Asset's type.
     *
     * @param typeDescription string description
     */
    public void setTypeDescription(String typeDescription)
    {
        this.typeDescription = typeDescription;
    }


    /**
     * Return the unique name for this asset.
     *
     * @return string name
     */
    public String getQualifiedName()
    {
        return qualifiedName;
    }


    /**
     * Set up the unique name for this asset.
     *
     * @param qualifiedName string name
     */
    public void setQualifiedName(String qualifiedName)
    {
        this.qualifiedName = qualifiedName;
    }


    /**
     * Return any additional properties associated with the asset.
     *
     * @return map of property names to property values
     */
    public Map<String, Object> getAdditionalProperties()
    {
        if (additionalProperties == null)
        {
            return null;
        }
        else if (additionalProperties.isEmpty())
        {
            return null;
        }
        else
        {
            return new HashMap<>(additionalProperties);
        }
    }


    /**
     * Set up any additional properties associated with the asset.
     *
     * @param additionalProperties map of property names to property values
     */
    public void setAdditionalProperties(Map<String, Object> additionalProperties)
    {
        this.additionalProperties = additionalProperties;
    }


    /**
     * Return the list of active classifications for this asset.
     *
     * @return list of classification objects
     */
    public List<Classification> getClassifications()
    {
        if (classifications == null)
        {
            return null;
        }
        else if (classifications.isEmpty())
        {
            return null;
        }
        else
        {
            return classifications;
        }
    }


    /**
     * Set up the list of active classifications for this asset.
     *
     * @param classifications list of classification objects
     */
    public void setClassifications(List<Classification> classifications)
    {
        this.classifications = classifications;
    }


    /**
     * JSON-style toString
     *
     * @return return string containing the property names and values
     */
    @Override
    public String toString()
    {
        return "ReferenceableHeader{" +
                "guid='" + guid + '\'' +
                ", typeName='" + typeName + '\'' +
                ", typeDescription='" + typeDescription + '\'' +
                ", qualifiedName='" + qualifiedName + '\'' +
                ", additionalProperties=" + additionalProperties +
                ", classifications=" + classifications +
                ", GUID='" + getGUID() + '\'' +
                '}';
    }


    /**
     * Return comparison result based on the content of the properties.
     *
     * @param objectToCompare test object
     * @return result of comparison
     */
    @Override
    public boolean equals(Object objectToCompare)
    {
        if (this == objectToCompare)
        {
            return true;
        }
        if (objectToCompare == null || getClass() != objectToCompare.getClass())
        {
            return false;
        }
        CommonHeader that = (CommonHeader) objectToCompare;
        return Objects.equals(guid, that.guid) &&
                Objects.equals(getTypeName(), that.getTypeName()) &&
                Objects.equals(getTypeDescription(), that.getTypeDescription()) &&
                Objects.equals(getQualifiedName(), that.getQualifiedName()) &&
                Objects.equals(getAdditionalProperties(), that.getAdditionalProperties()) &&
                Objects.equals(getClassifications(), that.getClassifications());
    }


    /**
     * Return hash code for this object
     *
     * @return int hash code
     */
    @Override
    public int hashCode()
    {
        return Objects.hash(guid, getTypeName(), getTypeDescription(), getQualifiedName(), getAdditionalProperties(),
                            getClassifications());
    }
}
