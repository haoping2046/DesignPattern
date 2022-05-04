Allows for the dynamic wrapping of objects in order to modify their existing responsibilities and behaviors. 

My understanding is that the decorator approach is more flexible than subclass inheritance. 
We can define each feature in each decorator class.

The key to the implementation approach is the Decorate class. 
The Decorate class receives an object of Component or its subclass through the constructor. 
The Decorate class inherits the Component interface and invokes the concrete decorator of object-level function. 

![image](https://github.com/haoping2046/DesignPattern/blob/main/img/decorator.png)
