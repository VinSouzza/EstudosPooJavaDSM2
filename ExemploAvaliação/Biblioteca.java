/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExemploAvaliação;

/**
 *
 * @author vinic
 */
public class Biblioteca {
    private String nome;
    private Livro[] livros = new Livro[5];
    private int totalLivros;
    
    public void inicializar(String nome){
        this.livros = new Livro[5];
        this.nome = nome;
        this.totalLivros = 0;
    }   
    
    public void cadastrarLivro(Livro livro){
        if (this.livros.length < 5){
            this.livros[this.totalLivros] = livro;
            this.totalLivros += 1;
        }else{
            System.out.println("Rejeitado: não é possivel ter mais de 5 livros!");
        }
    }
    
    public Livro buscarLivro(int codigo){
        for (int i = 0; i < this.livros.length; i ++){
            if (this.livros[i].getCodigo() == codigo){
                return this.livros[i];
            }
        }
        return null;
    }
    
    public Livro exibirAcervo(){
        for (int i = 0; i < this.livros.length; i ++){
            return this.livros[i];
        }
        return null;
    }
    
    
        
}
