package com.wafermessenger.restcountries.models;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/*import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;*/

public class Language implements Serializable {

    private String iso6391;
    private String iso6392;
    private String name;
    private String nativeName;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 318517464104485285L;

    /**
     * No args constructor for use in serialization
     *
     */
    public Language() {
    }

    /**
     *
     * @param iso6391
     * @param iso6392
     * @param name
     * @param nativeName
     */
    public Language(String iso6391, String iso6392, String name, String nativeName) {
        super();
        this.iso6391 = iso6391;
        this.iso6392 = iso6392;
        this.name = name;
        this.nativeName = nativeName;
    }

    public String getIso6391() {
        return iso6391;
    }

    public void setIso6391(String iso6391) {
        this.iso6391 = iso6391;
    }

    public String getIso6392() {
        return iso6392;
    }

    public void setIso6392(String iso6392) {
        this.iso6392 = iso6392;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNativeName() {
        return nativeName;
    }

    public void setNativeName(String nativeName) {
        this.nativeName = nativeName;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    /*@Override
    public String toString() {
        return new ToStringBuilder(this).append("iso6391", iso6391).append("iso6392", iso6392).append("name", name).append("nativeName", nativeName).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(iso6391).append(iso6392).append(additionalProperties).append(name).append(nativeName).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Language) == false) {
            return false;
        }
        Language rhs = ((Language) other);
        return new EqualsBuilder().append(iso6391, rhs.iso6391).append(iso6392, rhs.iso6392).append(additionalProperties, rhs.additionalProperties).append(name, rhs.name).append(nativeName, rhs.nativeName).isEquals();
    }*/

}