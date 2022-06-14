package consultar.cep.project.Model;

import javax.persistence.*;

@Entity
@Table(name="endereco")
public class Endereco {
    @Id
    @Column(name = "end_cep")
    private String cep;

    @Column(name = "end_local")
    private String local;

    @ManyToOne
    @JoinColumn(name = "cid_id", nullable = false)
    private Cidade fk_cidade;

    @ManyToOne
    @JoinColumn(name = "bai_id", nullable = false)
    private Bairro fk_bairro;

    public Endereco(){
    }

    public Endereco(String cep, String local, Cidade fk_cidade, Bairro fk_bairro) {
        this.cep = cep;
        this.local = local;
        this.fk_cidade = fk_cidade;
        this.fk_bairro = fk_bairro;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public Cidade getFk_cidade() {
        return fk_cidade;
    }

    public void setFk_cidade(Cidade fk_cidade) {
        this.fk_cidade = fk_cidade;
    }

    public Bairro getFk_bairro() {
        return fk_bairro;
    }

    public void setFk_bairro(Bairro fk_bairro) {
        this.fk_bairro = fk_bairro;
    }
}
