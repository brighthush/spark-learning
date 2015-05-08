package demo

import scala.collection.mutable.ArrayBuffer

class Person {
  private var privateName: String = ""
  private var privateAge: Int = 0

  def this(name: String) {
    this()
    privateName = name
  }

  def this(name: String, age: Int) {
    this(name)
    privateAge = age
  }

  def name = privateName
  def name_=(newName: String): Unit = {
    privateName = newName
  }

  def age = privateAge
  def age_=(newAge: Int): Unit = {
    if(newAge > privateAge) privateAge = newAge
  }
}

class Network {
  class Member(val name: String) {
    val contacts = new ArrayBuffer[Member]
  }

  val members = new ArrayBuffer[Member]

  def join(name: String) = {
    val m = new Member(name)
    members += m
    m
  }
}

class Account private(val id: Int, initialBalance: Double){
  private var privateBalance = initialBalance
  def deposit(amount: Double): Unit = {
    privateBalance += amount
  }

  def balance = privateBalance

}

object Account {
  def apply(initialBalance: Double) = {
    new Account(newUniqueNumber(), initialBalance)
  }
  private var lastNumber = 0
  private def newUniqueNumber() = { lastNumber += 1; lastNumber}
}

