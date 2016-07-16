package br.com.quebreseuslimites.vidaepica.model;

import java.util.ArrayList;

/**
 * Created by Neto on 09/07/2016.
 */
public class Pessoa
{
    private String nome;
    private int sexo;
    private int idade;
    public final int MASCULINO = 1;
    public final int FEMININA = 2;
    private String email;
    private ArrayList<Personalidade> personalidades; //1 personalidade ativa e as demais serão o histórico
    private ArrayList<Missao> missoes; // 1 missão ativa e as demais serão o histórico
    private ArrayList<Papel> papeis; //a pessoa terá vários papeis que desempenha na socidade
    private ArrayList<AreaControle> areasControle; //a pessoa terá que equilibrar várias áreas da vida
    private ArrayList<VisaoFuturo> visoesFuturo; //a pessoa pode ter vários visões de si a depender dos papéis/areas de controle
    private ArrayList<Desafio> desafios; //a pessoa terá vários desafios



    public ArrayList<Desafio> getDesafios() {
        return desafios;
    }

    public void setDesafios(ArrayList<Desafio> desafios) {
        this.desafios = desafios;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getSexo() {
        return sexo;
    }

    public void setSexo(int sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ArrayList<Personalidade> getPersonalidades()
    {
        if (personalidades == null)
        {
            personalidades = new ArrayList<Personalidade>();
        }
        return personalidades;
    }

    public void setPersonalidades(ArrayList<Personalidade> personalidades) {
        this.personalidades = personalidades;
    }

    public ArrayList<Missao> getMissoes()
    {
        if (missoes == null)
        {
            missoes = new ArrayList<Missao>();
        }
        return missoes;
    }

    public void setMissoes(ArrayList<Missao> missoes) {
        this.missoes = missoes;
    }

    public ArrayList<Papel> getPapeis()
    {
        if (papeis == null)
        {
            papeis = new ArrayList<Papel>();
        }
        return papeis;
    }

    public void setPapeis(ArrayList<Papel> papeis) {
        this.papeis = papeis;
    }

    public ArrayList<AreaControle> getAreasControle()
    {
        if (areasControle == null)
        {
            areasControle = new ArrayList<AreaControle>();
        }
        return areasControle;
    }

    public void setAreasControle(ArrayList<AreaControle> areasControle) {
        this.areasControle = areasControle;
    }

    public ArrayList<VisaoFuturo> getVisoesFuturo()
    {
        if (visoesFuturo == null)
        {
            visoesFuturo = new ArrayList<VisaoFuturo>();
        }
        return visoesFuturo;
    }

    public void setVisoesFuturo(ArrayList<VisaoFuturo> visoesFuturo) {
        this.visoesFuturo = visoesFuturo;
    }
}
