// def list = [2, 1, 1, 2, 4]
// def animals = ["Cat", "Cow", "Chicken"]

// println list
// println animals

// def emptyList = []

// println emptyList

// def nbr = [3, 4, 5, 6, 7]
// println nbr

// def nbr = ["BMW", "TOYOTA", "CHEVROLET"]
// println nbr

class Car {

    String name
    String brand
    BigDecimal price

    Car(String name, String brand, BigDecimal price) {
        this.name = name
        this.brand = brand
        this.price = price
    }
}

// def cars = [
//     new Car('730i', 'BWM', 1500.0),
//     new Car('TrailBlazer', 'Chevrolet', 1200.0),
//     new Car('Fortuner', 'Toyota', 1100.0)
// ]

// for (car in cars) {
//     println "Name: $car.name, Brand: $car.brand, Price: $car.price"
// }

// def nestedList = [['BWM', 'Mercedez Benz'], ['Ford', 'Chevrolet']]
// def nestedList2 = [[1, 1, 1, [1, 1]], 2, [[2], 2]]

// println nestedList
// println nestedList2

// def linkedList = ['BWM', 'Mercedez Benz', 'Ford', 'Chevrolet'] as LinkedList

// println linkedList

// def hetList = ["John Doe", "US", 14000.0, new Car('730i', 'BWM', 1500.0)]

// println hetList

// def cars = ['BWM', 'Mercedez Benz', 'Ford', 'Chevrolet']
// cars.add("Volvo")
// cars.add("Honda")

// println cars

// def cars = ['BWM', 'Mercedez Benz', 'Ford', 'Chevrolet','Volvo', 'Honda']
// String bmw = cars.first()
// String honda = cars.last()
// String head = cars.head()

// println "$head, $bmw and $honda"

// def cars = ['BWM', 'Mercedez Benz', 'Ford', 'Chevrolet','Volvo', 'Honda']

// println cars.init()

// def cars = ['BWM', 'Mercedez Benz', 'Ford', 'Chevrolet','Volvo', 'Honda']

// println cars.tail()

// def cars = ['BWM', 'Mercedez Benz', 'Ford', 'Chevrolet','Volvo', 'Honda']

// println cars.take(3)

// def cars = ['BWM', 'Mercedez Benz', 'Ford', 'Chevrolet','Volvo', 'Honda']

// println cars.takeRight(3)

// def cars = ['BWM', 'Mercedez Benz', 'Ford', 'Chevrolet']
// cars.putAt(2, 'Honda')

// println cars

// def cars = ['BWM', 'Mercedez Benz', 'Ford', 'Chevrolet','Volvo', 'Honda']
// cars.removeAt(0)

// println cars

// def cars = ['BWM', 'Mercedez Benz', 'Ford', 'Chevrolet','Volvo', 'Honda']
// cars.removeLast()

// println cars

// def cars = ['BWM', 'Mercedez Benz', 'Ford', 'Chevrolet','Volvo', 'Honda']
// cars.minus("Ford")

// println cars

// def cars = ['BWM', 'Mercedez Benz', 'Ford', 'Chevrolet','Volvo', 'Honda']

// println cars.drop(3)

// def cars = ['BWM', 'Mercedez Benz', 'Ford', 'Chevrolet','Volvo', 'Honda']

// println cars.dropRight(3)

// def cars = ['BWM', 'Mercedez Benz', 'Ford', 'Chevrolet','Volvo', 'Honda']
// def cars2 = cars

// println cars2

// def cars = ['BWM', 'Mercedez Benz', 'Ford', 'Chevrolet','Volvo', 'Honda']
// def motorcycles = ['Ducati', 'Yamaha', 'Suzuki']

// cars.addAll(motorcycles)

// println cars

// def employees = ['John Doe', 'Jane Doe', 'Frank Doedoel']
// def salaries = [2000.0, 2500.0, 3000.0]

// def newlist = employees + salaries

// println newlist

// def cars = ['BWM', 'Mercedez Benz', 'Ford', 'Chevrolet','Volvo', 'Honda']
// cars.each { car ->
//     println car
// }

// def cars = ['BWM', 'Mercedez Benz', 'Ford', 'Chevrolet','Volvo', 'Honda']
// cars.eachWithIndex { car, idx ->
//     println idx + 1 + ": " + car
// }

// def cars = ['BWM', 'Mercedez Benz', 'Ford', 'Chevrolet','Volvo', 'Honda']

// for (car in cars) {
//     println car
// }

// def cars = [
//     new Car('730i', 'BMW', 1500.0),
//     new Car('TrailBlazer', 'Chevrolet', 1200.0),
//     new Car('520i', 'BMW', 1440.0),
//     new Car('320i', 'BMW', 1300.0),
//     new Car('Fortuner', 'Toyota', 1100.0)
// ]

// def allBmw = cars.findAll { car -> car.brand.equals('BMW') }

// allBmw.each { a ->
//     println "Model: $a.name, Brand: $a.brand, Price: $a.price"
// }

// def nbrs = [2, 3, 4, 5, 6, 8, 9, 9, 3, 4, 5, 3, 3]

// println nbrs.findAll { it == 3 }

// def nbrs = [2, 3, 4, 5, 6, 8, 11, 9, 21, 4, 5, 1, 23]

// println nbrs.sort()

def cars = ['BWM', 'Mercedez Benz', 'Ford', 'Chevrolet','Volvo', 'Honda']

println cars.sort { it.length() }
println cars.sort { a, b -> a.length() <=> b.length() }
println cars.sort { a, b -> b.length() <=> a.length() }

