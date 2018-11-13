import scala.util.matching.Regex

object Regexes extends hw.regex.RegexLike {
  def notAlphanumeric: Regex = """(\W)*""".r
  def time: Regex = """(1[0-2]|0?\d):[0-5]\d""".r
  def phone: Regex ="""\(\d{3}\) \d{3}-\d{4}""".r
  def zip: Regex = """\d{5}|(\d{5}-\d{4})""".r
  def comment: Regex ="\\/\\*.*\\*\\/".r
  def numberPhrase: Regex = """(twenty|thirty|forty|fifty|sixty|seventy|eighty|ninety)(-(one|two|three|four|five|six|seven|eight|nine))?""".r
  def roman: Regex = """^[XVI]*$""".r
  def date: Regex ="""\d{4}-(((0[13578]|1[02])-(0\d|[12]\d|3[01]))|((0[469]|11)-(0\d|[12]\d|30))|(02-(0\d|1\d|2[0-8])))|(\d{2}(([02468][048])|([13579][26]))-(02)-(29))""".r
  def evenParity: Regex = """(([02468]*[13579]){2})*[02468]*""".r
  
}