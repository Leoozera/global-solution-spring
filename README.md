# Video PITCH

-> https://www.youtube.com/watch?v=0pdpH417Gz8

# Observações

Devido a problemas de ambiente, comentamos o código que envolve a segurança pois a biblioteca do EXPO utilizada no react native em mobile, pois o emulador de android estava tendo as requisições bloqueadas. Desta forma, foi necessário comentar para seguir a entrega, no entanto foi seguido exatamente ao PDF.

# Rotas da API 

### Consumidor

-> Método *POST*

-> /consumidor

-> Criar um consumidor

```
{
    "nome": "Leonard",
    "email": "leoozera7@gmail.com",
    "telefone": "11965823342",
    "cpf": "022422014836",
    "idade": 19,
    "endereco": {
        "rua": "Rua doutor albuquerque lins",
        "complemento": "próximo a banca",
        "bairro": "santa cecilia",
        "estado": "SP",
        "cidade": "São paulo"
    }
}

```

-> Método *GET*

-> /consumidor

-> Buscar consumidores

```
{
}
```

-> Método *DELETE*

-> /consumidor

-> Deletar o consumidor enviado

```
{
    "id": 1
}
```

### Restaurante


-> Método *GET*

-> /restaurante

-> Buscar restaurantes

```
{
}
```


-> Método *POST*

-> /restaurante

-> Criar um restaurante

``` 
{
    "nome": "Restaurante do joseph",
    "descricao": "O melhor de guaianases",
    "cnpj": "012313131",
    "nota": 4.90,
    "endereco": {
        "rua": "Rua doutor albuquerque lins",
        "complemento": "próximo a banca",
        "bairro": "santa cecilia",
        "estado": "SP",
        "cidade": "São paulo"
    }
}
```
-> Método *DELETE*

-> /restaurante

-> Deletar o restaurante enviado

```
{
    "id": 1
}
```
### Produto

-> Método *GET*

-> /produto

-> Buscar produtos

```
{
}
```


-> Método *POST*

-> /produto

-> Criar um produto

```
{
    "titulo": "Strogonoff do Joseph",
    "descricao": "O Melhor de guaianases",
    "preco": 30.00,
    "estoque": 1
}
```

-> Método *PUT*

-> /produto

-> Editar um produto

``` 
{
    "id": 1,
    "titulo": "Produto com titulo alterado",
    "estoque": 10
}
```

-> Método *DELETE*

-> /produto

-> Deletar o produto enviado


```
{
    "id": 1
}
```

### Pedidos

-> Método *GET*

-> /pedidos

-> Buscar pedidos

```
{
}
```

-> Método *POST*

-> /pedidos

-> Criar um pedido

```
{
    "consumidor_id": 1,
    "restaurante_id": 1,
    "produto_id": 1,
    "endereco": {
        "rua": "Rua doutor albuquerque lins",
        "complemento": "próximo a banca",
        "bairro": "santa cecilia",
        "estado": "SP",
        "cidade": "São paulo"
    }
}
```


-> Método *PUT*

-> /pedidos

-> Editar um pedido

``` 
{
    "id": 1,
    "status": "FINALIZADO"
}
```
-> Método *DELETE*

-> /pedidos

-> Cancelar um pedido

```
{
    "id": 1
}
```