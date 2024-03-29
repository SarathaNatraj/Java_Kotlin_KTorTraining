import kotlin.math.roundToInt

class GradeCalculator {

    var totalMarks = 0

    fun getGrade(obtainedMarks: Int, totalMarks: Int): String {
        val percentage = getPercentage(obtainedMarks, totalMarks)
        return when {
            percentage >= 90 -> "A"
            percentage in 80..89 -> "B"
            percentage in 70..79 -> "C"
            percentage in 60..69 -> "D"
            else -> "F"
        }
    }

    private fun getPercentage(obtained: Int, total: Int): Int {
        return  (obtained / total.toFloat() * 100).roundToInt()
    }
}