package restaurante

class Cliente {
    Integer id
    String nome
    String email
    String senha

    static hasMany = [pedidos:Pedido]

     static constraints = {
    }
}
