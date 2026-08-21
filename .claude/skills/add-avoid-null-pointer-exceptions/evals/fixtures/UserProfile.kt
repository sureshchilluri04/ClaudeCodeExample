package com.example.claudecodeexample

class UserProfile {

    var name: String? = null
    var email: String? = null
    lateinit var config: AppConfig

    fun printGreeting() {
        println("Hello, " + name!!.uppercase())
    }

    fun getEmailDomain(): String {
        return email!!.substring(email!!.indexOf("@") + 1)
    }

    fun loadConfig(): String {
        return config.serverUrl
    }

    fun describeUser(user: User?): String {
        if (user != null) {
            return "User: " + user.name + ", age " + user.age
        }
        return "Unknown user"
    }

    fun validNames(rawNames: List<String?>): List<String> {
        val result = mutableListOf<String>()
        for (n in rawNames) {
            result.add(n!!)
        }
        return result
    }
}

class AppConfig(val serverUrl: String)

class User(val name: String, val age: Int)