package br.com.codenation;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Objects;

public class Jogador {

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 41 * hash + Objects.hashCode(this.id);
        return hash;
    }

    public Jogador() {
    }

    public Jogador(Long id, Long idTime, String nome, LocalDate dataNascimento, Integer nivelHabilidade, BigDecimal salario) {
        this.id = id;
        this.idTime = idTime;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.nivelHabilidade = nivelHabilidade;
        this.salario = salario;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Jogador other = (Jogador) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }
    private  Long id;
    private  Long idTime;
    private  String nome;
    private  LocalDate dataNascimento;
    private  Integer nivelHabilidade;
    private   BigDecimal salario;
    public static class JogadorBuild{
        Long id;
        Long idTime;
        String nome;
        LocalDate dataNascimento;
        Integer nivelHabilidade;
        BigDecimal salario;
        public JogadorBuild setSalario(BigDecimal salario) {
            this.salario = salario;
            return this;
        }
        public JogadorBuild setNivelHabilidade(Integer nivelHabilidade) {
            this.nivelHabilidade= nivelHabilidade;
            return this;
        }


        public JogadorBuild setLocalDate(LocalDate data) {
            this.dataNascimento = data;
            return this;
        }
        public JogadorBuild setNome(String nome) {
            this.nome = nome;
            return this;
        }
        public JogadorBuild setId(Long id) {
            this.id = id;
            return this;
        }
        public JogadorBuild setIdTime(Long idTime) {
            this.idTime = idTime;
            return this;
        }

        public Jogador Build(){
            return new Jogador(id,idTime,nome,dataNascimento,nivelHabilidade,salario);
        }

    }

    @Override
    public String toString() {
        return "Jogador{" +
                "id=" + id +
                ", idTime=" + idTime +
                ", nome='" + nome + '\'' +
                ", dataNascimento=" + dataNascimento +
                ", nivelHabilidade=" + nivelHabilidade +
                ", salario=" + salario +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdTime() {
        return idTime;
    }

    public void setIdTime(Long idTime) {
        this.idTime = idTime;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Integer getNivelHabilidade() {
        return nivelHabilidade;
    }

    public void setNivelHabilidade(Integer nivelHabilidade) {
        this.nivelHabilidade = nivelHabilidade;
    }

    public BigDecimal getSalario() {
        return salario;
    }

    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }


}
