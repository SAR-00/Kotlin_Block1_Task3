fun main() {

    val regularUser = true
    val minAmountForDiscount = 1001
    var amount = 15_000

    if (amount >= minAmountForDiscount) {
        val discount = if (amount in 1001..10_000) 100 else amount / 100 * 5
        amount -= discount
    }

    if (regularUser) amount -= amount / 100
}