
package cl.wom.transformacion.json.customercontact;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "return"
})
public class GetCustomerContactResponse {

    @JsonProperty("return")
    private Return _return;

    /**
     * 
     * @return
     *     The _return
     */
    @JsonProperty("return")
    public Return getReturn() {
        return _return;
    }

    /**
     * 
     * @param _return
     *     The return
     */
    @JsonProperty("return")
    public void setReturn(Return _return) {
        this._return = _return;
    }

}
