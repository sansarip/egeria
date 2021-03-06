/* SPDX-License-Identifier: Apache-2.0 */
/* Copyright Contributors to the ODPi Egeria project. */
package org.odpi.openmetadata.frameworks.connectors.properties.beans;


import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.Objects;

import static com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE;
import static com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.PUBLIC_ONLY;

/**
 * PrimitiveSchemaType describes a schema element that has a primitive type.  This class stores which
 * type of primitive type it is an a default value if supplied.
 */
@JsonAutoDetect(getterVisibility=PUBLIC_ONLY, setterVisibility=PUBLIC_ONLY, fieldVisibility=NONE)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown=true)
public class PrimitiveSchemaType extends SchemaType
{
    protected  String     dataType = null;
    protected  String     defaultValue = null;


    /**
     * Default constructor used by subclasses
     */
    public PrimitiveSchemaType()
    {
        super();
    }


    /**
     * Copy/clone Constructor the parentAsset is passed separately to the template because it is also
     * likely to be being cloned in the same operation and we want the definitions clone to point to the
     * asset clone and not the original asset.
     *
     * @param templateSchemaElement template object to copy.
     */
    public PrimitiveSchemaType(PrimitiveSchemaType templateSchemaElement)
    {
        super(templateSchemaElement);

        if (templateSchemaElement != null)
        {
            dataType = templateSchemaElement.getDataType();
            defaultValue = templateSchemaElement.getDefaultValue();
        }
    }


    /**
     * Return the data type for this element.  Null means unknown data type.
     *
     * @return String data type name
     */
    public String getDataType() { return dataType; }


    /**
     * Set up the data type for this element.  Null means unknown data type.
     *
     * @param dataType data type name
     */
    public void setDataType(String dataType)
    {
        this.dataType = dataType;
    }


    /**
     * Return the default value for the element.  Null means no default value set up.
     *
     * @return String containing default value
     */
    public String getDefaultValue() { return defaultValue; }


    /**
     * Set up the default value for the element.  Null means no default value set up.
     *
     * @param defaultValue String containing default value
     */
    public void setDefaultValue(String defaultValue)
    {
        this.defaultValue = defaultValue;
    }


    /**
     * Returns a clone of this object as the abstract SchemaElement class.
     *
     * @return PrimitiveSchemaType object
     */
    @Override
    public SchemaElement cloneSchemaElement()
    {
        return new PrimitiveSchemaType(this);
    }


    /**
     * Returns a clone of this object as the abstract SchemaType class.
     *
     * @return PrimitiveSchemaType object
     */
    @Override
    public SchemaType cloneSchemaType()
    {
        return new PrimitiveSchemaType(this);
    }


    /**
     * Standard toString method.
     *
     * @return print out of variables in a JSON-style
     */
    @Override
    public String toString()
    {
        return "PrimitiveSchemaType{" +
                "command='" + dataType + '\'' +
                ", defaultValue='" + defaultValue + '\'' +
                ", qualifiedName='" + qualifiedName + '\'' +
                ", additionalProperties=" + additionalProperties +
                ", type=" + type +
                ", guid='" + guid + '\'' +
                ", url='" + url + '\'' +
                ", classifications=" + classifications +
                '}';
    }


    /**
     * Compare the values of the supplied object with those stored in the current object.
     *
     * @param objectToCompare supplied object
     * @return boolean result of comparison
     */
    @Override
    public boolean equals(Object objectToCompare)
    {
        if (this == objectToCompare)
        {
            return true;
        }
        if (!(objectToCompare instanceof PrimitiveSchemaType))
        {
            return false;
        }
        if (!super.equals(objectToCompare))
        {
            return false;
        }
        PrimitiveSchemaType that = (PrimitiveSchemaType) objectToCompare;
        return Objects.equals(getDataType(), that.getDataType()) &&
                Objects.equals(getDefaultValue(), that.getDefaultValue());
    }
}