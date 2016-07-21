
package cl.wom.transformacion.json.datoscliente;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "flagRut",
    "customer"
})
public class ConsultaInfoClienteRutResponse {

    @JsonProperty("flagRut")
    private String flagRut;
    @JsonProperty("customer")
    private Customer customer;

    /**
     * 
     * @return
     *     The flagRut
     */
    @JsonProperty("flagRut")
    public String getFlagRut() {
        return flagRut;
    }

    /**
     * 
     * @param flagRut
     *     The flagRut
     */
    @JsonProperty("flagRut")
    public void setFlagRut(String flagRut) {
        this.flagRut = flagRut;
    }

    /**
     * 
     * @return
     *     The customer
     */
    @JsonProperty("customer")
    public Customer getCustomer() {
        return customer;
    }

    /**
     * 
     * @param customer
     *     The customer
     */
    @JsonProperty("customer")
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

}
