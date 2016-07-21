
package cl.wom.transformacion.json.datoscliente;

import java.util.Date;

import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "ccname",
    "customerCode",
    "customerId",
    "first_name",
    "last_name",
    "nroLineasActivas",
    "deudaVencida",
    "deudaXVencer",
    "direccion",
    "metodoEnvioFactura",
    "email",
    "estadoDeuda",
    "totalApagar",
    "vencimiento",
    "desc",
    "idBillingCycle",
    "fechaIniCiclo",
    "fechaTerCiclo",
    "flagGestor",
    "mercado",
    "lineasSuspendidas",
    "contract"
})
public class Customer {

    @JsonProperty("ccname")
    private String ccname;
    @JsonProperty("customerCode")
    private Double customerCode;
    @JsonProperty("customerId")
    private Integer customerId;
    @JsonProperty("first_name")
    private String firstName;
    @JsonProperty("last_name")
    private String lastName;
    @JsonProperty("nroLineasActivas")
    private Integer nroLineasActivas;
    @JsonProperty("deudaVencida")
    private Integer deudaVencida;
    @JsonProperty("deudaXVencer")
    private Integer deudaXVencer;
    @JsonProperty("direccion")
    private String direccion;
    @JsonProperty("metodoEnvioFactura")
    private String metodoEnvioFactura;
    @JsonProperty("email")
    private String email;
    @JsonProperty("estadoDeuda")
    private String estadoDeuda;
    @JsonProperty("totalApagar")
    private Integer totalApagar;
    @JsonProperty("vencimiento")
    private String vencimiento;
    @JsonProperty("desc")
    private String desc;
    @JsonProperty("idBillingCycle")
    private Integer idBillingCycle;
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd HH:mm a z")
    @JsonProperty("fechaIniCiclo")
    private Date fechaIniCiclo;
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd HH:mm a z")
    @JsonProperty("fechaTerCiclo")
    private Date fechaTerCiclo;
    @JsonProperty("flagGestor")
    private String flagGestor;
    @JsonProperty("mercado")
    private String mercado;
    @JsonProperty("lineasSuspendidas")
    private Integer lineasSuspendidas;
    @JsonProperty("contract")
    private Contract contract;

    /**
     * 
     * @return
     *     The ccname
     */
    @JsonProperty("ccname")
    public String getCcname() {
        return ccname;
    }

    /**
     * 
     * @param ccname
     *     The ccname
     */
    @JsonProperty("ccname")
    public void setCcname(String ccname) {
        this.ccname = ccname;
    }

    /**
     * 
     * @return
     *     The customerCode
     */
    @JsonProperty("customerCode")
    public Double getCustomerCode() {
        return customerCode;
    }

    /**
     * 
     * @param customerCode
     *     The customerCode
     */
    @JsonProperty("customerCode")
    public void setCustomerCode(Double customerCode) {
        this.customerCode = customerCode;
    }

    /**
     * 
     * @return
     *     The customerId
     */
    @JsonProperty("customerId")
    public Integer getCustomerId() {
        return customerId;
    }

    /**
     * 
     * @param customerId
     *     The customerId
     */
    @JsonProperty("customerId")
    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    /**
     * 
     * @return
     *     The firstName
     */
    @JsonProperty("first_name")
    public String getFirstName() {
        return firstName;
    }

    /**
     * 
     * @param firstName
     *     The first_name
     */
    @JsonProperty("first_name")
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * 
     * @return
     *     The lastName
     */
    @JsonProperty("last_name")
    public String getLastName() {
        return lastName;
    }

    /**
     * 
     * @param lastName
     *     The last_name
     */
    @JsonProperty("last_name")
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * 
     * @return
     *     The nroLineasActivas
     */
    @JsonProperty("nroLineasActivas")
    public Integer getNroLineasActivas() {
        return nroLineasActivas;
    }

    /**
     * 
     * @param nroLineasActivas
     *     The nroLineasActivas
     */
    @JsonProperty("nroLineasActivas")
    public void setNroLineasActivas(Integer nroLineasActivas) {
        this.nroLineasActivas = nroLineasActivas;
    }

    /**
     * 
     * @return
     *     The deudaVencida
     */
    @JsonProperty("deudaVencida")
    public Integer getDeudaVencida() {
        return deudaVencida;
    }

    /**
     * 
     * @param deudaVencida
     *     The deudaVencida
     */
    @JsonProperty("deudaVencida")
    public void setDeudaVencida(Integer deudaVencida) {
        this.deudaVencida = deudaVencida;
    }

    /**
     * 
     * @return
     *     The deudaXVencer
     */
    @JsonProperty("deudaXVencer")
    public Integer getDeudaXVencer() {
        return deudaXVencer;
    }

    /**
     * 
     * @param deudaXVencer
     *     The deudaXVencer
     */
    @JsonProperty("deudaXVencer")
    public void setDeudaXVencer(Integer deudaXVencer) {
        this.deudaXVencer = deudaXVencer;
    }

    /**
     * 
     * @return
     *     The direccion
     */
    @JsonProperty("direccion")
    public String getDireccion() {
        return direccion;
    }

