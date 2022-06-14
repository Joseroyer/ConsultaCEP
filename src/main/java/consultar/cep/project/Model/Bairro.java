package consultar.cep.project.Model;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name="bairro")
public class Bairro implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="bai_id")
    private Long id;

    @Column(name="bai_nome")
    private String nome;

    @ManyToOne
    @JoinColumn(name = "cid_id", nullable = false)
    private Cidade fk_cidade;

    public Bairro(){

    }

    public Bairro(Long id, String nome, Cidade fk_cidade) {
        this.id = id;
        this.nome = nome;
        this.fk_cidade = fk_cidade;
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

    public Cidade getFk_cidade() {
        return fk_cidade;
    }

    public void setFk_cidade(Cidade fk_cidade) {
        this.fk_cidade = fk_cidade;
    }
}
