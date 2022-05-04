Permits classes with disparate interfaces to work together by creating a common object by which they may communicate and interact.

My understanding is the adapter pattern is a remediation strategy. 

The key to the implementation approach is the concrete adapter class. 
The concrete adapter class implements an old interface's function, and extends new implementation class of the new interface class 
to invoke its function.

![image](https://github.com/haoping2046/DesignPattern/blob/main/img/adapter1.png)

**The difference between Adapter and Decorator**
The adapter provides a different interface from the original interface. The decorator provides the same interface as the 
original class that adds functionality to an object.
