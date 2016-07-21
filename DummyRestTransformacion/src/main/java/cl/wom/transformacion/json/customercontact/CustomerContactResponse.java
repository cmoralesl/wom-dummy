
package cl.wom.transformacion.json.customercontact;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "getCustomerContactResponse"
})
public class CustomerContactResponse {

    @JsonProperty("getCustomerContactResponse")
    private GetCustomerContactResponse getCustomerContactResponse;

    /**
     * 
     * @return
     *     The getCustomerContactResponse
     */
    @JsonProperty("getCustomerContactResponse")
    public GetCustomerContactResponse getGetCustomerContactResponse() {
        return getCustomerContactResponse;
    }

    /**
     * 
     * @param getCustomerContactResponse
     *     The getCustomerContactResponse
     */
    @JsonProperty("getCustomerContactResponse")
    public void setGetCustomerContactResponse(GetCustomerContactResponse getCustomerContactResponse) {
        this.getCustomerContactResponse = getCustomerContactResponse;
    }

}
