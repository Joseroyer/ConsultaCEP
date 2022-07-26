package ConsultaCep.consultar.Modal;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name = "cidade")
public class Cidade implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cid_id")
    private Long id;

    @Column(name = "cid_nome")
    private String nome;

    @Column(name = "cid_uf")
    private String estado;

    public Cidade() {

    }

    public Cidade(Long id, String nome, String estado) {
        this.id = id;
        this.nome = nome;
        this.estado = estado;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}