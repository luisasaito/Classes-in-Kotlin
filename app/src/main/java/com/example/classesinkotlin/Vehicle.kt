package com.example.classesinkotlin

fun main() {
    var vehicle = Vehicle("Vespa Elettrica 45")
    vehicle.print()
    vehicle.speedup()
    vehicle.print()
    vehicle.slowdown()
    vehicle.print()

}

class Vehicle(model: String){
    var model: String
    var velocity: Int
    var acceleration: Int

    init{
        this.model = model
        this.velocity = 0
        this.acceleration = 10
    }

    fun speedup(){
        velocity = acceleration + velocity
    }

    fun slowdown(): Int{
        velocity = acceleration - velocity

        if(velocity < 0)
            velocity = 0

        return velocity
    }

    fun print(){
        println("Model: $model, Velocity: $velocity, Acceleration: $acceleration")
    }
}
