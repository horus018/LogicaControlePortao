package controleportão;

public class ControlePortão implements Controlador {

    private String status;
    private String ultimoStatus;

    public String getUltimoStatus() {
        return ultimoStatus;
    }

    public void setUltimoStatus(String ultimoStatus) {
        this.ultimoStatus = ultimoStatus;
    }

    public ControlePortão() {
        this.status = "Parado";
        this.ultimoStatus = "Fechado"; //aqui o portao informa pa nois o estado dele
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public void abrirFechar() {
        if (getStatus() == "Parado" && getUltimoStatus() == "Abrindo") {
            setStatus("Fechando");
            setUltimoStatus("Fechando");
        }
        
        if (getStatus() == "Parado" && getUltimoStatus() == "Fechando") {
            setStatus("Abrindo");
            setUltimoStatus("Abrindo");
        }
        
        if (getStatus() == "Abrindo") {
            setStatus("Parado");
        }
        
        if (getStatus() == "Fechando") {
            setStatus("Parado");
        }

    }

}
