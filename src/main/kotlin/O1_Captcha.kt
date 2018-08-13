
fun captcha(input: String): Int = calculateCaptcha(input, step = 1)

fun captcha2(input: String): Int = calculateCaptcha(input, step = input.length / 2)

private fun calculateCaptcha(input: String, step: Int): Int {
    var count = 0
    for (iv in input.withIndex()) {
        val current = iv.value.toString().toInt()
        val next = input[(iv.index + step) % input.length].toString().toInt()
        if (current == next) {
            count += current
        }
    }
    return count
}

//TODO
//√ extract step and reuse same iteration mechanism
//- abstract iteration
//- explore making more functional