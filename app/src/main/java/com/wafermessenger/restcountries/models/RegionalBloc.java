package com.wafermessenger.restcountries.models;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;*/

public class RegionalBloc implements Serializable {

    private String acronym;
    private String name;
    private List<String> otherAcronyms = null;
    private List<String> otherNames = null;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -4395525562491699870L;

    /**
     * No args constructor for use in serialization
     *
     */
    public RegionalBloc() {
    }

    /**
     *
     * @param otherAcronyms
     * @param acronym
     * @param name
     * @param otherNames
     */
    public RegionalBloc(String acronym, String name, List<String> otherAcronyms, List<String> otherNames) {
        super();
        this.acronym = acronym;
        this.name = name;
        this.otherAcronyms = otherAcronyms;
        this.otherNames = otherNames;
    }

    public String getAcronym() {
        return acronym;
    }

    public void setAcronym(String acronym) {
        this.acronym = acronym;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getOtherAcronyms() {
        return otherAcronyms;
    }

    public void setOtherAcronyms(List<String> otherAcronyms) {
        this.otherAcronyms = otherAcronyms;
    }

    public List<String> getOtherNames() {
        return otherNames;
    }

    public void setOtherNames(List<String> otherNames) {
        this.otherNames = otherNames;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    /*@Override
    public String toString() {
        return new ToStringBuilder(this).append("acronym", acronym).append("name", name).append("otherAcronyms", otherAcronyms).append("otherNames", otherNames).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(otherAcronyms).append(acronym).append(additionalProperties).append(name).append(otherNames).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RegionalBloc) == false) {
            return false;
        }
        RegionalBloc rhs = ((RegionalBloc) other);
        return new EqualsBuilder().append(otherAcronyms, rhs.otherAcronyms).append(acronym, rhs.acronym).append(additionalProperties, rhs.additionalProperties).append(name, rhs.name).append(otherNames, rhs.otherNames).isEquals();
    }*/

}