    /**
     * 
     * @param direccion
     *     The direccion
     */
    @JsonProperty("direccion")
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * 
     * @return
     *     The metodoEnvioFactura
     */
    @JsonProperty("metodoEnvioFactura")
    public String getMetodoEnvioFactura() {
        return metodoEnvioFactura;
    }

    /**
     * 
     * @param metodoEnvioFactura
     *     The metodoEnvioFactura
     */
    @JsonProperty("metodoEnvioFactura")
    public void setMetodoEnvioFactura(String metodoEnvioFactura) {
        this.metodoEnvioFactura = metodoEnvioFactura;
    }

    /**
     * 
     * @return
     *     The email
     */
    @JsonProperty("email")
    public String getEmail() {
        return email;
    }

    /**
     * 
     * @param email
     *     The email
     */
    @JsonProperty("email")
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * 
     * @return
     *     The estadoDeuda
     */
    @JsonProperty("estadoDeuda")
    public String getEstadoDeuda() {
        return estadoDeuda;
    }

    /**
     * 
     * @param estadoDeuda
     *     The estadoDeuda
     */
    @JsonProperty("estadoDeuda")
    public void setEstadoDeuda(String estadoDeuda) {
        this.estadoDeuda = estadoDeuda;
    }

    /**
     * 
     * @return
     *     The totalApagar
     */
    @JsonProperty("totalApagar")
    public Integer getTotalApagar() {
        return totalApagar;
    }

    /**
     * 
     * @param totalApagar
     *     The totalApagar
     */
    @JsonProperty("totalApagar")
    public void setTotalApagar(Integer totalApagar) {
        this.totalApagar = totalApagar;
    }

    /**
     * 
     * @return
     *     The vencimiento
     */
    @JsonProperty("vencimiento")
    public String getVencimiento() {
        return vencimiento;
    }

    /**
     * 
     * @param vencimiento
     *     The vencimiento
     */
    @JsonProperty("vencimiento")
    public void setVencimiento(String vencimiento) {
        this.vencimiento = vencimiento;
    }

    /**
     * 
     * @return
     *     The desc
     */
    @JsonProperty("desc")
    public String getDesc() {
        return desc;
    }

    /**
     * 
     * @param desc
     *     The desc
     */
    @JsonProperty("desc")
    public void setDesc(String desc) {
        this.desc = desc;
    }

    /**
     * 
     * @return
     *     The idBillingCycle
     */
    @JsonProperty("idBillingCycle")
    public Integer getIdBillingCycle() {
        return idBillingCycle;
    }

    /**
     * 
     * @param idBillingCycle
     *     The idBillingCycle
     */
    @JsonProperty("idBillingCycle")
    public void setIdBillingCycle(Integer idBillingCycle) {
        this.idBillingCycle = idBillingCycle;
    }

    /**
     * 
     * @return
     *     The fechaIniCiclo
     */
    @JsonProperty("fechaIniCiclo")
    public Date getFechaIniCiclo() {
        return fechaIniCiclo;
    }

    /**
     * 
     * @param fechaIniCiclo
     *     The fechaIniCiclo
     */
    @JsonProperty("fechaIniCiclo")
    public void setFechaIniCiclo(Date fechaIniCiclo) {
        this.fechaIniCiclo = fechaIniCiclo;
    }

    /**
     * 
     * @return
     *     The fechaTerCiclo
     */
    @JsonProperty("fechaTerCiclo")
    public Date getFechaTerCiclo() {
        return fechaTerCiclo;
    }

    /**
     * 
     * @param fechaTerCiclo
     *     The fechaTerCiclo
     */
    @JsonProperty("fechaTerCiclo")
    public void setFechaTerCiclo(Date fechaTerCiclo) {
        this.fechaTerCiclo = fechaTerCiclo;
    }

    /**
     * 
     * @return
     *     The flagGestor
     */
    @JsonProperty("flagGestor")
    public String getFlagGestor() {
        return flagGestor;
    }

    /**
     * 
     * @param flagGestor
     *     The flagGestor
     */
    @JsonProperty("flagGestor")
    public void setFlagGestor(String flagGestor) {
        this.flagGestor = flagGestor;
    }

    /**
     * 
     * @return
     *     The mercado
     */
    @JsonProperty("mercado")
    public String getMercado() {
        return mercado;
    }

    /**
     * 
     * @param mercado
     *     The mercado
     */
    @JsonProperty("mercado")
    public void setMercado(String mercado) {
        this.mercado = mercado;
    }

    /**
     * 
     * @return
     *     The lineasSuspendidas
     */
    @JsonProperty("lineasSuspendidas")
    public Integer getLineasSuspendidas() {
        return lineasSuspendidas;
    }

    /**
     * 
     * @param lineasSuspendidas
     *     The lineasSuspendidas
     */
    @JsonProperty("lineasSuspendidas")
    public void setLineasSuspendidas(Integer lineasSuspendidas) {
        this.lineasSuspendidas = lineasSuspendidas;
    }

    /**
     * 
     * @return
     *     The contract
     */
    @JsonProperty("contract")
    public Contract getContract() {
        return contract;
    }

    /**
     * 
     * @param contract
     *     The contract
     */
    @JsonProperty("contract")
    public void setContract(Contract contract) {
        this.contract = contract;
    }

}
