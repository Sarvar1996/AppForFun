package com.example.tablayouttask

import java.io.Serializable

class Food : Serializable{
        var name: String? = null
        var image: Int? = null
        var description: String? = null
        var date: Int?=null

        constructor(name: String?=null, image: Int?=null, description: String?=null,date:Int?=null) {
            this.description = description
            this.name = name
            this.image = image
            this.date = date
        }

    }
