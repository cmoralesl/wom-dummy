
package cl.wom.transformacion.json.datoscliente;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "contractId",
    "nroCelular",
    "ratePlan",
    "shDes",
    "equipo",
    "tecnologia",
    "tipoContrato",
    "eqSerialNum",
    "estado",
    "fechaActivacion",
    "pin",
    "puk"
})
public class Contract {

    @JsonProperty("contractId")
    private Integer contractId;
    @JsonProperty("nroCelular")
    private Integer nroCelular;
    @JsonProperty("ratePlan")
    private Integer ratePlan;
    @JsonProperty("shDes")
    private String shDes;
    @JsonProperty("equipo")
    private String equipo;
    @JsonProperty("tecnologia")
    private String tecnologia;
    @JsonProperty("tipoContrato")
    private String tipoContrato;
    @JsonProperty("eqSerialNum")
    private String eqSerialNum;
    @JsonProperty("estado")
    private String estado;
    @JsonProperty("fechaActivacion")
    private String fechaActivacion;
    @JsonProperty("pin")
    private String pin;
    @JsonProperty("puk")
    private String puk;

    /**
     * 
     * @return
     *     The contractId
     */
    @JsonProperty("contractId")
    public Integer getContractId() {
        return contractId;
    }

    /**
     * 
     * @param contractId
     *     The contractId
     */
    @JsonProperty("contractId")
    public void setContractId(Integer contractId) {
        this.contractId = contractId;
    }

    /**
     * 
     * @return
     *     The nroCelular
     */
    @JsonProperty("nroCelular")
    public Integer getNroCelular() {
        return nroCelular;
    }

    /**
     * 
     * @param nroCelular
     *     The nroCelular
     */
    @JsonProperty("nroCelular")
    public void setNroCelular(Integer nroCelular) {
        this.nroCelular = nroCelular;
    }

    /**
     * 
     * @return
     *     The ratePlan
     */
    @JsonProperty("ratePlan")
    public Integer getRatePlan() {
        return ratePlan;
    }

    /**
     * 
     * @param ratePlan
     *     The ratePlan
     */
    @JsonProperty("ratePlan")
    public void setRatePlan(Integer ratePlan) {
        this.ratePlan = ratePlan;
    }

    /**
     * 
     * @return
     *     The shDes
     */
    @JsonProperty("shDes")
    public String getShDes() {
        return shDes;
    }

    /**
     * 
     * @param shDes
     *     The shDes
     */
    @JsonProperty("shDes")
    public void setShDes(String shDes) {
        this.shDes = shDes;
    }

    /**
     * 
     * @return
     *     The equipo
     */
    @JsonProperty("equipo")
    public String getEquipo() {
        return equipo;
    }

    /**
     * 
     * @param equipo
     *     The equipo
     */
    @JsonProperty("equipo")
    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    /**
     * 
     * @return
     *     The tecnologia
     */
    @JsonProperty("tecnologia")
    public String getTecnologia() {
        return tecnologia;
    }

    /**
     * 
     * @param tecnologia
     *     The tecnologia
     */
    @JsonProperty("tecnologia")
    public void setTecnologia(String tecnologia) {
        this.tecnologia = tecnologia;
    }

    /**
     * 
     * @return
     *     The tipoContrato
     */
    @JsonProperty("tipoContrato")
    public String getTipoContrato() {
        return tipoContrato;
    }

    /**
     * 
     * @param tipoContrato
     *     The tipoContrato
     */
    @JsonProperty("tipoContrato")
    public void setTipoContrato(String tipoContrato) {
        this.tipoContrato = tipoContrato;
    }

    /**
     * 
     * @return
     *     The eqSerialNum
     */
    @JsonProperty("eqSerialNum")
    public String getEqSerialNum() {
        return eqSerialNum;
    }

    /**
     * 
     * @param eqSerialNum
     *     The eqSerialNum
     */
    @JsonProperty("eqSerialNum")
    public void setEqSerialNum(String eqSerialNum) {
        this.eqSerialNum = eqSerialNum;
    }

    /**
     * 
     * @return
     *     The estado
     */
    @JsonProperty("estado")
    public String getEstado() {
        return estado;
    }

    /**
     * 
     * @param estado
     *     The estado
     */
    @JsonProperty("estado")
    public void setEstado(String estado) {
        this.estado = estado;
    }

    /**
     * 
     * @return
     *     The fechaActivacion
     */
    @JsonProperty("fechaActivacion")
    public String getFechaActivacion() {
        return fechaActivacion;
    }

    /**
     * 
     * @param fechaActivacion
     *     The fechaActivacion
     */
    @JsonProperty("fechaActivacion")
    public void setFechaActivacion(String fechaActivacion) {
        this.fechaActivacion = fechaActivacion;
    }

    /**
     * 
     * @return
     *     The pin
     */
    @JsonProperty("pin")
    public String getPin() {
        return pin;
    }

    /**
     * 
     * @param pin
     *     The pin
     */
    @JsonProperty("pin")
    public void setPin(String pin) {
        this.pin = pin;
    }

    /**
     * 
     * @return
     *     The puk
     */
    @JsonProperty("puk")
    public String getPuk() {
        return puk;
    }

    /**
     * 
     * @param puk
     *     The puk
     */
    @JsonProperty("puk")
    public void setPuk(String puk) {
        this.puk = puk;
    }

}
