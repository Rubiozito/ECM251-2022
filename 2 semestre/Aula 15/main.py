from item import Item
from carrinho import Carrinho


item1 = Item('Carregador','Carrega iphone e android', 200.0)

item2 = Item(valor=350, nome='Stray', descricao='Gato')

print(item1)
print(item2)

carrinho = Carrinho()

print(f'Tamanho:')