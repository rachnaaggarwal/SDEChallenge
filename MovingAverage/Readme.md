#PaytmLabs SDE Challenge Coding Question - Answer

##Interface
Interface for the data structure is created as **com.test.paytm.challenge.coding.DataStore**.

It provides the ability to store elements, retrieve them by their index and provides the moving average of the last N elements added.

The interface is created as a generic type and parameterized typed implementations can be created for it.

##Implementation
One such implementation provided here is **com.test.paytm.challenge.coding.DoubleDataStore**.

It provides an implementation of DataStore for elements of type Double.

The implementation class will take N (size for the moving average) at the time of instantiation.

If N provided is less than or equal to zero, the moving average will not be provided. However, the data store
can still be used for adding and accessing the elements.

In this implementation, only non-null elements are allowed to be added since it doesn't make sense to return 
moving average of doubles with null elements in between. That being said, other implementations can be provided
that takes null elements as well.