package com.example.jeninstest

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping
class UserController {
    @GetMapping("/user")
    fun showUser(): User = User("mahmoud", 19)
}