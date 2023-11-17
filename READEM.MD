Projeto prático
1. Projeto prático 4
a. Fork do projeto
- https://github.com/EmerF/aulas_bee_projeto_pratico4
b. Adicionar configs para usar o mongo
c. Criar as classes para representar os produtos:
- Campos comuns:
- id, nome, descricao, preco
- Água(com gás/sem gás)
- Refrigerante(com/sem açucar)
d. Criar uma action no github que rodar:
- comando mvn clean
- comando mvn install sem executar os testes
- a action deverá disparada quando houver push na branch com
seu nome
- a action deverá ser feita criando um arquivo que conterá
todos os comandos necessários. Verificar docs das aulas para
tirar dúvidas

e. Criar arquivo de texto em src/main/resources com nome
cmd_git.txt. Esse arquivo deverá ter os comandos para:
- pausar um trabalho em execução, que permita trocar de
branch
- retomar o trabalho pausado no item acima
- criar um alias do comando que adiciona todos os arquivos
para área de stage
- comando que permita voltar o estado do repositório para um
commit específico
- o arquivo deverá ter um comando em cada linha, com “;” no
final da linha. Ex:
- git …. ;
- git … ;

f. Criar um endpoint para cada caso:
- salva o produto no banco
- buscar produto no banco usando com parâmetro id
- buscar produto no banco usando com parâmetro nome
- buscar todos os produtos cadastrados
g. Enviar o projeto via pull request para o endereço onde foi
clonado o projeto até o dia 18/11/23 às 23:59