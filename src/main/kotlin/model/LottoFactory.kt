package model

class LottoFactory(
    private val lottoTicketGenerator: LottoTicketGenerator,
) {
    fun makeLottoTickets(count: Int): List<LottoTicket> =
        List(count) { lottoTicketGenerator.generate() }
}
