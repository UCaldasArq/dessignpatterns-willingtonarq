package edu.ucaldas.creational;

// TODO: Implementa el patrón Factory Method.
// Crea un método createShape(String type) que devuelva:
// "Circle" → new Circle()
// "Square" → new Square()
// Si el tipo no existe, retorna null.

public class ShapeFactory {
    public Shape createShape(String type) {
        if(type.equals("Circle")){
            Circle circle = new Circle();
            return circle;
        }else if(type.equals("Square")){
            Square square = new Square();
            return square;
        }
        return null;
    }
}

// TODO: Implementa las clases Circle y Square
// Circle → "Dibujando un círculo."
// Square → "Dibujando un cuadrado."
