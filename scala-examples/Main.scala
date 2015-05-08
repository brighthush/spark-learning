/**
 * Created by bright on 15-5-8.
 */

import demo.Account

object Main {
  def main(args: Array[String]): Unit = {
    println("Hello World.")
    var a = Account(0.1)
    var b = Account(0.2)
    println("id " + a.id + " balance " + a.balance)
    println("id " + b.id + " balance " + b.balance)
  }
}
