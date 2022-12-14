O GOF define que os Design Patterns são divididos entre 3 principais
categorias:

* Comportamento
* Estrutural
* Criação

# Criação

## Singleton

Possui as seguintes caraceterísticas:

* A classe é responsavel por gerir o seu ciclo de vida
* É estático por natureza 
* A sua implementação deve ser Thread Safe
* A sua instância é de acesso privado
* O seu construtor é de acesso privado
* Não deve haver paramêtros no construtor

Quando for utilizado este padrão, deve ter como situação:

* Garantir somente uam única instância de determinado objeto
* É de fácil implementação

Os seus principais pontos fracos são:

* Difícieis de realizar testes unitários
* Se não estiver bem implementado, acaba não sendo thread-safe