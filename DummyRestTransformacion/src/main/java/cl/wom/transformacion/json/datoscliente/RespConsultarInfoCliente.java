
package cl.wom.transformacion.json.datoscliente;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "ConsultaInfoClienteRutResponse",
    "numEvent",
    "errorCode",
    "errorDescription"
})
public class RespConsultarInfoCliente {

    @JsonProperty("ConsultaInfoClienteRutResponse")
    private ConsultaInfoClienteRutResponse consultaInfoClienteRutResponse;
    @JsonProperty("numEvent")
    private String numEvent;
    @JsonProperty("errorCode")
    private String errorCode;
    @JsonProperty("errorDescription")
    private String errorDescription;

    /**
     * 
     * @return
     *     The consultaInfoClienteRutResponse
     */
    @JsonProperty("ConsultaInfoClienteRutResponse")
    public ConsultaInfoClienteRutResponse getConsultaInfoClienteRutResponse() {
        return consultaInfoClienteRutResponse;
    }

    /**
     * 
     * @param consultaInfoClienteRutResponse
     *     The ConsultaInfoClienteRutResponse
     */
    @JsonProperty("ConsultaInfoClienteRutResponse")
    public void setConsultaInfoClienteRutResponse(ConsultaInfoClienteRutResponse consultaInfoClienteRutResponse) {
        this.consultaInfoClienteRutResponse = consultaInfoClienteRutResponse;
    }

    /**
     * 
     * @return
     *     The numEvent
     */
    @JsonProperty("numEvent")
    public String getNumEvent() {
        return numEvent;
    }

    /**
     * 
     * @param numEvent
     *     The numEvent
     */
    @JsonProperty("numEvent")
    public void setNumEvent(String numEvent) {
        this.numEvent = numEvent;
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
