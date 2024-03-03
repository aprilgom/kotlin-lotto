package model

class LottoCounter(
    budget: Money,
) {
    var remain = calculateCount(budget)
        private set

    init {
        require(budget % PRICE_OF_LOTTO == Money(0))
    }

    fun reduce(count: Int) {
        require(remain >= count) { "가지고 있는 돈보다 더 많이 살 수 없습니다." }
        remain -= count
    }

    private fun calculateCount(money: Money): Int {
        val count = (money / PRICE_OF_LOTTO) ?: 0f
        return count.toInt()
    }

    companion object {
        private val PRICE_OF_LOTTO = Money(1000)
    }
}
