package view

class InputView {
    fun getPurchasePrice(): Int {
        println("구입금액을 입력해 주세요.")
        return readln().toInt()
    }


}