🚗 Consulta Tabela FIPE - Java & Spring Boot

Aplicação console desenvolvida em Java para consulta de preços médios de veículos (carros, motos e caminhões) utilizando a API pública da FIPE.
📋 Sobre o Projeto

O projeto permite que o usuário navegue por menus interativos para:

    Escolher o tipo de veículo (Carro, Moto ou Caminhão).

    Listar e selecionar uma Marca.

    Buscar e filtrar Modelos por um trecho do nome.

    Visualizar os valores de avaliação da FIPE para todos os anos disponíveis do modelo selecionado.

O fluxo de dados foi construído utilizando Java Streams e a biblioteca Jackson para desserialização de JSON, seguindo os conceitos de Orientação a Objetos e boas práticas de consumo de APIs.
🛠️ Tecnologias Utilizadas

    Java 17

    Spring Boot (Estrutura do projeto)

    Jackson Databind (Manipulação de JSON)

    Java HttpClient (Requisições HTTP)

    Maven (Gerenciador de dependências)

🏗️ Arquitetura e Fluxo de Dados

A aplicação segue uma separação de responsabilidades clara:

    Service: Contém a classe ConsultaApi para requisições e ConverteDados para transformar JSON em objetos Java.

    Model: Records que representam a estrutura de dados (Dados, Modelos, Veiculos).

    Principal: Classe que gerencia a interação com o usuário via console.

🚀 Como Executar

    Clone o repositório:
    Bash

    git clone https://github.com/LuandaLl/TabelaFipe.git

    Certifique-se de ter o Maven e o JDK 17+ instalados.

    Importe o projeto em sua IDE (IntelliJ, Eclipse ou VS Code).

    Execute a classe TabelaFibeAplicationApplication.

📖 Exemplo de Uso

Ao iniciar, o programa solicitará o tipo de veículo. Após as seleções, o resultado será exibido no console:
Plaintext

Digite por favor o código do modelo desejado para buscar os valores de avaliação 
9637
Todos os veiculos: 
Veiculo[valor=R$ 68.450,00, marca=Suzuki, modelo=DL 1050 XT V-STROM, ano=2021, tipoCombustivel=Gasolina]
Veiculo[valor=R$ 72.100,00, marca=Suzuki, modelo=DL 1050 XT V-STROM, ano=2022, tipoCombustivel=Gasolina]

🤝 Contribuições
Este projeto foi desenvolvido como parte de um desafio de aprendizado na Alura. Sinta-se à vontade para abrir Issues ou enviar Pull Requests!
