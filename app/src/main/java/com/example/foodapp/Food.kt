package com.example.foodapp

class Food {
    var name:String?=null
    var des:String?=null
    var image:Int?=null
    constructor(name:String, image:Int, des:String){
        this.name = name
        this.image = image
        this.des = des
    }
}