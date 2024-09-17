/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exAnimal;

public class Animais {

    private String nome;
    private String classe;
    private String familia;
    private Integer idade;
    private Boolean estado;
    private Integer caloria;
    private Integer forca;

    public Animais(String nome, String classe, String familia, Integer idade, Boolean estado, Integer caloria, Integer forca) {
        this.nome = nome;
        this.classe = classe;
        this.familia = familia;
        this.idade = idade;
        this.estado = estado;
        this.caloria = caloria;
        this.forca = forca;
    }

    public Animais(String nome, String classe, String familia) {
        this.nome = nome;
        this.classe = classe;
        this.familia = familia;
        this.forca = 10;
        this.caloria = 10;
        this.idade = 0;
        this.estado = true;
    }

    public String getNome() {
        return nome;
    }

    public String getClasse() {
        return classe;
    }

    public String getFamilia() {
        return familia;
    }

    public Integer getIdade() {
        return idade;
    }

    public Boolean getEstado() {
        return estado;
    }

    public Integer getCaloria() {
        return caloria;
    }

    public Integer getForca() {
        return forca;
    }
    
    public String nasceu() {
        return "\nO animal se chama " +this.getNome()+ ", pertence a classe " +this.getClasse()+ " da familia " +this.getFamilia()+ ".\n" +this.getNome()+ " possui forca = " +this.getForca()+ ", caloria = " +this.getCaloria()+ " e idade = " +this.getIdade();
    }
    
    public String morrer() {
        this.forca = 0;
        this.estado = false;
        
        return "O animal morreu! D:";
    }
    
    public String comer() {
        String mensagem;
        if (this.caloria < 100 && this.forca > 0) {
            this.forca -= 2;
            this.caloria +=10;
            
            mensagem = "O animal comeu!\nForca = " +this.getForca()+ " Calorias = " +this.getCaloria();
        } else {
            mensagem = "O animal nao quer comer agora!\nForca = " +this.getForca()+ " Calorias = " +this.getCaloria();
        }
        
        return mensagem;
    }
    
    public String correr() {
        String mensagem;
        if(this.forca > 0 && this.caloria > 0) {
            this.forca -= 5;
            this.caloria -=5;
            
            mensagem = "O animal correu!\nForca = " +this.getForca()+ " Calorias = " +this.getCaloria();
        } else {
            mensagem = "O animal nao quer correr!\nForca = " +this.getForca()+ " Calorias = " +this.getCaloria();
        }
        
        return mensagem;
    }
    
    public String dormir() {
        String mensagem;
        if(this.forca < 100 && this.caloria > 0) {
            this.forca += 10;
            this.caloria -= 2;
            
            mensagem = "O animal dormiu!\nForca = " +this.getForca()+ " Calorias = " +this.getCaloria();
        } else {
            mensagem = "O animal nao quer dormir agora!\nForca = " +this.getForca()+ " Calorias = " +this.getCaloria();
        }
        
        return mensagem;
    }
}
