
package cl.wom.transformacion.json.customercontact;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "adrCity",
    "adrCounty",
    "adrPhn1",
    "adrState",
    "adrStreet",
    "adrStreetno",
    "errorCode",
    "errorDescription"
})
public class Return {

    @JsonProperty("adrCity")
    private String adrCity;
    @JsonProperty("adrCounty")
    private String adrCounty;
    @JsonProperty("adrPhn1")
    private String adrPhn1;
    @JsonProperty("adrState")
    private String adrState;
    @JsonProperty("adrStreet")
    private String adrStreet;
    @JsonProperty("adrStreetno")
    private String adrStreetno;
    @JsonProperty("errorCode")
    private String errorCode;
    @JsonProperty("errorDescription")
    private String errorDescription;

    /**
     * 
     * @return
     *     The adrCity
     */
    @JsonProperty("adrCity")
    public String getAdrCity() {
        return adrCity;
    }

    /**
     * 
     * @param adrCity
     *     The adrCity
     */
    @JsonProperty("adrCity")
    public void setAdrCity(String adrCity) {
        this.adrCity = adrCity;
    }

    /**
     * 
     * @return
     *     The adrCounty
     */
    @JsonProperty("adrCounty")
    public String getAdrCounty() {
        return adrCounty;
    }

    /**
     * 
     * @param adrCounty
     *     The adrCounty
     */
    @JsonProperty("adrCounty")
    public void setAdrCounty(String adrCounty) {
        this.adrCounty = adrCounty;
    }

    /**
     * 
     * @return
     *     The adrPhn1
     */
    @JsonProperty("adrPhn1")
    public String getAdrPhn1() {
        return adrPhn1;
    }

    /**
     * 
     * @param adrPhn1
     *     The adrPhn1
     */
    @JsonProperty("adrPhn1")
    public void setAdrPhn1(String adrPhn1) {
        this.adrPhn1 = adrPhn1;
    }

    /**
     * 
     * @return
     *     The adrState
     */
    @JsonProperty("adrState")
    public String getAdrState() {
        return adrState;
    }

    /**
     * 
     * @param adrState
     *     The adrState
     */
    @JsonProperty("adrState")
    public void setAdrState(String adrState) {
        this.adrState = adrState;
    }

    /**
     * 
     * @return
     *     The adrStreet
     */
    @JsonProperty("adrStreet")
    public String getAdrStreet() {
        return adrStreet;
    }

    /**
     * 
     * @param adrStreet
     *     The adrStreet
     */
    @JsonProperty("adrStreet")
    public void setAdrStreet(String adrStreet) {
        this.adrStreet = adrStreet;
    }

    /**
     * 
     * @return
     *     The adrStreetno
     */
    @JsonProperty("adrStreetno")
    public String getAdrStreetno() {
        return adrStreetno;
    }

    /**
     * 
     * @param adrStreetno
     *     The adrStreetno
     */
    @JsonProperty("adrStreetno")
    public void setAdrStreetno(String adrStreetno) {
        this.adrStreetno = adrStreetno;
    }

    /**
     * 
     * @return
     *     The errorCode
     */
    @JsonProperty("errorCode")
    public String getErrorCode() {
        return errorCode;
    }

    /**
     * 
     * @param errorCode
     *     The errorCode
     */
    @JsonProperty("errorCode")
    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    /**
     * 
     * @return
     *     The errorDescription
     */
    @JsonProperty("errorDescription")
    public String getErrorDescription() {
        return errorDescription;
    }

    /**
     * 
     * @param errorDescription
     *     The errorDescription
     */
    @JsonProperty("errorDescription")
    public void setErrorDescription(String errorDescription) {
        this.errorDescription = errorDescription;
    }

}
