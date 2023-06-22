class Solution {
    fun solution(today: String, terms: Array<String>, privacies: Array<String>): IntArray {
        var answer: IntArray = intArrayOf()
        var (td_year, td_month) = today.slice(0 .. 6).split(".").map { it.toInt() }
        
        repeat(privacies.size) { i ->
            val (pr_year, pr_month) = privacies[i].slice(0 .. 6).split(".").map { it.toInt() }
            var pr_term = privacies[i].split(" ")[1]
            var (te_terms, te_month) = arrayOf("", "")
            
            val dif_month = (td_year - pr_year) * 12 + (td_month - pr_month)
            
            repeat(terms.size) {
                val (term, term_month) = terms[it].split(" ")
                
                if (term == pr_term) {
                    if (dif_month >= term_month.toInt()) {
                        val pr_day = privacies[i].slice(8 .. 9).toInt()
                        val td_day = today.slice(8 .. 9).toInt()
                        
                        if (td_day >= pr_day) answer += i + 1
                        else if (dif_month > term_month.toInt()) answer += i + 1
                    }
                }
            }
        }
        return answer
    }
}