
package cl.wom.transformacion.json.datoscliente;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "ConsultarInfoClienteResponse"
})
public class DatosClienteResponse {

    @JsonProperty("ConsultarInfoClienteResponse")
    private ConsultarInfoClienteResponse consultarInfoClienteResponse;

    /**
     * 
     * @return
     *     The consultarInfoClienteResponse
     */
    @JsonProperty("ConsultarInfoClienteResponse")
    public ConsultarInfoClienteResponse getConsultarInfoClienteResponse() {
        return consultarInfoClienteResponse;
    }

    /**
     * 
     * @param consultarInfoClienteResponse
     *     The ConsultarInfoClienteResponse
     */
    @JsonProperty("ConsultarInfoClienteResponse")
    public void setConsultarInfoClienteResponse(ConsultarInfoClienteResponse consultarInfoClienteResponse) {
        this.consultarInfoClienteResponse = consultarInfoClienteResponse;
    }

}
