package com.wafermessenger.restcountries.models;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;*/

public class Country implements Serializable {

    private String name;
    private List<String> topLevelDomain = null;
    private String alpha2Code;
    private String alpha3Code;
    private List<String> callingCodes = null;
    private String capital;
    private List<String> altSpellings = null;
    private String region;
    private String subregion;
    private int population;
    private List<Double> latlng = null;
    private String demonym;
    private double area;
    private double gini;
    private List<String> timezones = null;
    private List<String> borders = null;
    private String nativeName;
    private String numericCode;
    private List<Currency> currencies = null;
    private List<Language> languages = null;
    private Translations translations;
    private String flag;
    private List<RegionalBloc> regionalBlocs = null;
    private String cioc;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 6014860905853966979L;

    /**
     * No args constructor for use in serialization
     *
     */
    public Country() {
    }

    /**
     *
     * @param cioc
     * @param region
     * @param currencies
     * @param numericCode
     * @param callingCodes
     * @param alpha3Code
     * @param nativeName
     * @param topLevelDomain
     * @param alpha2Code
     * @param capital
     * @param altSpellings
     * @param languages
     * @param subregion
     * @param timezones
     * @param flag
     * @param area
     * @param name
     * @param regionalBlocs
     * @param translations
     * @param latlng
     * @param demonym
     * @param gini
     * @param borders
     * @param population
     */
    public Country(String name, List<String> topLevelDomain, String alpha2Code, String alpha3Code, List<String> callingCodes, String capital, List<String> altSpellings, String region, String subregion, int population, List<Double> latlng, String demonym, double area, double gini, List<String> timezones, List<String> borders, String nativeName, String numericCode, List<Currency> currencies, List<Language> languages, Translations translations, String flag, List<RegionalBloc> regionalBlocs, String cioc) {
        super();
        this.name = name;
        this.topLevelDomain = topLevelDomain;
        this.alpha2Code = alpha2Code;
        this.alpha3Code = alpha3Code;
        this.callingCodes = callingCodes;
        this.capital = capital;
        this.altSpellings = altSpellings;
        this.region = region;
        this.subregion = subregion;
        this.population = population;
        this.latlng = latlng;
        this.demonym = demonym;
        this.area = area;
        this.gini = gini;
        this.timezones = timezones;
        this.borders = borders;
        this.nativeName = nativeName;
        this.numericCode = numericCode;
        this.currencies = currencies;
        this.languages = languages;
        this.translations = translations;
        this.flag = flag;
        this.regionalBlocs = regionalBlocs;
        this.cioc = cioc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getTopLevelDomain() {
        return topLevelDomain;
    }

    public void setTopLevelDomain(List<String> topLevelDomain) {
        this.topLevelDomain = topLevelDomain;
    }

    public String getAlpha2Code() {
        return alpha2Code;
    }

    public void setAlpha2Code(String alpha2Code) {
        this.alpha2Code = alpha2Code;
    }

    public String getAlpha3Code() {
        return alpha3Code;
    }

    public void setAlpha3Code(String alpha3Code) {
        this.alpha3Code = alpha3Code;
    }

    public List<String> getCallingCodes() {
        return callingCodes;
    }

    public void setCallingCodes(List<String> callingCodes) {
        this.callingCodes = callingCodes;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public List<String> getAltSpellings() {
        return altSpellings;
    }

    public void setAltSpellings(List<String> altSpellings) {
        this.altSpellings = altSpellings;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getSubregion() {
        return subregion;
    }

    public void setSubregion(String subregion) {
        this.subregion = subregion;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public List<Double> getLatlng() {
        return latlng;
    }

    public void setLatlng(List<Double> latlng) {
        this.latlng = latlng;
    }

    public String getDemonym() {
        return demonym;
    }

    public void setDemonym(String demonym) {
        this.demonym = demonym;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getGini() {
        return gini;
    }

    public void setGini(double gini) {
        this.gini = gini;
    }

    public List<String> getTimezones() {
        return timezones;
    }

    public void setTimezones(List<String> timezones) {
        this.timezones = timezones;
    }

    public List<String> getBorders() {
        return borders;
    }

    public void setBorders(List<String> borders) {
        this.borders = borders;
    }

    public String getNativeName() {
        return nativeName;
    }

    public void setNativeName(String nativeName) {
        this.nativeName = nativeName;
    }

    public String getNumericCode() {
        return numericCode;
    }

    public void setNumericCode(String numericCode) {
        this.numericCode = numericCode;
    }

    public List<Currency> getCurrencies() {
        return currencies;
    }

    public void setCurrencies(List<Currency> currencies) {
        this.currencies = currencies;
    }

    public List<Language> getLanguages() {
        return languages;
    }

    public void setLanguages(List<Language> languages) {
        this.languages = languages;
    }

    public Translations getTranslations() {
        return translations;
    }

    public void setTranslations(Translations translations) {
        this.translations = translations;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public List<RegionalBloc> getRegionalBlocs() {
        return regionalBlocs;
    }

    public void setRegionalBlocs(List<RegionalBloc> regionalBlocs) {
        this.regionalBlocs = regionalBlocs;
    }

    public String getCioc() {
        return cioc;
    }

    public void setCioc(String cioc) {
        this.cioc = cioc;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    /*@Override
    public String toString() {
        return new ToStringBuilder(this).append("name", name).append("topLevelDomain", topLevelDomain).append("alpha2Code", alpha2Code).append("alpha3Code", alpha3Code).append("callingCodes", callingCodes).append("capital", capital).append("altSpellings", altSpellings).append("region", region).append("subregion", subregion).append("population", population).append("latlng", latlng).append("demonym", demonym).append("area", area).append("gini", gini).append("timezones", timezones).append("borders", borders).append("nativeName", nativeName).append("numericCode", numericCode).append("currencies", currencies).append("languages", languages).append("translations", translations).append("flag", flag).append("regionalBlocs", regionalBlocs).append("cioc", cioc).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(cioc).append(region).append(currencies).append(callingCodes).append(alpha3Code).append(capital).append(alpha2Code).append(languages).append(subregion).append(area).append(name).append(regionalBlocs).append(demonym).append(gini).append(borders).append(population).append(numericCode).append(nativeName).append(topLevelDomain).append(altSpellings).append(timezones).append(flag).append(additionalProperties).append(translations).append(latlng).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Country) == false) {
            return false;
        }
        Country rhs = ((Country) other);
        return new EqualsBuilder().append(cioc, rhs.cioc).append(region, rhs.region).append(currencies, rhs.currencies).append(callingCodes, rhs.callingCodes).append(alpha3Code, rhs.alpha3Code).append(capital, rhs.capital).append(alpha2Code, rhs.alpha2Code).append(languages, rhs.languages).append(subregion, rhs.subregion).append(area, rhs.area).append(name, rhs.name).append(regionalBlocs, rhs.regionalBlocs).append(demonym, rhs.demonym).append(gini, rhs.gini).append(borders, rhs.borders).append(population, rhs.population).append(numericCode, rhs.numericCode).append(nativeName, rhs.nativeName).append(topLevelDomain, rhs.topLevelDomain).append(altSpellings, rhs.altSpellings).append(timezones, rhs.timezones).append(flag, rhs.flag).append(additionalProperties, rhs.additionalProperties).append(translations, rhs.translations).append(latlng, rhs.latlng).isEquals();
    }*/

}