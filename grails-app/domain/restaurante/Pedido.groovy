package restaurante

class Pedido {

    Date dataHora
    Double valorTotal

    static hasOne = [cliente:Cliente]

    static constraints = {
    }

}
