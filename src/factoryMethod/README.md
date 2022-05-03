### FactoryMethod
1. The factory interface defines a method to create a product. Each implementation class implements this method that returns a specific product.
2. The abstract class of product defines behavior. Its subclasses which are concrete products will implement their methods.
3. The program first creates a certain factory, then use the object of a certain factory to create the product.
![image](https://github.com/haoping2046/DesignPattern/blob/main/img/factoryMethod.png)
