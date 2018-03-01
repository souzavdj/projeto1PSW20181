/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cefetrj.projeto1testesunitarios;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Classe que realiza os testes unitarios para classe Aluno.
 * @author vinicius
 * @version 1.0
 */
public class AlunoTest {
    
    /**
     * Teste do retorno do método situation da classe Aluno quando um aluno é aprovado com media maior ou igual a 7.
     */
    @Test
    public void testMethodSituationApprovedAverage() {
        Aluno instance = new Aluno();
        String expResult = "Aprovado";
        String result = instance.situation(90, 7.0, 6.0, 10.0, 0);
        assertEquals(expResult, result);
    }
    
    /**
     * Teste do retorno do método situation da classe Aluno quando um aluno é aprovado na prova final.
     */
    @Test
    public void testMethodSituationApprovedPF() {
        Aluno instance = new Aluno();
        String expResult = "Aprovado";
        String result = instance.situation(80, 6.0, 7.0, 6.0, 8.0);
        assertEquals(expResult, result);
    }
    
    /**
     * Teste do retorno do método situation da classe Aluno quando um aluno é reprovado por frequência.
     */
    @Test
    public void testMethodSituationDisapprovedFrequency() {
        Aluno instance = new Aluno();
        String expResult = "Reprovado";
        String result = instance.situation(60, 6.0, 5.0, 4.0, 0.0);
        assertEquals(expResult, result);
    }
    
    /**
     * Teste do retorno do método situation da classe Aluno quando um aluno é reprovado na prova final.
     */
    @Test
    public void testMethodSituationDisapprovedPF() {
        Aluno instance = new Aluno();
        String expResult = "Reprovado";
        String result = instance.situation(90, 6.0, 8.0, 5.0, 2.0);
        assertEquals(expResult, result);
    }
    
    /**
     * Teste do retorno do método situation da classe Aluno quando um aluno é reprovado com média menor ou igual a 3.
     */
    @Test
    public void testMethodSituationDisapprovedAverage() {
        Aluno instance = new Aluno();
        String expResult = "Reprovado";
        String result = instance.situation(90, 4.0, 2.0, 3.0, 0.0);
        assertEquals(expResult, result);
    }
    
}
