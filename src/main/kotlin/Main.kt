fun main() {
    println("Кол-во  идущих подряд одинаковых символов в данной строке: " + pervaya(readln()))
}
fun pervaya(string: String): String {
var a = string[0]
var result = ""
var count = 1
var i = 1
for (item in string.substring(1)) {
i++
if (a != item || i == string.length) {
if (count > 1) {
result += "$a$count"
} else {
result += a
}
count = 1
a = item
} else {
count++
}
}
return result
}