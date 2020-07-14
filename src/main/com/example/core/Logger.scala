package com.example.core

import com.example.api.Dog
import org.apache.logging.log4j.LogManager

class Logger(name: String){
	private val logger = LogManager.getLogger(name)
	def print(d:Dog): Unit ={
		logger.info(d)
	}

	def fail()
}