package Controller;

import Model.PessoaService;

import java.util.List;

public class PessoaController {

    private final PessoaService pessoaService;

    public PessoaController(PessoaService pessoaService) {
        this.pessoaService = pessoaService;
    }
        public void cadastrar(){
        pessoaService.cadastrarPessoa("sarah", "sarahreis895@gmail.com ");
            pessoaService.cadastrarPessoa("leticia", "leticia@gmail.com ");
            pessoaService.cadastrarPessoa("evellyn", "evellyn5@gmail.com ");

    }

    public List<?> mostrar(){
        return pessoaService.listarPessoa();
    }
    public void deletar(int id){
        pessoaService.deletarPessoa(id);
    }

    public void atualizar(int id, String nome){
        pessoaService.atualizarPessoa(id,nome);
    }
}



