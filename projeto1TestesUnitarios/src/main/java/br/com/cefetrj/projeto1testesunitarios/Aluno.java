/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cefetrj.projeto1testesunitarios;

/**
 * Classe Aluno para exemplificar o uso de testes unitarios e com 100% de cobertura de teste. 
 * @author vinicius
 * @version 1.0
 */

public class Aluno {
    /**
     * O valor do atributo REPROVADO é "Reprovado".
     */
    final static String REPROVADO = "Reprovado";
    
    /**
     * O valor do atributo APROVADO é "Aprovado".
     */
    final static String APROVADO = "Aprovado";
    
    /**
     * Método para verificar a situação do aluno (Aprovado ou Reprovado) na disciplina PSW.
     * @param frequency variável double com a frequência do Aluno na disciplina em porcentagem
     * @param P1 variável double com a nota da primeira prova do aluno
     * @param finalWork variável double com a nota do trabalho final do aluno
     * @param classProjects variável double com a nota dos trabalhos em sala feitos pelo aluno 
     * @param PF variável double com a nota da prova final do aluno
     * @return retorna uma String com a situação do aluno (Aprovado ou Reprovado).
     */
    public String situation (double frequency, double P1, double finalWork, double classProjects, double PF) {
        double M1;
        M1 = 0.7 * ((P1 + finalWork) / 2) + classProjects * 0.3;
        
        if(frequency >= 75.0){
            if(M1 >= 7.0) 
                return APROVADO;
            else if (M1 < 3.0) 
                return REPROVADO;
            else{
                System.out.println("Prova Final");
                if( ((PF + M1) / 2) >= 5.0)
                    return APROVADO;
                else
                    return REPROVADO;
            }
        }else{
            return REPROVADO;
        }
    }
}
