
class Car {
public Car getObject() {
return this;
}
}
class Zen extends Car {
@Override // Noraml way of Ovveriding
public Car getObject() {
return super.getObject();
}
}
public class CovarientEx extends Car {
@Override // by chnaging return type
public CovarientEx getObject() {
return this;
}
}
