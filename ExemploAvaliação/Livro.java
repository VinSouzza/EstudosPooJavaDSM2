/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExemploAvaliação;

/**
 *
 * @author vinic
 */
public class Livro {
    private int codigo;
    private String titulo;
    private String autor;
    private boolean disponivel;
    
    public void inicializar(int cod, String titulo, String autor){
        this.disponivel = true;
        this.codigo = cod;
        this.titulo = titulo;
        this.autor = autor;
    }
    
    public void emprestar(){
        if (this.disponivel == true){
            this.disponivel = false;
        }else{
            System.out.println("Livro já emprestado!");
        }
    }
    
    public void devolver(){
        if (this.disponivel = false){  
            this.disponivel = true;
        }else{
            System.out.println("Livro já está disponivel!");
        }
    }

    public int getCodigo() {
        return codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }
    
    
    
    
}
