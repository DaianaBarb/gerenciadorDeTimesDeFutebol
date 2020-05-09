package br.com.codenation;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Time {
    private Long id;
    private String nome;
    private LocalDate dataCriacao;
    private String corUniformePrincipal;
    private  String corUniformeSecundario;
    private  Jogador capitao;
    public List<Jogador> jogadores=new ArrayList<>();

    public void addJogador(Jogador jogador) {
        jogadores.add(jogador);
    }

    public List<Jogador> getJogadores() {
        return jogadores;
    }

    public void setJogadores(List<Jogador> jogadores) {
        this.jogadores = jogadores;
    }

    public Time() {
    }

    public Time(Long id, String nome, LocalDate dataCriacao, String corUniformePrincipal, String corUniformeSecundario, Jogador capitao) {
        this.id = id;
        this.nome = nome;
        this.dataCriacao = dataCriacao;
        this.corUniformePrincipal = corUniformePrincipal;
        this.corUniformeSecundario = corUniformeSecundario;
        this.capitao = capitao;
    }


    public static class TimeBuild{
        Long id;
        String nome;
        LocalDate dataCriacao;
        String corUniformePrincipal;
        String corUniformeSecundario;
        Jogador capitao;
        public TimeBuild setId(Long id) {
            this.id = id;
            return this;
        }
        public TimeBuild setNome(String nome) {
            this.nome = nome;
            return this;
        }
        public TimeBuild setDataDescricao(LocalDate data) {
            this.dataCriacao = data;
            return this;
        }
        public TimeBuild setCorUniformePrincipal(String corUniformePrincipal) {
            this.corUniformePrincipal = corUniformePrincipal;
            return this;
        }
        public TimeBuild setCorUniformeSecundario(String corUniformeSecundario) {
            this.corUniformeSecundario = corUniformeSecundario;
            return this;
        }
        public TimeBuild setNome(Jogador jogador) {
            this.capitao = jogador;
            return this;
        }

        public Time Build(){
            return new Time(id,nome,dataCriacao,corUniformePrincipal,corUniformeSecundario,capitao);
        }

    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.id);
        return hash;
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
        final Time other = (Time) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    public Jogador getCapitao() {
        return capitao;
    }

    public void setCapitao(Jogador capitao) {
        this.capitao = capitao;
    }

    @Override
    public String toString() {
        return "Time{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", dataCriacao=" + dataCriacao +
                ", corUniformePrincipal='" + corUniformePrincipal + '\'' +
                ", corUniformeSecundario='" + corUniformeSecundario + '\'' +
                '}';
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

    public LocalDate getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(LocalDate dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public String getCorUniformePrincipal() {
        return corUniformePrincipal;
    }

    public void setCorUniformePrincipal(String corUniformePrincipal) {
        this.corUniformePrincipal = corUniformePrincipal;
    }

    public String getCorUniformeSecundario() {
        return corUniformeSecundario;
    }

    public void setCorUniformeSecundario(String corUniformeSecundario) {
        this.corUniformeSecundario = corUniformeSecundario;
    }
}
