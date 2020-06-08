@Amazon
Feature: Automacao Amazon

#@Compra
#Scenario Outline:  Realizar Pesquisa na Amazon
#   Given eu abro o navegador
#   And acesso o site "<url>"
#   And realizo uma pesquisa por um produto
#   Then seleciono um produto da lista	 
#	 And que especifico as caracteristicas do produto
#   And  adiciono o produto ao carrinho 
#   Then confirmo realizacao da compra
   

@Compra
Scenario Outline:  Realizar Pesquisa na Amazon
   Given eu abro o navegador
   And acesso o site "<url>"
   And realizo uma pesquisa por um produto
   Then seleciono um produto da lista	 

Examples:
 		|			    url 	 			 |
 		|https://www.amazon.com|
 		

@Compra
Scenario: Adicionar Produto ao Carrinho
Given que especifico as caracteristicas do produto
And  adiciono o produto ao carrinho 
Then confirmo realizacao da compra


 	