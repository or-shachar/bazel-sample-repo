package com.example.app

import com.example.api.Dog
import com.example.core.Logger

object WalkerApp extends App{

  private def walkerInfo(walker: Walker):Unit = {
    val logger = new Logger(walker.name)
    walker.dogs.foreach(logger.print)
  }

  val dog1 = Dog("Charlie","Labrador")
  val dog2 = Dog("Bella","Poodle")

  val danny = Walker(name = "danny",dogs = Seq(dog1,dog2))
  walkerInfo(danny)
}
