/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import armazenamento.MeioArmazenamento;
import java.util.ArrayList;
import java.util.Date;
import modelo.Equipamento;
import modelo.Manutencao;

/**
 *
 * @author marcelo
 */
public class EquipamentoControle {
    
    public static void receberDadosCadastroEquipamento(String nome, String patrimonio, Date dataAquisicao, Date dateTeminoGarantia, float valor){
        Equipamento objetoEquipamento = new Equipamento();
        objetoEquipamento.setNome(nome);
        objetoEquipamento.setPatrimonio(patrimonio);
        objetoEquipamento.setDataAquisicao(dataAquisicao);
        objetoEquipamento.setDataTerminoGarantia(dateTeminoGarantia);
        objetoEquipamento.setValor(valor);
        objetoEquipamento.salvar();
    }
    
    public static ArrayList<Equipamento> obterListaEquipamentos(){
        return Equipamento.obterLista();
    }
    
    public static Equipamento obterEquipamentoPeloNumeroDoPatrimonio(String numeroPatrimonio){
        return Equipamento.obterPeloNumero(numeroPatrimonio);
    }
    
    public static void receberDadosNovaManutencao(String numeroPatrimonio, String descricao, Date data, float valor){
        Equipamento encontrado = Equipamento.obterPeloNumero(numeroPatrimonio);
        Manutencao novaManutencao = new Manutencao();
        novaManutencao.setData(data);
        novaManutencao.setDescricao(descricao);
        novaManutencao.setValor(valor);
        
        
        
        
        encontrado.adicionaManutencao(novaManutencao);
        //encontrado.salvar();
        //método salvar não necessário por enquanto pois, como os dados estão em memória, o próprio objeto manipulado é o mesmo do meio de armazenamento
    }
    
}
