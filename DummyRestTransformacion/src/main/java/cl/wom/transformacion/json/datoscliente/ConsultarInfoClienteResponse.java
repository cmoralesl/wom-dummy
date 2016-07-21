
package cl.wom.transformacion.json.datoscliente;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "respConsultarInfoCliente"
})
public class ConsultarInfoClienteResponse {

    @JsonProperty("respConsultarInfoCliente")
    private RespConsultarInfoCliente respConsultarInfoCliente;

    /**
     * 
     * @return
     *     The respConsultarInfoCliente
     */
    @JsonProperty("respConsultarInfoCliente")
    public RespConsultarInfoCliente getRespConsultarInfoCliente() {
        return respConsultarInfoCliente;
    }

    /**
     * 
     * @param respConsultarInfoCliente
     *     The respConsultarInfoCliente
     */
    @JsonProperty("respConsultarInfoCliente")
    public void setRespConsultarInfoCliente(RespConsultarInfoCliente respConsultarInfoCliente) {
        this.respConsultarInfoCliente = respConsultarInfoCliente;
    }

}
