package com.wafermessenger.restcountries.models;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
/*
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
*/

public class Translations implements Serializable {

    private String de;
    private String es;
    private String fr;
    private String ja;
    private String it;
    private String br;
    private String pt;
    private String nl;
    private String hr;
    private String fa;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -3221827505389028915L;

    /**
     * No args constructor for use in serialization
     *
     */
    public Translations() {
    }

    /**
     *
     * @param hr
     * @param de
     * @param it
     * @param pt
     * @param fa
     * @param fr
     * @param br
     * @param es
     * @param nl
     * @param ja
     */
    public Translations(String de, String es, String fr, String ja, String it, String br, String pt, String nl, String hr, String fa) {
        super();
        this.de = de;
        this.es = es;
        this.fr = fr;
        this.ja = ja;
        this.it = it;
        this.br = br;
        this.pt = pt;
        this.nl = nl;
        this.hr = hr;
        this.fa = fa;
    }

    public String getDe() {
        return de;
    }

    public void setDe(String de) {
        this.de = de;
    }

    public String getEs() {
        return es;
    }

    public void setEs(String es) {
        this.es = es;
    }

    public String getFr() {
        return fr;
    }

    public void setFr(String fr) {
        this.fr = fr;
    }

    public String getJa() {
        return ja;
    }

    public void setJa(String ja) {
        this.ja = ja;
    }

    public String getIt() {
        return it;
    }

    public void setIt(String it) {
        this.it = it;
    }

    public String getBr() {
        return br;
    }

    public void setBr(String br) {
        this.br = br;
    }

    public String getPt() {
        return pt;
    }

    public void setPt(String pt) {
        this.pt = pt;
    }

    public String getNl() {
        return nl;
    }

    public void setNl(String nl) {
        this.nl = nl;
    }

    public String getHr() {
        return hr;
    }

    public void setHr(String hr) {
        this.hr = hr;
    }

    public String getFa() {
        return fa;
    }

    public void setFa(String fa) {
        this.fa = fa;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

/*    @Override
    public String toString() {
        return new ToStringBuilder(this).append("de", de).append("es", es).append("fr", fr).append("ja", ja).append("it", it).append("br", br).append("pt", pt).append("nl", nl).append("hr", hr).append("fa", fa).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(hr).append(de).append(it).append(additionalProperties).append(pt).append(fa).append(fr).append(br).append(es).append(nl).append(ja).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Translations) == false) {
            return false;
        }
        Translations rhs = ((Translations) other);
        return new EqualsBuilder().append(hr, rhs.hr).append(de, rhs.de).append(it, rhs.it).append(additionalProperties, rhs.additionalProperties).append(pt, rhs.pt).append(fa, rhs.fa).append(fr, rhs.fr).append(br, rhs.br).append(es, rhs.es).append(nl, rhs.nl).append(ja, rhs.ja).isEquals();
    }*/

}