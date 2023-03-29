package Prototype;

public class Exame implements Cloneable {
    private int codExame;
    private String nomePaciente;
    private String convenio;
    private String especialidadeMedico;
    private int crmMedico;
    private String nomeMedico;
    private Endereco endereco;

    public Exame(int codExame, String nomePaciente, String convenio, String especialidadeMedico, int crmMedico, String nomeMedico, Endereco endereco) {
        this.codExame = codExame;
        this.nomePaciente = nomePaciente;
        this.convenio = convenio;
        this.especialidadeMedico = especialidadeMedico;
        this.crmMedico = crmMedico;
        this.nomeMedico = nomeMedico;
        this.endereco = endereco;
    }

    public int getCodExame() {
        return codExame;
    }

    public void setCodExame(int codExame) {
        this.codExame = codExame;
    }

    public String getNomePaciente() {
        return nomePaciente;
    }

    public void setNomePaciente(String nomePaciente) {
        this.nomePaciente = nomePaciente;
    }

    public String getConvenio() {
        return convenio;
    }

    public void setConvenio(String convenio) {
        this.convenio = convenio;
    }

    public String getEspecialidadeMedico() {
        return especialidadeMedico;
    }

    public void setEspecialidadeMedico(String especialidadeMedico) {
        this.especialidadeMedico = especialidadeMedico;
    }

    public int getCrmMedico() {
        return crmMedico;
    }

    public void setCrmMedico(int crmMedico) {
        this.crmMedico = crmMedico;
    }

    public String getNomeMedico() {
        return nomeMedico;
    }

    public void setNomeMedico(String nomeMedico) {
        this.nomeMedico = nomeMedico;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public Exame clone() throws CloneNotSupportedException {
        Exame exameClone = (Exame) super.clone();
        exameClone.endereco = (Endereco) exameClone.endereco.clone();
        return exameClone;
    }

    @Override
    public String toString() {
        return "Exame{" +
                "codExame=" + codExame +
                ", nomePaciente='" + nomePaciente + '\'' +
                ", convenio='" + convenio + '\'' +
                ", especialidadeMedico='" + especialidadeMedico + '\'' +
                ", crmMedico=" + crmMedico +
                ", nomeMedico='" + nomeMedico + '\'' +
                ", endereco=" + endereco +
                '}';
    }
}